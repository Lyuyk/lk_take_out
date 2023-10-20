package com.lyuyk.lk.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lyuyk.lk.entity.Employee;
import com.lyuyk.lk.mapper.EmployeeMapper;
import com.lyuyk.lk.service.EmployeeService;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper, Employee> implements EmployeeService {
}
