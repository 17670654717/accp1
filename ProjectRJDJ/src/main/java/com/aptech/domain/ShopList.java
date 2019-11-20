package com.aptech.domain;

public class ShopList {
    private Integer id;

    private String uaccount;

    private String shopName;

    private String address;

    private String province;

    private String city;

    private String district;

    private Integer employees;

    private String liaison;

    private Integer handset;

    private Integer phone;

    private String headSculpture;

    private String shopBrief;
    
    private Integer num_emp;

    @Override
	public String toString() {
		return "ShopList [id=" + id + ", uaccount=" + uaccount + ", shopName=" + shopName + ", address=" + address
				+ ", province=" + province + ", city=" + city + ", district=" + district + ", employees=" + employees
				+ ", liaison=" + liaison + ", handset=" + handset + ", phone=" + phone + ", headSculpture="
				+ headSculpture + ", shopBrief=" + shopBrief + ", num_emp=" + num_emp + "]";
	}

	public Integer getNum_emp() {
		return num_emp;
	}

	public void setNum_emp(Integer num_emp) {
		this.num_emp = num_emp;
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUaccount() {
        return uaccount;
    }

    public void setUaccount(String uaccount) {
        this.uaccount = uaccount;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public Integer getEmployees() {
        return employees;
    }

    public void setEmployees(Integer employees) {
        this.employees = employees;
    }

    public String getLiaison() {
        return liaison;
    }

    public void setLiaison(String liaison) {
        this.liaison = liaison;
    }

    public Integer getHandset() {
        return handset;
    }

    public void setHandset(Integer handset) {
        this.handset = handset;
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    public String getHeadSculpture() {
        return headSculpture;
    }

    public void setHeadSculpture(String headSculpture) {
        this.headSculpture = headSculpture;
    }

    public String getShopBrief() {
        return shopBrief;
    }

    public void setShopBrief(String shopBrief) {
        this.shopBrief = shopBrief;
    }
}