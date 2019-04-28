package com.bishe.model;

import java.io.Serializable;
import java.util.Date;

public class Usermessageview implements Serializable {
    private String username;

    private Integer id;

    private Integer uid;

    private String tag;

    private String type;

    private String value;

    private Integer group;

    private Integer page;

    private Date time;

    private Integer public_state;

    private Integer likes;

    private Double longitude;

    private Double latitude;

    private Byte isPushed;

    private String message;

    private static final long serialVersionUID = 1L;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag == null ? null : tag.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value == null ? null : value.trim();
    }

    public Integer getGroup() {
        return group;
    }

    public void setGroup(Integer group) {
        this.group = group;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Integer getPublic_state() {
        return public_state;
    }

    public void setPublic_state(Integer public_state) {
        this.public_state = public_state;
    }

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Byte getIsPushed() {
        return isPushed;
    }

    public void setIsPushed(Byte isPushed) {
        this.isPushed = isPushed;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message == null ? null : message.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", username=").append(username);
        sb.append(", id=").append(id);
        sb.append(", uid=").append(uid);
        sb.append(", tag=").append(tag);
        sb.append(", type=").append(type);
        sb.append(", value=").append(value);
        sb.append(", group=").append(group);
        sb.append(", page=").append(page);
        sb.append(", time=").append(time);
        sb.append(", public_state=").append(public_state);
        sb.append(", likes=").append(likes);
        sb.append(", longitude=").append(longitude);
        sb.append(", latitude=").append(latitude);
        sb.append(", isPushed=").append(isPushed);
        sb.append(", message=").append(message);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}