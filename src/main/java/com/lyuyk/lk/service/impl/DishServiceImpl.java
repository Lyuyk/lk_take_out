package com.lyuyk.lk.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lyuyk.lk.entity.Dish;
import com.lyuyk.lk.mapper.DishMapper;
import com.lyuyk.lk.service.DishService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class DishServiceImpl extends ServiceImpl<DishMapper, Dish> implements DishService {
}
