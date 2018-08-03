package com.iotek.model;



import java.io.Serializable;
import java.util.Date;

/**
 * Created by sakura浮沉 on 2018/8/1.
 */
//等待面试
public class WaitInter implements Serializable {
    private int wiid;   //id
    private Rec rec;      //招聘id
    private Resume resume;   //简历id
    private Date witime;     //面试时间
    private String wiaddress;  //面试地点

    private User user;     //面试人员
    private  int wistate;   //用户是否接受面试，0为默认，管理员设置，1为接受，2为拒绝

    public int getWistate() {
        return wistate;
    }

    public void setWistate(int wistate) {
        this.wistate = wistate;
    }

    public WaitInter() {
    }

    public WaitInter(Rec rec, Resume resume, Date witime, String wiaddress, User user,int wistate) {
        this.rec = rec;
        this.resume = resume;
        this.witime = witime;
        this.wiaddress = wiaddress;
        this.user = user;
        this.wistate=wistate;
    }

    public int getWiid() {
        return wiid;
    }

    public void setWiid(int wiid) {
        this.wiid = wiid;
    }

    public Rec getRec() {
        return rec;
    }

    public void setRec(Rec rec) {
        this.rec = rec;
    }

    public Resume getResume() {
        return resume;
    }

    public void setResume(Resume resume) {
        this.resume = resume;
    }

    public Date getWitime() {
        return witime;
    }

    public void setWitime(Date witime) {
        this.witime = witime;
    }

    public String getWiaddress() {
        return wiaddress;
    }

    public void setWiaddress(String wiaddress) {
        this.wiaddress = wiaddress;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
