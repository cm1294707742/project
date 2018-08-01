package com.iotek.controller;

import com.iotek.model.Interview;
import com.iotek.service.InterviewService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by sakura¸¡³Á on 2018/8/1.
 */
@Controller
public class InterviewController {
    @Resource
    private InterviewService interviewService;
    @RequestMapping("/showInterview")
    public String showInterview(@RequestParam(value = "currentPage",defaultValue = "1")int currentPage, HttpSession session){
        int iread=0;
        List<Interview> interviewList=interviewService.getInterview(iread);
        int pageSize = 5;
        int totalRows  = interviewList.size();
        int totalPages = totalRows%pageSize==0?totalRows/pageSize :totalRows/pageSize + 1;
        int begin = (currentPage-1)*pageSize+1;
        int end = (currentPage-1)*pageSize+pageSize;
        List<Interview> interviewList1=interviewService.getInterviewByPage(iread,begin,end);
        session.setAttribute("showInterviewByPage",interviewList1);
        session.setAttribute("currentPage",currentPage);
        session.setAttribute("totalPages",totalPages);
        return "showInterview";
    }
    @RequestMapping("/updateInterviewRead")
    public String updateInterviewRead(HttpSession session,Interview interview){
        interviewService.updateInterviewRead(interview);
        return "redirect:showInterview";
    }
    @RequestMapping("/updateInterviewInvite")
    public String updateInterviewInvite(HttpSession session,Interview interview){
        interviewService.updateInterviewRead(interview);
        return "redirect:showInterview";
    }
}
