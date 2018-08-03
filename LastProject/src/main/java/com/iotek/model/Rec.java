package com.iotek.model;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by sakura���� on 2018/7/26.
 */
public class Rec implements Serializable {   //��Ƹ��
    private int rid;
    private String rname;
    private Department department;    //����
    private String rinformation;    //����
    private String rrequirements;   //Ҫ��
    private String raddress;      //�ϰ�ص�
    private String rsalary;    //н��
    private Date rtime;        //����ʱ��
    private int rcount;     //����
    private int rstate;     //�Ƿ񷢲���

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

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
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
