package com.iotek.controller;

import com.iotek.model.Manager;
import com.iotek.service.InterviewService;
import com.iotek.service.ManagerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

/**
 * Created by sakura���� on 2018/7/31.
 */
@Controller
public class ManagerController {
    @Resource
    private ManagerService managerService;
    @Resource
    private InterviewService interviewService;
    @RequestMapping("/managerLogin")
    public String managerLogin(Manager manager, HttpSession session, Model model){
        if  (manager.getMname()==null||manager.getMpass()==null){
            model.addAttribute("str","�û��������벻��Ϊ��");
        }
       Manager manager1=managerService.getManagerByNamePass(manager);
        if (null!=manager1){
            session.setAttribute("user",manager1);
            return "/managerSuccess.jsp";
        }else {
            model.addAttribute("str","�û������������");
            return "/managerLogin.jsp";
        }
    }

}
