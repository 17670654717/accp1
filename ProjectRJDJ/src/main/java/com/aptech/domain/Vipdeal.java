package com.aptech.domain;

import java.util.Date;

public class Vipdeal {
    private Integer id;

    private String vipOrderNumber;

    private Integer num;

    private Float money;

    private String modePayment;

    private Date dealtime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getVipOrderNumber() {
        return vipOrderNumber;
    }

    public void setVipOrderNumber(String vipOrderNumber) {
        this.vipOrderNumber = vipOrderNumber;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Float getMoney() {
        return money;
    }

    public void setMoney(Float money) {
        this.money = money;
    }

    public String getModePayment() {
        return modePayment;
    }

    public void setModePayment(String modePayment) {
        this.modePayment = modePayment;
    }

    public Date getDealtime() {
        return dealtime;
    }

    public void setDealtime(Date dealtime) {
        this.dealtime = dealtime;
    }
}