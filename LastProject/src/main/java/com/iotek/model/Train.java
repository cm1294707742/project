package com.iotek.model;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by sakura���� on 2018/8/3.
 */

//��ѵ��
public class Train implements Serializable {
    private int trid;                   //id
    private String trname;               //��ѵ����
    private String trcoutent;           //��ѵ����
    private Date trstart;              //��ѵ��ʼʱ��
    private Date trend;               //��ѵ����ʱ��
    private String traddress;        //��ѵ�ص�
    private Date trtime;             //��ѵ����ʱ��
    private int trstate;            //����״̬��0λû�з�����1λ�Ѿ�����

    public Train() {
    }

    public int getTrid() {
        return trid;
    }

    public void setTrid(int trid) {
        this.trid = trid;
    }

    public String getTrname() {
        return trname;
    }

    public void setTrname(String trname) {
        this.trname = trname;
    }

    public String getTrcoutent() {
        return trcoutent;
    }

    public void setTrcoutent(String trcoutent) {
        this.trcoutent = trcoutent;
    }

    public Date getTrstart() {
        return trstart;
    }

    public void setTrstart(Date trstart) {
        this.trstart = trstart;
    }

    public Date getTrend() {
        return trend;
    }

    public void setTrend(Date trend) {
        this.trend = trend;
    }

    public String getTraddress() {
        return traddress;
    }

    public void setTraddress(String traddress) {
        this.traddress = traddress;
    }

    public Date getTrtime() {
        return trtime;
    }

    public void setTrtime(Date trtime) {
        this.trtime = trtime;
    }

    public int getTrstate() {
        return trstate;
    }

    public void setTrstate(int trstate) {
        this.trstate = trstate;
    }
}
