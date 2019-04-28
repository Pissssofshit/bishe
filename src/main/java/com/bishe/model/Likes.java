package com.bishe.model;

import java.io.Serializable;
import java.util.Date;

public class Likes implements Serializable {
    private Integer id;

    private Integer post;

    private Integer by;

    private Integer type;

    private Date time;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPost() {
        return post;
    }

    public void setPost(Integer post) {
        this.post = post;
    }

    public Integer getBy() {
        return by;
    }

    public void setBy(Integer by) {
        this.by = by;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", post=").append(post);
        sb.append(", by=").append(by);
        sb.append(", type=").append(type);
        sb.append(", time=").append(time);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}