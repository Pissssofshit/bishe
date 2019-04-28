package com.bishe.model;

import java.io.Serializable;
import java.util.Date;

public class Groups implements Serializable {
    private Integer id;

    private String name;

    private String title;

    private String cover;

    private Integer privacy;

    private Integer posts;

    private Date time;

    private String description;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover == null ? null : cover.trim();
    }

    public Integer getPrivacy() {
        return privacy;
    }

    public void setPrivacy(Integer privacy) {
        this.privacy = privacy;
    }

    public Integer getPosts() {
        return posts;
    }

    public void setPosts(Integer posts) {
        this.posts = posts;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", title=").append(title);
        sb.append(", cover=").append(cover);
        sb.append(", privacy=").append(privacy);
        sb.append(", posts=").append(posts);
        sb.append(", time=").append(time);
        sb.append(", description=").append(description);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}