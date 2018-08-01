package com.iotek.model;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by sakura浮沉 on 2018/7/26.
 */
public class Rec implements Serializable {   //招聘类
    private int rid;
    private String rname;
    private String rdepartment;    //部门
    private String rinformation;    //描述
    private String rrequirements;   //要求
    private String raddress;      //上班地点
    private String rsalary;    //薪资
    private Date rtime;        //发布时间
    private int rcount;     //数量
    private int rstate;     //是否发布了

    public Rec() {
    }

    public int getRid() {
        return rid;
    }

    public void setRid(int rid) {
        this.rid = rid;
    }

    public String getRname() {
        return rname;
    }

    public void setRname(String rname) {
        this.rname = rname;
    }

    public String getRdepartment() {
        return rdepartment;
    }

    public void setRdepartment(String rdepartment) {
        this.rdepartment = rdepartment;
    }

    public String getRinformation() {
        return rinformation;
    }

    public void setRinformation(String rinformation) {
        this.rinformation = rinformation;
    }

    public String getRrequirements() {
        return rrequirements;
    }

    public void setRrequirements(String rrequirements) {
        this.rrequirements = rrequirements;
    }

    public String getRaddress() {
        return raddress;
    }

    public void setRaddress(String raddress) {
        this.raddress = raddress;
    }

    public String getRsalary() {
        return rsalary;
    }

    public void setRsalary(String rsalary) {
        this.rsalary = rsalary;
    }

    public Date getRtime() {
        return rtime;
    }

    public void setRtime(Date rtime) {
        this.rtime = rtime;
    }

    public int getRcount() {
        return rcount;
    }

    public void setRcount(int rcount) {
        this.rcount = rcount;
    }

    public int getRstate() {
        return rstate;
    }

    public void setRstate(int rstate) {
        this.rstate = rstate;
    }
}
