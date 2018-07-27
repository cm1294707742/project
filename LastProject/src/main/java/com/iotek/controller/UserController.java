package com.iotek.controller;

import com.iotek.dao.RecMapper;
import com.iotek.model.Rec;
import com.iotek.model.User;
import com.iotek.service.RecService;
import com.iotek.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by sakura浮沉 on 2018/7/26.
 */
@Controller
public class UserController {
    @Resource
    private UserService userService;
    @Resource
    private RecService recService;
    @RequestMapping("/userLogin")
    public String login(User user, Model model, HttpSession session) throws Exception{
        if  (user.getUname()==null||user.getUpass()==null){
            model.addAttribute("str","用户名或密码不能为空");
        }
        User user1 = userService.getUserByNamePass(user);
        if (null!=user1){
            session.setAttribute("user",user1);
            return "success";
        }else {
            model.addAttribute("str","用户名或密码错误");
            return "userLogin";
        }
    }

    @RequestMapping("/userRegister")
    public String userRegister(User user,Model model,HttpSession session){
        if  (user.getUname()==null||user.getUpass()==null){
            model.addAttribute("str","用户名或密码不能为空");
        }
        User user1=userService.getUserByName(user);
        if (user1!=null){
            model.addAttribute("str","用户名重复");
            return "userRegister";
        }else {
            userService.addNewUser(user1);
            model.addAttribute("str","注册成功");
            return "userLogin";
        }
    }
    @RequestMapping("/")
    public String success(@RequestParam(value = "currentPage",defaultValue = "1")int currentPage, HttpSession session){
        int state=1;
        List<Rec> recList=recService.getRecByState(state);
        int pageSize = 5;
        int totalRows  = recList.size();
        int totalPages = totalRows%pageSize==0?totalRows/pageSize :totalRows/pageSize + 1;
        int begin = (currentPage-1)*pageSize+1;
        int end = (currentPage-1)*pageSize+pageSize;
        List<Rec> recList1=recService.getRecByPage(state,begin,end);
        session.setAttribute("showRecByPageRecList",recList1);
        session.setAttribute("currentPage",currentPage);
        session.setAttribute("totalPages",totalPages);
        return "success";
    }
}
