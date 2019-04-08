package com.bishe.model;

import java.io.Serializable;
import java.util.Date;

public class Pages implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pages.id
     *
     * @mbggenerated Sun Apr 07 18:38:05 CST 2019
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pages.by
     *
     * @mbggenerated Sun Apr 07 18:38:05 CST 2019
     */
    private Integer by;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pages.name
     *
     * @mbggenerated Sun Apr 07 18:38:05 CST 2019
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pages.title
     *
     * @mbggenerated Sun Apr 07 18:38:05 CST 2019
     */
    private String title;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pages.category
     *
     * @mbggenerated Sun Apr 07 18:38:05 CST 2019
     */
    private Integer category;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pages.address
     *
     * @mbggenerated Sun Apr 07 18:38:05 CST 2019
     */
    private String address;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pages.website
     *
     * @mbggenerated Sun Apr 07 18:38:05 CST 2019
     */
    private String website;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pages.phone
     *
     * @mbggenerated Sun Apr 07 18:38:05 CST 2019
     */
    private String phone;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pages.image
     *
     * @mbggenerated Sun Apr 07 18:38:05 CST 2019
     */
    private String image;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pages.cover
     *
     * @mbggenerated Sun Apr 07 18:38:05 CST 2019
     */
    private String cover;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pages.verified
     *
     * @mbggenerated Sun Apr 07 18:38:05 CST 2019
     */
    private Boolean verified;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pages.time
     *
     * @mbggenerated Sun Apr 07 18:38:05 CST 2019
     */
    private Date time;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pages.description
     *
     * @mbggenerated Sun Apr 07 18:38:05 CST 2019
     */
    private String description;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table pages
     *
     * @mbggenerated Sun Apr 07 18:38:05 CST 2019
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pages.id
     *
     * @return the value of pages.id
     *
     * @mbggenerated Sun Apr 07 18:38:05 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pages.id
     *
     * @param id the value for pages.id
     *
     * @mbggenerated Sun Apr 07 18:38:05 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pages.by
     *
     * @return the value of pages.by
     *
     * @mbggenerated Sun Apr 07 18:38:05 CST 2019
     */
    public Integer getBy() {
        return by;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pages.by
     *
     * @param by the value for pages.by
     *
     * @mbggenerated Sun Apr 07 18:38:05 CST 2019
     */
    public void setBy(Integer by) {
        this.by = by;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pages.name
     *
     * @return the value of pages.name
     *
     * @mbggenerated Sun Apr 07 18:38:05 CST 2019
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pages.name
     *
     * @param name the value for pages.name
     *
     * @mbggenerated Sun Apr 07 18:38:05 CST 2019
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pages.title
     *
     * @return the value of pages.title
     *
     * @mbggenerated Sun Apr 07 18:38:05 CST 2019
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pages.title
     *
     * @param title the value for pages.title
     *
     * @mbggenerated Sun Apr 07 18:38:05 CST 2019
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pages.category
     *
     * @return the value of pages.category
     *
     * @mbggenerated Sun Apr 07 18:38:05 CST 2019
     */
    public Integer getCategory() {
        return category;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pages.category
     *
     * @param category the value for pages.category
     *
     * @mbggenerated Sun Apr 07 18:38:05 CST 2019
     */
    public void setCategory(Integer category) {
        this.category = category;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pages.address
     *
     * @return the value of pages.address
     *
     * @mbggenerated Sun Apr 07 18:38:05 CST 2019
     */
    public String getAddress() {
        return address;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pages.address
     *
     * @param address the value for pages.address
     *
     * @mbggenerated Sun Apr 07 18:38:05 CST 2019
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pages.website
     *
     * @return the value of pages.website
     *
     * @mbggenerated Sun Apr 07 18:38:05 CST 2019
     */
    public String getWebsite() {
        return website;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pages.website
     *
     * @param website the value for pages.website
     *
     * @mbggenerated Sun Apr 07 18:38:05 CST 2019
     */
    public void setWebsite(String website) {
        this.website = website == null ? null : website.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pages.phone
     *
     * @return the value of pages.phone
     *
     * @mbggenerated Sun Apr 07 18:38:05 CST 2019
     */
    public String getPhone() {
        return phone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pages.phone
     *
     * @param phone the value for pages.phone
     *
     * @mbggenerated Sun Apr 07 18:38:05 CST 2019
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pages.image
     *
     * @return the value of pages.image
     *
     * @mbggenerated Sun Apr 07 18:38:05 CST 2019
     */
    public String getImage() {
        return image;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pages.image
     *
     * @param image the value for pages.image
     *
     * @mbggenerated Sun Apr 07 18:38:05 CST 2019
     */
    public void setImage(String image) {
        this.image = image == null ? null : image.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pages.cover
     *
     * @return the value of pages.cover
     *
     * @mbggenerated Sun Apr 07 18:38:05 CST 2019
     */
    public String getCover() {
        return cover;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pages.cover
     *
     * @param cover the value for pages.cover
     *
     * @mbggenerated Sun Apr 07 18:38:05 CST 2019
     */
    public void setCover(String cover) {
        this.cover = cover == null ? null : cover.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pages.verified
     *
     * @return the value of pages.verified
     *
     * @mbggenerated Sun Apr 07 18:38:05 CST 2019
     */
    public Boolean getVerified() {
        return verified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pages.verified
     *
     * @param verified the value for pages.verified
     *
     * @mbggenerated Sun Apr 07 18:38:05 CST 2019
     */
    public void setVerified(Boolean verified) {
        this.verified = verified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pages.time
     *
     * @return the value of pages.time
     *
     * @mbggenerated Sun Apr 07 18:38:05 CST 2019
     */
    public Date getTime() {
        return time;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pages.time
     *
     * @param time the value for pages.time
     *
     * @mbggenerated Sun Apr 07 18:38:05 CST 2019
     */
    public void setTime(Date time) {
        this.time = time;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pages.description
     *
     * @return the value of pages.description
     *
     * @mbggenerated Sun Apr 07 18:38:05 CST 2019
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pages.description
     *
     * @param description the value for pages.description
     *
     * @mbggenerated Sun Apr 07 18:38:05 CST 2019
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pages
     *
     * @mbggenerated Sun Apr 07 18:38:05 CST 2019
     */
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