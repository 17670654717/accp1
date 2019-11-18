package com.aptech.domain;

import java.util.Date;

public class Viprecharge {
    private Integer id;

    private Date rechargeTime;

    private String microsignal;

    private String vipid;

    private Integer recharge;

    private Integer donate;

    private Integer balance;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getRechargeTime() {
        return rechargeTime;
    }

    public void setRechargeTime(Date rechargeTime) {
        this.rechargeTime = rechargeTime;
    }

    public String getMicrosignal() {
        return microsignal;
    }

    public void setMicrosignal(String microsignal) {
        this.microsignal = microsignal;
    }

    public String getVipid() {
        return vipid;
    }

    public void setVipid(String vipid) {
        this.vipid = vipid;
    }

    public Integer getRecharge() {
        return recharge;
    }

    public void setRecharge(Integer recharge) {
        this.recharge = recharge;
    }

    public Integer getDonate() {
        return donate;
    }

    public void setDonate(Integer donate) {
        this.donate = donate;
    }

    public Integer getBalance() {
        return balance;
    }

    public void setBalance(Integer balance) {
        this.balance = balance;
    }
}