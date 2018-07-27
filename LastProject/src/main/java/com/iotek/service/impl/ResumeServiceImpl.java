package com.iotek.service.impl;

import com.iotek.dao.ResumeMapper;
import com.iotek.model.Resume;
import com.iotek.model.User;
import com.iotek.service.ResumeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by sakura¸¡³Á on 2018/7/26.
 */
@Service
public class ResumeServiceImpl implements ResumeService {
    @Resource
    private ResumeMapper resumeMapper;
    public void addNewResume(Resume resume) {
        resumeMapper.addNewResume(resume);
    }

    public void deleteResume(Resume resume) {
        resumeMapper.deleteResume(resume);
    }

    public List<Resume> getResumeByUser(User user) {
        return resumeMapper.getResumeByUser(user);
    }

    public List<Resume> getResumeByPage(int uid, int begin, int end) {
        return resumeMapper.getResumeByPage(uid,begin,end);
    }

    public void updateResume(Resume resume) {
        resumeMapper.updateResume(resume);
    }
}
