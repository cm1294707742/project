package com.iotek.model;

import java.io.Serializable;

/**
 * Created by sakura¸¡³Á on 2018/7/30.
 */
public class Manager implements Serializable {
    private int mid;
    private String mname;
    private String mpass;
    private Department department;

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Manager() {
    }

    public int getMid() {
        return mid;
    }

    public void setMid(int mid) {
        this.mid = mid;
    }

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname;
    }

    public String getMpass() {
        return mpass;
    }

    public void setMpass(String mpass) {
        this.mpass = mpass;
    }
}
