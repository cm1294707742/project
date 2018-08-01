package com.iotek.model;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by sakura浮沉 on 2018/7/26.
 */
public class Resume implements Serializable {   //用户简历类
    private int urid;
    private String urname;
    private String ursex;
    private String urnative;
    private String urschool;
    private String uredu;
    private String urtel;
    private Date urbirthday;
    private String uremail;
    private String urskills;
    private String urhobby;
    private String urexperience;
    private String urintroduce;
    private User user;

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
