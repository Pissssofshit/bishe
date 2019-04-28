package com.bishe.tmp;

import com.bishe.model.Comments;

public class UserComment extends Comments {
    public Integer uid;
    public String username;

    @Override
    public Integer getUid() {
        return uid;
    }

    @Override
    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
