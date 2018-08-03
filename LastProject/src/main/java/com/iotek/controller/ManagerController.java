package com.iotek.controller;

import com.iotek.model.*;
import com.iotek.service.DepartmentService;
import com.iotek.service.InterviewService;
import com.iotek.service.ManagerService;
import com.iotek.service.WaitInterService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.List;

/**
 * Created by sakura浮沉 on 2018/7/31.
 */
@Controller
public class ManagerController {
    @Resource
    private ManagerService managerService;
    @Resource
    private InterviewService interviewService;
    @Resource
    private WaitInterService waitInterService;
    @Resource
    private DepartmentService departmentService;

    @RequestMapping("/managerLogin")
    public String managerLogin(Manager manager, HttpSession session, Model model){
        if  (manager.getMname()==null||manager.getMpass()==null){
            model.addAttribute("str","用户名或密码不能为空");
        }
       Manager manager1=managerService.getManagerByNamePass(manager);
        if (null!=manager1){
            session.setAttribute("user",manager1);
            return "managerSuccess";
        }else {
            model.addAttribute("str","用户名或密码错误");
            return "managerLogin";
        }
    }
    @RequestMapping("/sendWaitInter")
    public String sendWaitInter( HttpSession session, WaitInter waitInter){
       Interview interview= (Interview) session.getAttribute("interview");
       interview.setIread(1);
       interview.setIinvite(1);
       interviewService.updateInterviewRead(interview);
       interviewService.updateInterviewInvite(interview);  //将投递的简历进行查看和决定是否要求面试
       User user=interview.getUser();
       Rec rec=interview.getRec();
       Resume resume=interview.getResume();
       String address="公司大楼4楼";
        Date date=new Date();
       WaitInter waitInter1=new WaitInter(rec,resume,date,address,user,0);
       waitInterService.addNewWaitInterMapper(waitInter1);
       session.setAttribute("waitInter",waitInter1);  //生成面试通知
       return "managerSuccess";
    }
    @RequestMapping("/showWaitInter")
    public String showWaitInter(@RequestParam(value = "currentPage",defaultValue = "1")int currentPage, HttpSession session){
        List<WaitInter> waitInterList=waitInterService.getWaitInter();
        int pageSize = 5;
        int totalRows  = waitInterList.size();
        int totalPages = totalRows%pageSize==0?totalRows/pageSize :totalRows/pageSize + 1;
        int begin = (currentPage-1)*pageSize+1;
        int end = (currentPage-1)*pageSize+pageSize;
        List<WaitInter> waitInterList1=waitInterService.getWaitInterByPageManager(begin,end);
        session.setAttribute("waitInterByManager",waitInterList1);
        session.setAttribute("currentPage",currentPage);
        session.setAttribute("totalPages",totalPages);
        return "showWaitInter";
    }
    @RequestMapping("/employUser")
    public String employUser(HttpSession session){
        User user= (User) session.getAttribute("user");
        Resume resume= (Resume) session.getAttribute("resume");

        return null;
    }
    @RequestMapping("/showDepartment")
    public String showDepartment(@RequestParam(value = "currentPage",defaultValue = "1")int currentPage,HttpSession session,Model model){
        List<Department> departmentList=departmentService.getDepartment();
        int pageSize = 5;
        int totalRows  = departmentList.size();
        int totalPages = totalRows%pageSize==0?totalRows/pageSize :totalRows/pageSize + 1;
        int begin = (currentPage-1)*pageSize+1;
        int end = (currentPage-1)*pageSize+pageSize;
        List<Department> departmentList1=departmentService.getDepartmentByPage(begin,end);
        session.setAttribute("departmentList",departmentList1);
        session.setAttribute("currentPage",currentPage);
        session.setAttribute("totalPages",totalPages);
        return "showDepartment";
    }
    @RequestMapping("/addNewDepartment")
    public String addNewDepartment(HttpSession session,Department department){
        departmentService.addNewDepartment(department);
        return "redirect:showDepartment";
    }
    @RequestMapping("/deleteDepartment")
    public String deleteDepartment(Department department){
        departmentService.deleteDepartment(department);
        return "redirect:showDepartment";
    }
    @RequestMapping("/updateDepartment")
    public String updateDepartment(Department department){
        departmentService.updateDepartment(department);
        return "redirect:showDepartment";
    }
}
