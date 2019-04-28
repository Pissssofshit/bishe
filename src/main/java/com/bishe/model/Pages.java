package com.bishe.model;

import java.io.Serializable;
import java.util.Date;

public class Pages implements Serializable {
    private Integer id;

    private Integer by;

    private String name;

    private String title;

    private Integer category;

    private String address;

    private String website;

    private String phone;

    private String image;

    private String cover;

    private Boolean verified;

    private Date time;

    private String description;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getBy() {
        return by;
    }

    public void setBy(Integer by) {
        this.by = by;
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

    public Integer getCategory() {
        return category;
    }

    public void setCategory(Integer category) {
        this.category = category;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website == null ? null : website.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image == null ? null : image.trim();
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover == null ? null : cover.trim();
    }

    public Boolean getVerified() {
        return verified;
    }

    public void setVerified(Boolean verified) {
        this.verified = verified;
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
        sb.append(", by=").append(by);
        sb.append(", name=").append(name);
        sb.append(", title=").append(title);
        sb.append(", category=").append(category);
        sb.append(", address=").append(address);
        sb.append(", website=").append(website);
        sb.append(", phone=").append(phone);
        sb.append(", image=").append(image);
        sb.append(", cover=").append(cover);
        sb.append(", verified=").append(verified);
        sb.append(", time=").append(time);
        sb.append(", description=").append(description);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}