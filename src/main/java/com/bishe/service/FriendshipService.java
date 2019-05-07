package com.bishe.service;

import com.bishe.dao.FriendshipsMapper;
import com.bishe.dao.GroupsMapper;
import com.bishe.dao.GroupsUsersMapper;
import com.bishe.dao.UserMapper;
import com.bishe.model.Friendships;
import com.bishe.model.Groups;
import com.bishe.model.GroupsUsers;
import com.bishe.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

//import com.bishe.model.Users;

@Component
public class FriendshipService {

    @Autowired
    FriendshipsMapper friendshipsMapper;


    public boolean dealFriends(int applyId,int dealType){
        Friendships friendships = friendshipsMapper.selectByPrimaryKey(applyId);
        if(friendships==null){
            return false;
        }
        friendships.setStatus(dealType);
        friendshipsMapper.updateByPrimaryKey(friendships);
        return true;
    }

    public boolean applyBeFriends(int applyId,int beApplyId){
        Friendships friendships = friendshipsMapper.getByUserId1AndUserId2(applyId,beApplyId);
        if(friendships==null){
            Friendships friendships1 = new Friendships();
            friendships1.setUser1(beApplyId);
            friendships1.setUser2(applyId);
            friendships1.setStatus(3);
            friendships1.setTime(new Date());
            friendshipsMapper.insert(friendships1);
            return true;
        }
        return false;
    }

    public List<Friendships> getUserApplyList(int userId){
        return friendshipsMapper.getUserApplyList(userId);
    }
}
