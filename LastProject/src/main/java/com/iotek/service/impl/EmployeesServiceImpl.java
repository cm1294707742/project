package com.iotek.service.impl;

import com.iotek.dao.EmployeesMapper;
import com.iotek.service.EmployeesService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by sakura¸¡³Á on 2018/7/31.
 */
@Service
public class EmployeesServiceImpl implements EmployeesService {
    @Resource
    private EmployeesMapper employeesMapper;
}
