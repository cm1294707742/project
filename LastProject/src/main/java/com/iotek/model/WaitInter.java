package com.iotek.model;



import java.io.Serializable;
import java.util.Date;

/**
 * Created by sakura¸¡³Á on 2018/8/1.
 */
public class WaitInter implements Serializable {
    private int wiid;
    private Rec rec;
    private Resume resume;
    private Date witime;
    private String wiaddress;
    private Employees employees;
    private User user;

    public WaitInter() {
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

    public Employees getEmployees() {
        return employees;
    }

    public void setEmployees(Employees employees) {
        this.employees = employees;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
