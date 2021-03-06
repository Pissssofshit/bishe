package com.bishe.model;

import java.io.Serializable;
import java.util.Date;

public class Usermessagename implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column usermessagename.username
     *
     * @mbggenerated Fri Apr 19 13:42:59 CST 2019
     */
    private String username;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column usermessagename.id
     *
     * @mbggenerated Fri Apr 19 13:42:59 CST 2019
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column usermessagename.uid
     *
     * @mbggenerated Fri Apr 19 13:42:59 CST 2019
     */
    private Integer uid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column usermessagename.tag
     *
     * @mbggenerated Fri Apr 19 13:42:59 CST 2019
     */
    private String tag;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column usermessagename.type
     *
     * @mbggenerated Fri Apr 19 13:42:59 CST 2019
     */
    private String type;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column usermessagename.value
     *
     * @mbggenerated Fri Apr 19 13:42:59 CST 2019
     */
    private String value;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column usermessagename.group
     *
     * @mbggenerated Fri Apr 19 13:42:59 CST 2019
     */
    private Integer group;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column usermessagename.page
     *
     * @mbggenerated Fri Apr 19 13:42:59 CST 2019
     */
    private Integer page;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column usermessagename.time
     *
     * @mbggenerated Fri Apr 19 13:42:59 CST 2019
     */
    private Date time;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column usermessagename.public_state
     *
     * @mbggenerated Fri Apr 19 13:42:59 CST 2019
     */
    private Integer public_state;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column usermessagename.likes
     *
     * @mbggenerated Fri Apr 19 13:42:59 CST 2019
     */
    private Integer likes;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column usermessagename.longitude
     *
     * @mbggenerated Fri Apr 19 13:42:59 CST 2019
     */
    private Double longitude;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column usermessagename.latitude
     *
     * @mbggenerated Fri Apr 19 13:42:59 CST 2019
     */
    private Double latitude;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column usermessagename.isPushed
     *
     * @mbggenerated Fri Apr 19 13:42:59 CST 2019
     */
    private Byte isPushed;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column usermessagename.message
     *
     * @mbggenerated Fri Apr 19 13:42:59 CST 2019
     */
    private String message;

    private String imgurl;

    public String getImgurl() {
        return imgurl;
    }

    public void setImgurl(String imgurl) {
        this.imgurl = imgurl;
    }

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table usermessagename
     *
     * @mbggenerated Fri Apr 19 13:42:59 CST 2019
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column usermessagename.username
     *
     * @return the value of usermessagename.username
     *
     * @mbggenerated Fri Apr 19 13:42:59 CST 2019
     */
    public String getUsername() {
        return username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column usermessagename.username
     *
     * @param username the value for usermessagename.username
     *
     * @mbggenerated Fri Apr 19 13:42:59 CST 2019
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column usermessagename.id
     *
     * @return the value of usermessagename.id
     *
     * @mbggenerated Fri Apr 19 13:42:59 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column usermessagename.id
     *
     * @param id the value for usermessagename.id
     *
     * @mbggenerated Fri Apr 19 13:42:59 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column usermessagename.uid
     *
     * @return the value of usermessagename.uid
     *
     * @mbggenerated Fri Apr 19 13:42:59 CST 2019
     */
    public Integer getUid() {
        return uid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column usermessagename.uid
     *
     * @param uid the value for usermessagename.uid
     *
     * @mbggenerated Fri Apr 19 13:42:59 CST 2019
     */
    public void setUid(Integer uid) {
        this.uid = uid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column usermessagename.tag
     *
     * @return the value of usermessagename.tag
     *
     * @mbggenerated Fri Apr 19 13:42:59 CST 2019
     */
    public String getTag() {
        return tag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column usermessagename.tag
     *
     * @param tag the value for usermessagename.tag
     *
     * @mbggenerated Fri Apr 19 13:42:59 CST 2019
     */
    public void setTag(String tag) {
        this.tag = tag == null ? null : tag.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column usermessagename.type
     *
     * @return the value of usermessagename.type
     *
     * @mbggenerated Fri Apr 19 13:42:59 CST 2019
     */
    public String getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column usermessagename.type
     *
     * @param type the value for usermessagename.type
     *
     * @mbggenerated Fri Apr 19 13:42:59 CST 2019
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column usermessagename.value
     *
     * @return the value of usermessagename.value
     *
     * @mbggenerated Fri Apr 19 13:42:59 CST 2019
     */
    public String getValue() {
        return value;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column usermessagename.value
     *
     * @param value the value for usermessagename.value
     *
     * @mbggenerated Fri Apr 19 13:42:59 CST 2019
     */
    public void setValue(String value) {
        this.value = value == null ? null : value.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column usermessagename.group
     *
     * @return the value of usermessagename.group
     *
     * @mbggenerated Fri Apr 19 13:42:59 CST 2019
     */
    public Integer getGroup() {
        return group;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column usermessagename.group
     *
     * @param group the value for usermessagename.group
     *
     * @mbggenerated Fri Apr 19 13:42:59 CST 2019
     */
    public void setGroup(Integer group) {
        this.group = group;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column usermessagename.page
     *
     * @return the value of usermessagename.page
     *
     * @mbggenerated Fri Apr 19 13:42:59 CST 2019
     */
    public Integer getPage() {
        return page;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column usermessagename.page
     *
     * @param page the value for usermessagename.page
     *
     * @mbggenerated Fri Apr 19 13:42:59 CST 2019
     */
    public void setPage(Integer page) {
        this.page = page;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column usermessagename.time
     *
     * @return the value of usermessagename.time
     *
     * @mbggenerated Fri Apr 19 13:42:59 CST 2019
     */
    public Date getTime() {
        return time;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column usermessagename.time
     *
     * @param time the value for usermessagename.time
     *
     * @mbggenerated Fri Apr 19 13:42:59 CST 2019
     */
    public void setTime(Date time) {
        this.time = time;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column usermessagename.public_state
     *
     * @return the value of usermessagename.public_state
     *
     * @mbggenerated Fri Apr 19 13:42:59 CST 2019
     */
    public Integer getPublic_state() {
        return public_state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column usermessagename.public_state
     *
     * @param public_state the value for usermessagename.public_state
     *
     * @mbggenerated Fri Apr 19 13:42:59 CST 2019
     */
    public void setPublic_state(Integer public_state) {
        this.public_state = public_state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column usermessagename.likes
     *
     * @return the value of usermessagename.likes
     *
     * @mbggenerated Fri Apr 19 13:42:59 CST 2019
     */
    public Integer getLikes() {
        return likes;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column usermessagename.likes
     *
     * @param likes the value for usermessagename.likes
     *
     * @mbggenerated Fri Apr 19 13:42:59 CST 2019
     */
    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column usermessagename.longitude
     *
     * @return the value of usermessagename.longitude
     *
     * @mbggenerated Fri Apr 19 13:42:59 CST 2019
     */
    public Double getLongitude() {
        return longitude;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column usermessagename.longitude
     *
     * @param longitude the value for usermessagename.longitude
     *
     * @mbggenerated Fri Apr 19 13:42:59 CST 2019
     */
    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column usermessagename.latitude
     *
     * @return the value of usermessagename.latitude
     *
     * @mbggenerated Fri Apr 19 13:42:59 CST 2019
     */
    public Double getLatitude() {
        return latitude;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column usermessagename.latitude
     *
     * @param latitude the value for usermessagename.latitude
     *
     * @mbggenerated Fri Apr 19 13:42:59 CST 2019
     */
    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column usermessagename.isPushed
     *
     * @return the value of usermessagename.isPushed
     *
     * @mbggenerated Fri Apr 19 13:42:59 CST 2019
     */
    public Byte getIsPushed() {
        return isPushed;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column usermessagename.isPushed
     *
     * @param isPushed the value for usermessagename.isPushed
     *
     * @mbggenerated Fri Apr 19 13:42:59 CST 2019
     */
    public void setIsPushed(Byte isPushed) {
        this.isPushed = isPushed;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column usermessagename.message
     *
     * @return the value of usermessagename.message
     *
     * @mbggenerated Fri Apr 19 13:42:59 CST 2019
     */
    public String getMessage() {
        return message;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column usermessagename.message
     *
     * @param message the value for usermessagename.message
     *
     * @mbggenerated Fri Apr 19 13:42:59 CST 2019
     */
    public void setMessage(String message) {
        this.message = message == null ? null : message.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table usermessagename
     *
     * @mbggenerated Fri Apr 19 13:42:59 CST 2019
     */
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