package com.bishe.model;

import java.io.Serializable;

public class Article implements Serializable {
    private Integer id;

    private String title;

    private String content;

    private Integer daytime;

    private Integer operatetime;

    private Integer longitude;

    private Integer latitude;

    private Integer authorid;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Integer getDaytime() {
        return daytime;
    }

    public void setDaytime(Integer daytime) {
        this.daytime = daytime;
    }

    public Integer getOperatetime() {
        return operatetime;
    }

    public void setOperatetime(Integer operatetime) {
        this.operatetime = operatetime;
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

    public Integer getAuthorid() {
        return authorid;
    }

    public void setAuthorid(Integer authorid) {
        this.authorid = authorid;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", title=").append(title);
        sb.append(", content=").append(content);
        sb.append(", daytime=").append(daytime);
        sb.append(", operatetime=").append(operatetime);
        sb.append(", longitude=").append(longitude);
        sb.append(", latitude=").append(latitude);
        sb.append(", authorid=").append(authorid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}