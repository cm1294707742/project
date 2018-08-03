package com.iotek.controller;

import com.iotek.model.*;
import com.iotek.service.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
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
    @Resource
    private InterviewService interviewService;
    @Resource
    private WaitInterService waitInterService;
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
    public String sendResume(Resume resume,Rec rec,HttpSession session, Model model){
            User user= (User) session.getAttribute("user");
            Rec rec1=recService.getRecById(rec);

            if (user==null){
                return "userlogin";
            }else {
                session.setAttribute("rec",rec1);
               // session.setAttribute("resume",resume1);
                return "chooseResume";
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
    @RequestMapping("/chooseResume")
    public String chooseResuem(HttpSession session,Model model,Resume resume){
        Resume resume1=resumeService.getResumeByRid(resume);
        Rec rec= (Rec) session.getAttribute("rec");
        User user= (User) session.getAttribute("user");

        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date=new Date();
        Interview interview=new Interview(user,rec,resume1,date,0,0);
        interviewService.addNewInterview(interview);
        session.setAttribute("interview",interview);
        return "../../success";
    }
    @RequestMapping("/showUserInter")
    public String showUserInter(@RequestParam(value = "currentPage",defaultValue = "1")int currentPage,HttpSession session) throws IOException {
        User user= (User) session.getAttribute("user");
        List<WaitInter> waitInterList=waitInterService.getWaitInterByUser(user);
        int pageSize = 5;
        int totalRows  = waitInterList.size();
        int totalPages = totalRows%pageSize==0?totalRows/pageSize :totalRows/pageSize + 1;
        int begin = (currentPage-1)*pageSize+1;
        int end = (currentPage-1)*pageSize+pageSize;
        List<WaitInter> waitInterList1=waitInterService.getWaitInterByPage(user.getId(),begin,end);
        session.setAttribute("waitInterByUser",waitInterList1);
        session.setAttribute("currentPage",currentPage);
        session.setAttribute("totalPages",totalPages);
        return "showUserInter";
    }
    @RequestMapping("/acceptInter")
    public String acceptInter(HttpServletResponse response,WaitInter waitInter) throws IOException {
        WaitInter waitInter1=waitInterService.getWaitInterById(waitInter);
        if (waitInter.getWistate()!=0){
            response.getWriter().print("你已经回复了这份面试，不能再次回复!");
        }else {
            waitInter1.setWistate(1);
            waitInterService.updateWaitInterWistate(waitInter1);
            response.getWriter().print("你已经接受面试，请做好准备。");
        }
        return "redirect:showUserInter";
    }
    @RequestMapping("/refuseInter")
    public String refuseInter(HttpServletResponse response,WaitInter waitInter) throws IOException {
        WaitInter waitInter1=waitInterService.getWaitInterById(waitInter);
        if (waitInter.getWistate()!=0){
            response.getWriter().print("你已经回复了这份面试，不能再次回复!");
        }else {
            waitInter1.setWistate(2);
            waitInterService.updateWaitInterWistate(waitInter1);
            response.getWriter().print("你已经接受面试，请做好准备。");
        }
        return "redirect:showUserInter";
    }
}
