package com.iotek.service;

import com.iotek.model.Resume;
import com.iotek.model.User;

import java.util.List;

/**
 * Created by sakura¸¡³Á on 2018/7/26.
 */
public interface ResumeService {
    void addNewResume(Resume resume);
    void deleteResume(Resume resume);
    List<Resume> getResumeByUser(User user);
    List<Resume> getResumeByPage(int uid,int begin, int end);
    void updateResume(Resume resume);
    Resume getResumeByRid(Resume resume);
}
