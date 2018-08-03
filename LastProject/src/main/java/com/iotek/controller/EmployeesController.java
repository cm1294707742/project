package com.iotek.controller;

import com.iotek.service.EmployeesService;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

/**
 * Created by sakura¸¡³Á on 2018/7/31.
 */
@Controller
public class EmployeesController {
    @Resource
    private EmployeesService employeesService;

}
