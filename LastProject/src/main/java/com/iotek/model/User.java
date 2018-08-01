package com.iotek.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by sakura¸¡³Á on 2018/7/26.
 */
public class User implements Serializable {
    private int id;
    private String uname;
    private String upass;
    private List<Resume> resumeList=new ArrayList<Resume>();
    public User() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User(String uname, String upass) {
        this.uname = uname;
        this.upass = upass;
    }

    public List<Resume> getResumeList() {
        return resumeList;
    }

    public void setResumeList(List<Resume> resumeList) {
        this.resumeList = resumeList;
    }

    public User(String uname) {
        this.uname = uname;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getUpass() {
        return upass;
    }

    public void setUpass(String upass) {
        this.upass = upass;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", uname='" + uname + '\'' +
                ", upass='" + upass + '\'' +
                '}';
    }
}
