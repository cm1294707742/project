package com.iotek.service.impl;

import com.iotek.dao.InterviewMapper;
import com.iotek.model.Interview;
import com.iotek.service.InterviewService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by sakura¸¡³Á on 2018/8/1.
 */
@Service
public class InterviewServiceImpl implements InterviewService {
    @Resource
    private InterviewMapper interviewMapper;
    public List<Interview> getInterview(int read) {
        return interviewMapper.getInterview(read);
    }

    public List<Interview> getInterviewByPage(int read, int begin, int end) {
        return interviewMapper.getInterviewByPage(read,begin,end);
    }

    public void updateInterviewRead(Interview interview) {
         interviewMapper.updateInterviewRead(interview);
    }

    public void updateInterviewInvite(Interview interview) {
         interviewMapper.updateInterviewInvite(interview);
    }

    public void addNewInterview(Interview interview) {
        interviewMapper.addNewInterview(interview);
    }
}
