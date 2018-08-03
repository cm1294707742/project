package com.iotek.controller;

import com.iotek.model.Manager;
import com.iotek.model.Train;
import com.iotek.service.TrainService;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by sakura¸¡³Á on 2018/8/3.
 */
@Controller
public class TrainController {
    @Resource
    private TrainService trainService;
    @RequestMapping("/addNewTrain")
    public String addNewTrain(HttpSession session, Train train){
        trainService.addNewTrain(train);
        return "redirect:showTrainByManager";
    }
    @RequestMapping("/showTrainManager")
    public String showTrainManager(@RequestParam(value = "currentPage",defaultValue = "1")int currentPage,HttpSession session){
        int state=0;
        List<Train> trainList=trainService.getTrain(state);
        int pageSize = 5;
        int totalRows  = trainList.size();
        int totalPages = totalRows%pageSize==0?totalRows/pageSize :totalRows/pageSize + 1;
        int begin = (currentPage-1)*pageSize+1;
        int end = (currentPage-1)*pageSize+pageSize;
        List<Train> trainList1=trainService.getTrainByPages(state,begin,end);
        session.setAttribute("departmentList",trainList1);
        session.setAttribute("currentPageManager",currentPage);
        session.setAttribute("totalPagesManager",totalPages);
        return "showTrainManager";
    }
    @RequestMapping("/deleteTrain")
    public String deleteTrain(HttpSession session, Train train, Model model){
        trainService.deleteTrain(train);
        return "redirect:showTrainByManager";
    }
    @RequestMapping("/updateTrain")
    public String updateTrain(Train train,Model  model){
        trainService.updateTrain(train);
        return "redirect:showTrainByManager";
    }
    @RequestMapping("/showTrainEmployees")
    public String showTrainEmployees(@RequestParam(value = "currentPage",defaultValue = "1")int currentPage,HttpSession session){
        int state=1;
        List<Train> trainList=trainService.getTrain(state);
        int pageSize = 5;
        int totalRows  = trainList.size();
        int totalPages = totalRows%pageSize==0?totalRows/pageSize :totalRows/pageSize + 1;
        int begin = (currentPage-1)*pageSize+1;
        int end = (currentPage-1)*pageSize+pageSize;
        List<Train> trainList1=trainService.getTrainByPages(state,begin,end);
        session.setAttribute("departmentList",trainList1);
        session.setAttribute("currentPageEmployees",currentPage);
        session.setAttribute("totalPagesEmployees",totalPages);
        return "showTrainEmployees";
    }
}
