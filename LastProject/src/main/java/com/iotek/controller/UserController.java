package com.iotek.controller;

import com.iotek.model.Rec;
import com.iotek.model.Resume;
import com.iotek.model.User;
import com.iotek.service.RecService;
import com.iotek.service.ResumeService;
import com.iotek.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
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
    @Resource
    private ResumeService resumeService;
    @RequestMapping("/userLogin")
    public String login(User user, Model model, HttpSession session) throws Exception{
        if  (user.getUname()==null||user.getUpass()==null){
            model.addAttribute("str","用户名或密码不能为空");
        }
        User user1 = userService.getUserByNamePass(user);
        if (null!=user1){
            session.setAttribute("user",user1);
            return "/success.jsp";
        }else {
            model.addAttribute("str","用户名或密码错误");
            return "/userLogin.jsp";
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
            return "/userLogin.jsp";
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
        return "/success";
    }

    @RequestMapping("/sendResume")
    public String sendResume(HttpSession session, Model model){
            User user= (User) session.getAttribute("user");
            if (user==null){
                return "login";
            }else {
                return "showUserResume";
            }
    }
    @RequestMapping("/showUserResume")
    public String showUserResume(@RequestParam(value = "currentPage",defaultValue = "1")int currentPage, HttpSession session){
        User user= (User) session.getAttribute("user");
        List<Resume> resumeList=resumeService.getResumeByUser(user);
        int pageSize = 2;
        int totalRows  = resumeList.size();
        int totalPages = totalRows%pageSize==0?totalRows/pageSize :totalRows/pageSize + 1;
        int begin = (currentPage-1)*pageSize+1;
        int end = (currentPage-1)*pageSize+pageSize;
        List<Resume> resumeList1=resumeService.getResumeByPage(user.getId(),begin,end);
        session.setAttribute("showResumeByPageRecList",resumeList1);
        session.setAttribute("currentPage",currentPage);
        session.setAttribute("totalPages",totalPages);
        System.out.println("+++++++++  success");
        return "../../success";
    }
}
