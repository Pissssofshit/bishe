package com.bishe.tmp;

import java.util.Date;

public class NoticeMessage {
    int id;
    String username;
    String userurl;
    String operate;
    String operateurl;
    Date time;

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserurl() {
        return userurl;
    }

    public void setUserurl(String userurl) {
        this.userurl = userurl;
    }

    public String getOperate() {
        return operate;
    }

    public void setOperate(String operate) {
        this.operate = operate;
    }

    public String getOperateurl() {
        return operateurl;
    }

    public void setOperateurl(String operateurl) {
        this.operateurl = operateurl;
    }
}
