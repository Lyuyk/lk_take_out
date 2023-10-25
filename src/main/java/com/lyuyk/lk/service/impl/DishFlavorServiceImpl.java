package com.lyuyk.lk.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lyuyk.lk.entity.DishFlavor;
import com.lyuyk.lk.mapper.DishFlavorMapper;
import com.lyuyk.lk.service.DishFlavorService;
import org.springframework.stereotype.Service;

@Service
public class DishFlavorServiceImpl extends ServiceImpl<DishFlavorMapper,DishFlavor> implements DishFlavorService {
}
