package com.iotek.model;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by sakura¸¡³Á on 2018/7/30.
 */
public class Employees implements Serializable {
    private int eid;
    private String ename;
    private String esex;
    private String eschool;
    private String eedu;
    private String etel;
    private String eemail;
    private String eexp;
    private Date egratime;
    private String eprofess;
    private String eintroduce;
    private Date ebirthday;
    private Department department;

    public Employees() {
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
