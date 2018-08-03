package com.iotek.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by sakura浮沉 on 2018/7/26.
 */
public class User implements Serializable {
    private int id;     //用户id
    private String uname;    //用户账号
    private String upass;    //用户密码
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
