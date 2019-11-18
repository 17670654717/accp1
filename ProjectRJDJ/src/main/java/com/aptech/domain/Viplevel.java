package com.aptech.domain;

public class Viplevel {
    private Integer id;

    private String viplevelName;

    private Integer discount;

    private Integer condition;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getViplevelName() {
        return viplevelName;
    }

    public void setViplevelName(String viplevelName) {
        this.viplevelName = viplevelName;
    }

    public Integer getDiscount() {
        return discount;
    }

    public void setDiscount(Integer discount) {
        this.discount = discount;
    }

    public Integer getCondition() {
        return condition;
    }

    public void setCondition(Integer condition) {
        this.condition = condition;
    }
}