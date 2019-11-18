package com.aptech.domain;

public class PositionAuthority {
    private Integer id;

    private Integer positionId;

    private String permissions2Id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPositionId() {
        return positionId;
    }

    public void setPositionId(Integer positionId) {
        this.positionId = positionId;
    }

    public String getPermissions2Id() {
        return permissions2Id;
    }

    public void setPermissions2Id(String permissions2Id) {
        this.permissions2Id = permissions2Id;
    }
}