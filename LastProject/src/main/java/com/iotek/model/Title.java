package com.iotek.model;

import java.io.Serializable;

/**
 * Created by sakura浮沉 on 2018/8/3.
 */
//职位表
public class Title implements Serializable {
    private int tid;
    private String tname;      //职位名称
    private Department department;    //所属部门
    private double tsalary;         //薪资

    public Title() {
    }

    public int getTid() {
        return tid;
    }

    public void setTid(int tid) {
        this.tid = tid;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public double getTsalary() {
        return tsalary;
    }

    public void setTsalary(double tsalary) {
        this.tsalary = tsalary;
    }

    @Override
    public String toString() {
        return "Title{" +
                "tid=" + tid +
                ", tname='" + tname + '\'' +
                ", department=" + department +
                ", tsalary=" + tsalary +
                '}';
    }
}
