package com.aptech.domain;

import java.util.Date;

public class Purchasenote {
    private Integer purchaseid;

    private Date deliveryTime;

    private Integer supplierid;

    private String lister;

    private String remark;

    public Integer getPurchaseid() {
        return purchaseid;
    }

    public void setPurchaseid(Integer purchaseid) {
        this.purchaseid = purchaseid;
    }

    public Date getDeliveryTime() {
        return deliveryTime;
    }

    public void setDeliveryTime(Date deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    public Integer getSupplierid() {
        return supplierid;
    }

    public void setSupplierid(Integer supplierid) {
        this.supplierid = supplierid;
    }

    public String getLister() {
        return lister;
    }

    public void setLister(String lister) {
        this.lister = lister;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}