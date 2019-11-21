package com.aptech.domain;

import java.util.Date;

public class Employee {
    private Integer id;

    private Integer shopId;

    private Integer positionId;

    private String jobnumber;

    private String employeeName;

    private String employeePwd;

    private Integer status;

    private Date createtime;

    private String shopName;

    private String jobTitle;

	
    @Override
	public String toString() {
		return "Employee [id=" + id + ", shopId=" + shopId + ", positionId=" + positionId + ", jobnumber=" + jobnumber
				+ ", employeeName=" + employeeName + ", employeePwd=" + employeePwd + ", status=" + status
				+ ", createtime=" + createtime + ", shopName=" + shopName + ", jobTitle=" + jobTitle + "]";
	}

	public String getShopName() {
		return shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	
	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getShopId() {
        return shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    public Integer getPositionId() {
        return positionId;
    }

    public void setPositionId(Integer positionId) {
        this.positionId = positionId;
    }

    public String getJobnumber() {
        return jobnumber;
    }

    public void setJobnumber(String jobnumber) {
        this.jobnumber = jobnumber;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeePwd() {
        return employeePwd;
    }

    public void setEmployeePwd(String employeePwd) {
        this.employeePwd = employeePwd;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
}