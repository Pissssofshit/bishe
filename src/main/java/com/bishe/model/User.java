package com.bishe.model;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable {
    private Integer idu;

    private String username;

    private String password;

    private String email;

    private String first_name;

    private String last_name;

    private String country;

    private String location;

    private String address;

    private String work;

    private String school;

    private String website;

    private String bio;

    private Date date;

    private String facebook;

    private String twitter;

    private String gplus;

    private String image;

    private Integer private_states;

    private Integer suspended;

    private String salted;

    private String cover;

    private Integer verified;

    private Integer privacy;

    private Byte gender;

    private Byte interests;

    private Integer online;

    private Byte offline;

    private String ip;

    private Integer user_group;

    private Byte notificationl;

    private Byte notificationc;

    private Byte notifications;

    private Byte notificationd;

    private Byte notificationf;

    private Byte notificationg;

    private Byte notificationx;

    private Byte notificationp;

    private Byte email_comment;

    private Byte email_like;

    private Byte email_new_friend;

    private Byte email_group_invite;

    private Byte email_page_invite;

    private Byte sound_new_notification;

    private Byte sound_new_chat;

    private Date born;

    private Double lastloginlat;

    private Double lastloginlong;

    private Byte push;

    private static final long serialVersionUID = 1L;

    public Integer getIdu() {
        return idu;
    }

    public void setIdu(Integer idu) {
        this.idu = idu;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name == null ? null : first_name.trim();
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name == null ? null : last_name.trim();
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country == null ? null : country.trim();
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location == null ? null : location.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work == null ? null : work.trim();
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school == null ? null : school.trim();
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website == null ? null : website.trim();
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio == null ? null : bio.trim();
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getFacebook() {
        return facebook;
    }

    public void setFacebook(String facebook) {
        this.facebook = facebook == null ? null : facebook.trim();
    }

    public String getTwitter() {
        return twitter;
    }

    public void setTwitter(String twitter) {
        this.twitter = twitter == null ? null : twitter.trim();
    }

    public String getGplus() {
        return gplus;
    }

    public void setGplus(String gplus) {
        this.gplus = gplus == null ? null : gplus.trim();
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image == null ? null : image.trim();
    }

    public Integer getPrivate_states() {
        return private_states;
    }

    public void setPrivate_states(Integer private_states) {
        this.private_states = private_states;
    }

    public Integer getSuspended() {
        return suspended;
    }

    public void setSuspended(Integer suspended) {
        this.suspended = suspended;
    }

    public String getSalted() {
        return salted;
    }

    public void setSalted(String salted) {
        this.salted = salted == null ? null : salted.trim();
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover == null ? null : cover.trim();
    }

    public Integer getVerified() {
        return verified;
    }

    public void setVerified(Integer verified) {
        this.verified = verified;
    }

    public Integer getPrivacy() {
        return privacy;
    }

    public void setPrivacy(Integer privacy) {
        this.privacy = privacy;
    }

    public Byte getGender() {
        return gender;
    }

    public void setGender(Byte gender) {
        this.gender = gender;
    }

    public Byte getInterests() {
        return interests;
    }

    public void setInterests(Byte interests) {
        this.interests = interests;
    }

    public Integer getOnline() {
        return online;
    }

    public void setOnline(Integer online) {
        this.online = online;
    }

    public Byte getOffline() {
        return offline;
    }

    public void setOffline(Byte offline) {
        this.offline = offline;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }

    public Integer getUser_group() {
        return user_group;
    }

    public void setUser_group(Integer user_group) {
        this.user_group = user_group;
    }

    public Byte getNotificationl() {
        return notificationl;
    }

    public void setNotificationl(Byte notificationl) {
        this.notificationl = notificationl;
    }

    public Byte getNotificationc() {
        return notificationc;
    }

    public void setNotificationc(Byte notificationc) {
        this.notificationc = notificationc;
    }

    public Byte getNotifications() {
        return notifications;
    }

    public void setNotifications(Byte notifications) {
        this.notifications = notifications;
    }

    public Byte getNotificationd() {
        return notificationd;
    }

    public void setNotificationd(Byte notificationd) {
        this.notificationd = notificationd;
    }

    public Byte getNotificationf() {
        return notificationf;
    }

    public void setNotificationf(Byte notificationf) {
        this.notificationf = notificationf;
    }

    public Byte getNotificationg() {
        return notificationg;
    }

    public void setNotificationg(Byte notificationg) {
        this.notificationg = notificationg;
    }

    public Byte getNotificationx() {
        return notificationx;
    }

    public void setNotificationx(Byte notificationx) {
        this.notificationx = notificationx;
    }

    public Byte getNotificationp() {
        return notificationp;
    }

    public void setNotificationp(Byte notificationp) {
        this.notificationp = notificationp;
    }

    public Byte getEmail_comment() {
        return email_comment;
    }

    public void setEmail_comment(Byte email_comment) {
        this.email_comment = email_comment;
    }

    public Byte getEmail_like() {
        return email_like;
    }

    public void setEmail_like(Byte email_like) {
        this.email_like = email_like;
    }

    public Byte getEmail_new_friend() {
        return email_new_friend;
    }

    public void setEmail_new_friend(Byte email_new_friend) {
        this.email_new_friend = email_new_friend;
    }

    public Byte getEmail_group_invite() {
        return email_group_invite;
    }

    public void setEmail_group_invite(Byte email_group_invite) {
        this.email_group_invite = email_group_invite;
    }

    public Byte getEmail_page_invite() {
        return email_page_invite;
    }

    public void setEmail_page_invite(Byte email_page_invite) {
        this.email_page_invite = email_page_invite;
    }

    public Byte getSound_new_notification() {
        return sound_new_notification;
    }

    public void setSound_new_notification(Byte sound_new_notification) {
        this.sound_new_notification = sound_new_notification;
    }

    public Byte getSound_new_chat() {
        return sound_new_chat;
    }

    public void setSound_new_chat(Byte sound_new_chat) {
        this.sound_new_chat = sound_new_chat;
    }

    public Date getBorn() {
        return born;
    }

    public void setBorn(Date born) {
        this.born = born;
    }

    public Double getLastloginlat() {
        return lastloginlat;
    }

    public void setLastloginlat(Double lastloginlat) {
        this.lastloginlat = lastloginlat;
    }

    public Double getLastloginlong() {
        return lastloginlong;
    }

    public void setLastloginlong(Double lastloginlong) {
        this.lastloginlong = lastloginlong;
    }

    public Byte getPush() {
        return push;
    }

    public void setPush(Byte push) {
        this.push = push;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", idu=").append(idu);
        sb.append(", username=").append(username);
        sb.append(", password=").append(password);
        sb.append(", email=").append(email);
        sb.append(", first_name=").append(first_name);
        sb.append(", last_name=").append(last_name);
        sb.append(", country=").append(country);
        sb.append(", location=").append(location);
        sb.append(", address=").append(address);
        sb.append(", work=").append(work);
        sb.append(", school=").append(school);
        sb.append(", website=").append(website);
        sb.append(", bio=").append(bio);
        sb.append(", date=").append(date);
        sb.append(", facebook=").append(facebook);
        sb.append(", twitter=").append(twitter);
        sb.append(", gplus=").append(gplus);
        sb.append(", image=").append(image);
        sb.append(", private_states=").append(private_states);
        sb.append(", suspended=").append(suspended);
        sb.append(", salted=").append(salted);
        sb.append(", cover=").append(cover);
        sb.append(", verified=").append(verified);
        sb.append(", privacy=").append(privacy);
        sb.append(", gender=").append(gender);
        sb.append(", interests=").append(interests);
        sb.append(", online=").append(online);
        sb.append(", offline=").append(offline);
        sb.append(", ip=").append(ip);
        sb.append(", user_group=").append(user_group);
        sb.append(", notificationl=").append(notificationl);
        sb.append(", notificationc=").append(notificationc);
        sb.append(", notifications=").append(notifications);
        sb.append(", notificationd=").append(notificationd);
        sb.append(", notificationf=").append(notificationf);
        sb.append(", notificationg=").append(notificationg);
        sb.append(", notificationx=").append(notificationx);
        sb.append(", notificationp=").append(notificationp);
        sb.append(", email_comment=").append(email_comment);
        sb.append(", email_like=").append(email_like);
        sb.append(", email_new_friend=").append(email_new_friend);
        sb.append(", email_group_invite=").append(email_group_invite);
        sb.append(", email_page_invite=").append(email_page_invite);
        sb.append(", sound_new_notification=").append(sound_new_notification);
        sb.append(", sound_new_chat=").append(sound_new_chat);
        sb.append(", born=").append(born);
        sb.append(", lastloginlat=").append(lastloginlat);
        sb.append(", lastloginlong=").append(lastloginlong);
        sb.append(", push=").append(push);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}