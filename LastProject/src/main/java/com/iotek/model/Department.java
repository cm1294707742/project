package com.iotek.model;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by sakura浮沉 on 2018/7/30.
 */
public class Department implements Serializable {
    private int did;
    private String dname;
    private Date dtime;   //部门创建时间

    public Department() {
    }

    public int getDid() {
        return did;
    }

    public void setDid(int did) {
        this.did = did;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public Date getDtime() {
        return dtime;
    }

    public void setDtime(Date dtime) {
        this.dtime = dtime;
    }
}
