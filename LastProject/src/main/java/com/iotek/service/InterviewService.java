package com.iotek.service;

import com.iotek.model.Interview;

import java.util.List;

/**
 * Created by sakura¸¡³Á on 2018/8/1.
 */
public interface InterviewService {
    List<Interview> getInterview(int read);
    List<Interview> getInterviewByPage(int read, int begin, int end );
    void updateInterviewRead(Interview interview);
    void updateInterviewInvite(Interview interview);
}
