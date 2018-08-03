package com.iotek.model;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by sakura浮沉 on 2018/8/3.
 */

//培训表
public class Train implements Serializable {
    private int trid;                   //id
    private String trname;               //培训名字
    private String trcoutent;           //培训内容
    private Date trstart;              //培训开始时间
    private Date trend;               //培训结束时间
    private String traddress;        //培训地点
    private Date trtime;             //培训发布时间
    private int trstate;            //发布状态，0位没有发布，1位已经发布

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
