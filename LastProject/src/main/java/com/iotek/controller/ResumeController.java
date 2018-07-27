package com.iotek.controller;

import com.iotek.model.Resume;
import com.iotek.model.User;
import com.iotek.service.ResumeService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by sakura¸¡³Á on 2018/7/26.
 */
@Controller
public class ResumeController {
    @Resource
    private ResumeService resumeService;
    @RequestMapping("/addNewResume")
    public String addNewResume(Resume resume, HttpSession session){
        resumeService.addNewResume(resume);
        return "redirect:showResume";
    }
    @RequestMapping("/deleteResume")
    public String deleteResume(Resume resume,HttpSession session){
        resumeService.deleteResume(resume);
        return "redirect:showResume";
    }
    @RequestMapping("/updateResume")
    public String updateResume(Resume resume,HttpSession session){
        resumeService.updateResume(resume);
        return "redirect:showResume";
    }
    @RequestMapping("/showResume")
    public String showResume(@RequestParam(value = "currentPage",defaultValue = "1")int currentPage, HttpSession session){
        User user= (User) session.getAttribute("user");
        List<Resume> resumeList=resumeService.getResumeByUser(user);
        int pageSize = 5;
        int totalRows  = resumeList.size();
        int totalPages = totalRows%pageSize==0?totalRows/pageSize :totalRows/pageSize + 1;
        int begin = (currentPage-1)*pageSize+1;
        int end = (currentPage-1)*pageSize+pageSize;
        List<Resume> resumeList1=resumeService.getResumeByPage(user.getId(),begin,end);
        session.setAttribute("showResumeByPageResumeList",resumeList1);
        session.setAttribute("currentPage",currentPage);
        session.setAttribute("totalPages",totalPages);
        return "showResume";
    }
}
