package com.lyuyk.lk.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lyuyk.lk.common.CustomException;
import com.lyuyk.lk.entity.Category;
import com.lyuyk.lk.entity.Dish;
import com.lyuyk.lk.entity.Setmeal;
import com.lyuyk.lk.mapper.CategoryMapper;
import com.lyuyk.lk.service.CategoryService;
import com.lyuyk.lk.service.DishService;
import com.lyuyk.lk.service.SetmealService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.print.attribute.SetOfIntegerSyntax;

@Service
public class CategoryServiceImpl extends ServiceImpl<CategoryMapper, Category> implements CategoryService {
    @Autowired
    private DishService dishService;

    private SetmealService setmealService;
    /**
     * 根据ID删除
     * @param id
     */
    @Override
    public void remove(Long id) {
        LambdaQueryWrapper<Dish> dishLambdaQueryWrapper = new LambdaQueryWrapper<>();

        dishLambdaQueryWrapper.eq(Dish::getCategoryId,id);
        int count = dishService.count(dishLambdaQueryWrapper);

        if(count>0){
            throw new CustomException("当前分类下关联了菜品，不能删除");
        }

        LambdaQueryWrapper<Setmeal> setmealLambdaQueryWrapper = new LambdaQueryWrapper<>();

        setmealLambdaQueryWrapper.eq(Setmeal::getCategoryId,id);
        int count2 = setmealService.count();
        if(count2>0){
            throw new CustomException("当前分类下关联了套餐，不能删除");
        }
        super.removeById(id);
        }
}
