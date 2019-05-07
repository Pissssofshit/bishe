package com.bishe.tmp;

import com.bishe.model.Friendships;
import com.bishe.model.Groups;
import com.bishe.model.GroupsUsers;
import com.bishe.model.User;

public class ApplyUsers {
    public User user;
    public Friendships friendships;
    public GroupsUsers groupsUsers;
    public Groups groups;

    public Groups getGroups() {
        return groups;
    }

    public void setGroups(Groups groups) {
        this.groups = groups;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Friendships getFriendships() {
        return friendships;
    }

    public void setFriendships(Friendships friendships) {
        this.friendships = friendships;
    }

    public GroupsUsers getGroupsUsers() {
        return groupsUsers;
    }

    public void setGroupsUsers(GroupsUsers groupsUsers) {
        this.groupsUsers = groupsUsers;
    }
}
