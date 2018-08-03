package com.iotek.model;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by sakura浮沉 on 2018/7/26.
 */
public class Resume implements Serializable {   //用户简历类
    private int urid;               //简历id
    private String urname;        //简历姓名
    private String ursex;        //性别
    private String urnative;     //籍贯
    private String urschool;      //毕业学校
    private String uredu;         //学历
    private String urtel;          //电话
    private Date urbirthday;      //出生年月
    private String uremail;        //邮箱
    private String urskills;        //个人技能
    private String urhobby;         //爱好
    private String urexperience;    //工作经验
    private String urintroduce;      //个人介绍
    private User user;               //用户id

    public Resume() {
    }

    public int getUrid() {
        return urid;
    }

    public void setUrid(int urid) {
        this.urid = urid;
    }

    public String getUrname() {
        return urname;
    }

    public void setUrname(String urname) {
        this.urname = urname;
    }

    public String getUrsex() {
        return ursex;
    }

    public void setUrsex(String ursex) {
        this.ursex = ursex;
    }

    public String getUrnative() {
        return urnative;
    }

    public void setUrnative(String urnative) {
        this.urnative = urnative;
    }

    public String getUrschool() {
        return urschool;
    }

    public void setUrschool(String urschool) {
        this.urschool = urschool;
    }

    public String getUredu() {
        return uredu;
    }

    public void setUredu(String uredu) {
        this.uredu = uredu;
    }

    public String getUrtel() {
        return urtel;
    }

    public void setUrtel(String urtel) {
        this.urtel = urtel;
    }

    public Date getUrbirthday() {
        return urbirthday;
    }

    public void setUrbirthday(Date urbirthday) {
        this.urbirthday = urbirthday;
    }

    public String getUremail() {
        return uremail;
    }

    public void setUremail(String uremail) {
        this.uremail = uremail;
    }

    public String getUrskills() {
        return urskills;
    }

    public void setUrskills(String urskills) {
        this.urskills = urskills;
    }

    public String getUrhobby() {
        return urhobby;
    }

    public void setUrhobby(String urhobby) {
        this.urhobby = urhobby;
    }

    public String getUrexperience() {
        return urexperience;
    }

    public void setUrexperience(String urexperience) {
        this.urexperience = urexperience;
    }

    public String getUrintroduce() {
        return urintroduce;
    }

    public void setUrintroduce(String urintroduce) {
        this.urintroduce = urintroduce;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
