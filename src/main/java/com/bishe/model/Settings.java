package com.bishe.model;

import java.io.Serializable;

public class Settings implements Serializable {
    private String title;

    private String theme;

    private Integer perpage;

    private String censor;

    private Integer captcha;

    private Integer intervalm;

    private Integer intervaln;

    private Integer time;

    private Integer message;

    private Integer size;

    private String format;

    private Integer mail;

    private Integer sizemsg;

    private String formatmsg;

    private Integer cperpage;

    private Integer ilimit;

    private Integer climit;

    private Integer uperpage;

    private Integer sperpage;

    private Byte nperpage;

    private Byte nperwidget;

    private Integer lperpost;

    private Integer aperip;

    private Integer conline;

    private Byte ronline;

    private Byte mperpage;

    private Integer verified;

    private Integer chatr;

    private Byte email_activation;

    private Byte email_comment;

    private Byte email_like;

    private Byte email_new_friend;

    private Byte email_group_invite;

    private Byte email_page_invite;

    private Byte smiles;

    private Integer fbapp;

    private String fbappid;

    private String fbappsecret;

    private Integer smtp_email;

    private String smtp_host;

    private Integer smtp_port;

    private Integer smtp_auth;

    private String smtp_username;

    private String smtp_password;

    private String ad1;

    private String ad2;

    private String ad3;

    private String ad4;

    private String ad5;

    private String ad6;

    private String ad7;

    private String tracking_code;

    private static final long serialVersionUID = 1L;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme == null ? null : theme.trim();
    }

    public Integer getPerpage() {
        return perpage;
    }

    public void setPerpage(Integer perpage) {
        this.perpage = perpage;
    }

    public String getCensor() {
        return censor;
    }

    public void setCensor(String censor) {
        this.censor = censor == null ? null : censor.trim();
    }

    public Integer getCaptcha() {
        return captcha;
    }

    public void setCaptcha(Integer captcha) {
        this.captcha = captcha;
    }

    public Integer getIntervalm() {
        return intervalm;
    }

    public void setIntervalm(Integer intervalm) {
        this.intervalm = intervalm;
    }

    public Integer getIntervaln() {
        return intervaln;
    }

    public void setIntervaln(Integer intervaln) {
        this.intervaln = intervaln;
    }

    public Integer getTime() {
        return time;
    }

    public void setTime(Integer time) {
        this.time = time;
    }

    public Integer getMessage() {
        return message;
    }

    public void setMessage(Integer message) {
        this.message = message;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format == null ? null : format.trim();
    }

    public Integer getMail() {
        return mail;
    }

    public void setMail(Integer mail) {
        this.mail = mail;
    }

    public Integer getSizemsg() {
        return sizemsg;
    }

    public void setSizemsg(Integer sizemsg) {
        this.sizemsg = sizemsg;
    }

    public String getFormatmsg() {
        return formatmsg;
    }

    public void setFormatmsg(String formatmsg) {
        this.formatmsg = formatmsg == null ? null : formatmsg.trim();
    }

    public Integer getCperpage() {
        return cperpage;
    }

    public void setCperpage(Integer cperpage) {
        this.cperpage = cperpage;
    }

    public Integer getIlimit() {
        return ilimit;
    }

    public void setIlimit(Integer ilimit) {
        this.ilimit = ilimit;
    }

    public Integer getClimit() {
        return climit;
    }

    public void setClimit(Integer climit) {
        this.climit = climit;
    }

    public Integer getUperpage() {
        return uperpage;
    }

    public void setUperpage(Integer uperpage) {
        this.uperpage = uperpage;
    }

    public Integer getSperpage() {
        return sperpage;
    }

    public void setSperpage(Integer sperpage) {
        this.sperpage = sperpage;
    }

    public Byte getNperpage() {
        return nperpage;
    }

    public void setNperpage(Byte nperpage) {
        this.nperpage = nperpage;
    }

    public Byte getNperwidget() {
        return nperwidget;
    }

    public void setNperwidget(Byte nperwidget) {
        this.nperwidget = nperwidget;
    }

    public Integer getLperpost() {
        return lperpost;
    }

    public void setLperpost(Integer lperpost) {
        this.lperpost = lperpost;
    }

    public Integer getAperip() {
        return aperip;
    }

    public void setAperip(Integer aperip) {
        this.aperip = aperip;
    }

    public Integer getConline() {
        return conline;
    }

    public void setConline(Integer conline) {
        this.conline = conline;
    }

    public Byte getRonline() {
        return ronline;
    }

    public void setRonline(Byte ronline) {
        this.ronline = ronline;
    }

    public Byte getMperpage() {
        return mperpage;
    }

    public void setMperpage(Byte mperpage) {
        this.mperpage = mperpage;
    }

    public Integer getVerified() {
        return verified;
    }

    public void setVerified(Integer verified) {
        this.verified = verified;
    }

    public Integer getChatr() {
        return chatr;
    }

    public void setChatr(Integer chatr) {
        this.chatr = chatr;
    }

    public Byte getEmail_activation() {
        return email_activation;
    }

    public void setEmail_activation(Byte email_activation) {
        this.email_activation = email_activation;
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

    public Byte getSmiles() {
        return smiles;
    }

    public void setSmiles(Byte smiles) {
        this.smiles = smiles;
    }

    public Integer getFbapp() {
        return fbapp;
    }

    public void setFbapp(Integer fbapp) {
        this.fbapp = fbapp;
    }

    public String getFbappid() {
        return fbappid;
    }

    public void setFbappid(String fbappid) {
        this.fbappid = fbappid == null ? null : fbappid.trim();
    }

    public String getFbappsecret() {
        return fbappsecret;
    }

    public void setFbappsecret(String fbappsecret) {
        this.fbappsecret = fbappsecret == null ? null : fbappsecret.trim();
    }

    public Integer getSmtp_email() {
        return smtp_email;
    }

    public void setSmtp_email(Integer smtp_email) {
        this.smtp_email = smtp_email;
    }

    public String getSmtp_host() {
        return smtp_host;
    }

    public void setSmtp_host(String smtp_host) {
        this.smtp_host = smtp_host == null ? null : smtp_host.trim();
    }

    public Integer getSmtp_port() {
        return smtp_port;
    }

    public void setSmtp_port(Integer smtp_port) {
        this.smtp_port = smtp_port;
    }

    public Integer getSmtp_auth() {
        return smtp_auth;
    }

    public void setSmtp_auth(Integer smtp_auth) {
        this.smtp_auth = smtp_auth;
    }

    public String getSmtp_username() {
        return smtp_username;
    }

    public void setSmtp_username(String smtp_username) {
        this.smtp_username = smtp_username == null ? null : smtp_username.trim();
    }

    public String getSmtp_password() {
        return smtp_password;
    }

    public void setSmtp_password(String smtp_password) {
        this.smtp_password = smtp_password == null ? null : smtp_password.trim();
    }

    public String getAd1() {
        return ad1;
    }

    public void setAd1(String ad1) {
        this.ad1 = ad1 == null ? null : ad1.trim();
    }

    public String getAd2() {
        return ad2;
    }

    public void setAd2(String ad2) {
        this.ad2 = ad2 == null ? null : ad2.trim();
    }

    public String getAd3() {
        return ad3;
    }

    public void setAd3(String ad3) {
        this.ad3 = ad3 == null ? null : ad3.trim();
    }

    public String getAd4() {
        return ad4;
    }

    public void setAd4(String ad4) {
        this.ad4 = ad4 == null ? null : ad4.trim();
    }

    public String getAd5() {
        return ad5;
    }

    public void setAd5(String ad5) {
        this.ad5 = ad5 == null ? null : ad5.trim();
    }

    public String getAd6() {
        return ad6;
    }

    public void setAd6(String ad6) {
        this.ad6 = ad6 == null ? null : ad6.trim();
    }

    public String getAd7() {
        return ad7;
    }

    public void setAd7(String ad7) {
        this.ad7 = ad7 == null ? null : ad7.trim();
    }

    public String getTracking_code() {
        return tracking_code;
    }

    public void setTracking_code(String tracking_code) {
        this.tracking_code = tracking_code == null ? null : tracking_code.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", title=").append(title);
        sb.append(", theme=").append(theme);
        sb.append(", perpage=").append(perpage);
        sb.append(", censor=").append(censor);
        sb.append(", captcha=").append(captcha);
        sb.append(", intervalm=").append(intervalm);
        sb.append(", intervaln=").append(intervaln);
        sb.append(", time=").append(time);
        sb.append(", message=").append(message);
        sb.append(", size=").append(size);
        sb.append(", format=").append(format);
        sb.append(", mail=").append(mail);
        sb.append(", sizemsg=").append(sizemsg);
        sb.append(", formatmsg=").append(formatmsg);
        sb.append(", cperpage=").append(cperpage);
        sb.append(", ilimit=").append(ilimit);
        sb.append(", climit=").append(climit);
        sb.append(", uperpage=").append(uperpage);
        sb.append(", sperpage=").append(sperpage);
        sb.append(", nperpage=").append(nperpage);
        sb.append(", nperwidget=").append(nperwidget);
        sb.append(", lperpost=").append(lperpost);
        sb.append(", aperip=").append(aperip);
        sb.append(", conline=").append(conline);
        sb.append(", ronline=").append(ronline);
        sb.append(", mperpage=").append(mperpage);
        sb.append(", verified=").append(verified);
        sb.append(", chatr=").append(chatr);
        sb.append(", email_activation=").append(email_activation);
        sb.append(", email_comment=").append(email_comment);
        sb.append(", email_like=").append(email_like);
        sb.append(", email_new_friend=").append(email_new_friend);
        sb.append(", email_group_invite=").append(email_group_invite);
        sb.append(", email_page_invite=").append(email_page_invite);
        sb.append(", smiles=").append(smiles);
        sb.append(", fbapp=").append(fbapp);
        sb.append(", fbappid=").append(fbappid);
        sb.append(", fbappsecret=").append(fbappsecret);
        sb.append(", smtp_email=").append(smtp_email);
        sb.append(", smtp_host=").append(smtp_host);
        sb.append(", smtp_port=").append(smtp_port);
        sb.append(", smtp_auth=").append(smtp_auth);
        sb.append(", smtp_username=").append(smtp_username);
        sb.append(", smtp_password=").append(smtp_password);
        sb.append(", ad1=").append(ad1);
        sb.append(", ad2=").append(ad2);
        sb.append(", ad3=").append(ad3);
        sb.append(", ad4=").append(ad4);
        sb.append(", ad5=").append(ad5);
        sb.append(", ad6=").append(ad6);
        sb.append(", ad7=").append(ad7);
        sb.append(", tracking_code=").append(tracking_code);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}