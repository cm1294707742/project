package com.iotek.model;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by sakura���� on 2018/8/1.
 */
public class Interview implements Serializable {
    private int iid;
    private User user;
    private Rec rec;
    private Resume resume;
    private Date itime;
    private int iread;     //0Ϊû�п���1Ϊ�Ѿ�������
    private int iinvite;   //0�����������Ի��ᣬ1��������Ի���

    public Interview() {
    }

    public int getIid() {
        return iid;
    }

    public void setIid(int iid) {
        this.iid = iid;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
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

    public Date getItime() {
        return itime;
    }

    public void setItime(Date itime) {
        this.itime = itime;
    }

    public int getIread() {
        return iread;
    }

    public void setIread(int iread) {
        this.iread = iread;
    }

    public int getIinvite() {
        return iinvite;
    }

    public void setIinvite(int iinvite) {
        this.iinvite = iinvite;
    }
}
