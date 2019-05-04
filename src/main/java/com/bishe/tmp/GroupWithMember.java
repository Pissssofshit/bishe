package com.bishe.tmp;

import com.bishe.model.Groups;
import com.bishe.model.User;

import java.util.List;

public class GroupWithMember {
    Groups groups;
    List<User> userList;

    public Groups getGroups() {
        return groups;
    }

    public void setGroups(Groups groups) {
        this.groups = groups;
    }

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }
}
