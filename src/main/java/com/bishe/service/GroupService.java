package com.bishe.service;

import com.bishe.Parameter.UserRegister;
import com.bishe.dao.GroupsMapper;
import com.bishe.dao.GroupsUsersMapper;
import com.bishe.dao.UserMapper;
import com.bishe.model.Groups;
import com.bishe.model.GroupsUsers;
import com.bishe.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

//import com.bishe.model.Users;

@Component
public class GroupService {

    @Autowired
    GroupsMapper groupsMapper;
    @Autowired
    GroupsUsersMapper groupsUsersMapper;
    @Autowired
    GroupsUsers groupsUsers;
    @Autowired
    UserMapper userMapper;

    public List<User> getGroupUsersById(int groupId){

        List<GroupsUsers> groupsUsersList = groupsUsersMapper.selectGroupUsers(groupId);
        List<User> userList = new ArrayList<>();
        for (GroupsUsers groupUsers:groupsUsersList
             ) {
            int userId = groupsUsers.getUser();
            User user = userMapper.selectByPrimaryKey(userId);
            userList.add(user);
        }
        return userList;
    }
    public Groups getGroupByGroupId(int groupId){
        return groupsMapper.selectByPrimaryKey(groupId);
    }

    public Groups createGroup(Groups groups){
        groupsMapper.insert(groups);
        if(groups.getId()==null){
            return null;
        }
        return groups;
    }
    public boolean joinGroup(int groupId,int userId,int level){
        groupsUsers.setGroup(groupId);
        groupsUsers.setPermissions(level);
        groupsUsers.setUser(userId);
        int result = groupsUsersMapper.insert(groupsUsers);
        if(result==0){
            return false;
        }
        return true;
    }
    public boolean setGroupUserLevel(int groupId,int userId,int level,int SetUserId){
        if(!this.isGroupAdmin(userId,groupId)){
            return false;
        }
        groupsUsers.setUser(userId);
        groupsUsers.setGroup(groupId);
        groupsUsers.setPermissions(level);
        int result = groupsUsersMapper.updateByPrimaryKey(groupsUsers);
        if(result==0){
            return  false;
        }
        return true;
    }
    public boolean isGroupAdmin(int userId,int groupId){
        GroupsUsers groupsUsers1 = groupsUsersMapper.selectByPrimaryKey(groupId,userId);
        if(groupsUsers1.getPermissions()==1){
            return true;
        }
        return false;
    }
}
