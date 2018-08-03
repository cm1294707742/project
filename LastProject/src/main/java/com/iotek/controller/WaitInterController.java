package com.iotek.controller;

import com.iotek.model.Manager;
import com.iotek.model.WaitInter;
import com.iotek.service.WaitInterService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

/**
 * Created by sakura¸¡³Á on 2018/8/1.
 */
@Controller
public class WaitInterController {
    @Resource
    private WaitInterService waitInterService;
    @RequestMapping("/addNewWaitInter")
    public String addNewWaitInter(WaitInter waitInter, HttpSession session, Manager manager, Model model){
        waitInterService.addNewWaitInterMapper(waitInter);
        return "showWaitInter";
    }
}
