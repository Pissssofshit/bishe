package com.bishe.model;

import java.io.Serializable;
import java.util.Date;

public class Usercommentview implements Serializable {
    private Integer idu;

    private Integer id;

    private Integer uid;

    private Integer mid;

    private Date time;

    private Integer likes;

    private String username;

    private String message;

    private static final long serialVersionUID = 1L;

    public Integer getIdu() {
        return idu;
    }

    public void setIdu(Integer idu) {
        this.idu = idu;
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

    public Integer getMid() {
        return mid;
    }

    public void setMid(Integer mid) {
        this.mid = mid;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
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
        sb.append(", idu=").append(idu);
        sb.append(", id=").append(id);
        sb.append(", uid=").append(uid);
        sb.append(", mid=").append(mid);
        sb.append(", time=").append(time);
        sb.append(", likes=").append(likes);
        sb.append(", username=").append(username);
        sb.append(", message=").append(message);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}