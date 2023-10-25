package com.lyuyk.lk.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lyuyk.lk.entity.Category;
import com.lyuyk.lk.mapper.CategoryMapper;
import com.lyuyk.lk.service.CategoryService;
import org.springframework.stereotype.Service;

@Service
public class CategoryServiceImpl extends ServiceImpl<CategoryMapper, Category> implements CategoryService {
}
