package com.iotek.model;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by sakura���� on 2018/8/1.
 */
//���Ա�
public class Interview implements Serializable {
    private int iid;           //����id
    private User user;         //������
    private Rec rec;            //��Ƹ��Ϣ
    private Resume resume;       //����
    private Date itime;         //Ͷ�ݼ���ʱ��
    private int iread;     //0Ϊû�п���1Ϊ�Ѿ�������,Ĭ��Ϊ0
    private int iinvite;   //0�����������Ի��ᣬ1��������Ի��ᣬĬ��Ϊ0

    public Interview() {
    }

    public Interview(User user, Rec rec, Resume resume, Date itime, int iread, int iinvite) {
        this.user = user;
        this.rec = rec;
        this.resume = resume;
        this.itime = itime;
        this.iread = iread;
        this.iinvite = iinvite;
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
