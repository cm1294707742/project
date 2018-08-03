package com.iotek.model;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by sakura浮沉 on 2018/7/30.
 */
//员工表
public class Employees implements Serializable {
    private int eid;        //员工id
    private String ename;      //员工姓名
    private String esex;   //性别
    private String eschool;  //毕业学校
    private String eedu;   //学历
    private String etel;      //电话
    private String eemail;    //邮箱
    private String eexp;    //工作经验
    private Date egratime;   //录用时间
    private String eprofess;      //专业
    private String eintroduce;      //个人介绍
    private Date ebirthday;       //出生年月
    private Department department;    //部门
    private Title title;           //职称

    public Employees() {
    }

    public Title getTitle() {
        return title;
    }

    public void setTitle(Title title) {
        this.title = title;
    }

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getEsex() {
        return esex;
    }

    public void setEsex(String esex) {
        this.esex = esex;
    }

    public String getEschool() {
        return eschool;
    }

    public void setEschool(String eschool) {
        this.eschool = eschool;
    }

    public String getEedu() {
        return eedu;
    }

    public void setEedu(String eedu) {
        this.eedu = eedu;
    }

    public String getEtel() {
        return etel;
    }

    public void setEtel(String etel) {
        this.etel = etel;
    }

    public String getEemail() {
        return eemail;
    }

    public void setEemail(String eemail) {
        this.eemail = eemail;
    }

    public String getEexp() {
        return eexp;
    }

    public void setEexp(String eexp) {
        this.eexp = eexp;
    }

    public Date getEgratime() {
        return egratime;
    }

    public void setEgratime(Date egratime) {
        this.egratime = egratime;
    }

    public String getEprofess() {
        return eprofess;
    }

    public void setEprofess(String eprofess) {
        this.eprofess = eprofess;
    }

    public String getEintroduce() {
        return eintroduce;
    }

    public void setEintroduce(String eintroduce) {
        this.eintroduce = eintroduce;
    }

    public Date getEbirthday() {
        return ebirthday;
    }

    public void setEbirthday(Date ebirthday) {
        this.ebirthday = ebirthday;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}
