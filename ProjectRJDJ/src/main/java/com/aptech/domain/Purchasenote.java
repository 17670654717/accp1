package com.aptech.domain;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Purchasenote {
    private String purchaseid;
    @JsonFormat(pattern="yyyy-MM-dd")
    private Date deliverytime;

    private Integer supplierid;

    private String lister;

    private String remark;
  private float aggregateamount;
  private int totalquantity;
  private String Supplier2;
  public List<Particulars> jb;
public List<Particulars> getJb() {
	return jb;
}
public void setJb(List<Particulars> jb) {
	this.jb = jb;
}
public String getPurchaseid() {
	return purchaseid;
}
public void setPurchaseid(String purchaseid) {
	this.purchaseid = purchaseid;
}
public Date getDeliverytime() {
	return deliverytime;
}
public void setDeliverytime(Date deliverytime) {
	this.deliverytime = deliverytime;
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
public float getAggregateamount() {
	return aggregateamount;
}
public void setAggregateamount(float aggregateamount) {
	this.aggregateamount = aggregateamount;
}
public int getTotalquantity() {
	return totalquantity;
}
public void setTotalquantity(int totalquantity) {
	this.totalquantity = totalquantity;
}
public String getSupplier2() {
	return Supplier2;
}
public void setSupplier2(String supplier2) {
	Supplier2 = supplier2;
}
   
}