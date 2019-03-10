package com.bishe.model;

import java.io.Serializable;

public class UserLog implements Serializable {
    private Integer id;

    private Integer operatetime;

    private Integer daytime;

    private Integer type;

    private Integer relatedid;

    private Integer attitude;

    private Integer longitude;

    private Integer latitude;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOperatetime() {
        return operatetime;
    }

    public void setOperatetime(Integer operatetime) {
        this.operatetime = operatetime;
    }

    public Integer getDaytime() {
        return daytime;
    }

    public void setDaytime(Integer daytime) {
        this.daytime = daytime;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getRelatedid() {
        return relatedid;
    }

    public void setRelatedid(Integer relatedid) {
        this.relatedid = relatedid;
    }

    public Integer getAttitude() {
        return attitude;
    }

    public void setAttitude(Integer attitude) {
        this.attitude = attitude;
    }

    public Integer getLongitude() {
        return longitude;
    }

    public void setLongitude(Integer longitude) {
        this.longitude = longitude;
    }

    public Integer getLatitude() {
        return latitude;
    }

    public void setLatitude(Integer latitude) {
        this.latitude = latitude;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", operatetime=").append(operatetime);
        sb.append(", daytime=").append(daytime);
        sb.append(", type=").append(type);
        sb.append(", relatedid=").append(relatedid);
        sb.append(", attitude=").append(attitude);
        sb.append(", longitude=").append(longitude);
        sb.append(", latitude=").append(latitude);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}