package com.bishe.service;

import com.bishe.Parameter.UserRegister;
import com.bishe.dao.GroupsMapper;
import com.bishe.dao.GroupsUsersMapper;
import com.bishe.dao.GroupwithuserMapper;
import com.bishe.dao.UserMapper;
import com.bishe.model.Groups;
import com.bishe.model.GroupsUsers;
import com.bishe.model.Groupwithuser;
import com.bishe.model.User;
import com.bishe.tmp.ApplyUsers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
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
    @Autowired
    GroupwithuserMapper groupwithuserMapper;

    public List<Groupwithuser> getApplyList(int userId){
        List<Groups> groupsList = this.groupsAdmin(userId);
        List<Groupwithuser> groupwithuserList = new ArrayList<>();
        for (Groups groups:groupsList
        ) {
            List<Groupwithuser> groupwithuserList1 = groupwithuserMapper.getApplyList(groups.getId());
            groupwithuserList.addAll(groupwithuserList1);
        }
        return groupwithuserList;
    }

    public boolean agreeJoinGroup(int userId,int groupId){
        GroupsUsers groupsUsers = groupsUsersMapper.selectByPrimaryKey(groupId,userId);
        if(groupsUsers==null){
            return false;
        }
        if(groupsUsers.getStatus()==1){
            return false;
        }
        groupsUsers.setStatus(1);
        groupsUsers.setPermissions(0);
        groupsUsersMapper.updateByPrimaryKey(groupsUsers);
        return true;
    }

    public boolean rejectJoinGroup(int userId,int groupId){
        GroupsUsers groupsUsers = groupsUsersMapper.selectByPrimaryKey(groupId,userId);
        if(groupsUsers==null){
            return false;
        }
        if(groupsUsers.getStatus()==1){
            return false;
        }
        groupsUsers.setStatus(4);
        groupsUsersMapper.updateByPrimaryKey(groupsUsers);
        return true;
    }

    public List<Groups> loadGroupsByUserId(int userId){
        List<GroupsUsers> groupsUsersList = groupsUsersMapper.selectGroupUsersByUserIdAndNotBlock(userId);
        List<Groups> groupsList = new ArrayList<>();
        for (GroupsUsers groupUsers:groupsUsersList
             ) {
            Groups groups = groupsMapper.selectByPrimaryKey(groupUsers.getGroup());
            groupsList.add(groups);
        }
        return groupsList;
    }

    public boolean isGroupMember(Integer userId,Integer groupId){
        GroupsUsers groupsUsers = groupsUsersMapper.selectByPrimaryKey(groupId,userId);
        if(groupsUsers==null)
            return false;
        return true;
    }

    public List<Groups> selectByLikeGroupName(String groupName){
        List<Groups> s= groupsMapper.selectByLikeGroupName(groupName);
        return s;
    }

    public List<User> getGroupAdminById(int groupId){

        List<GroupsUsers> groupsUsersList = groupsUsersMapper.selectGroupUsersAndPermission(groupId,1);
        List<User> userList = new ArrayList<>();
        for (GroupsUsers groupUsers:groupsUsersList
        ) {
            int userId = groupUsers.getUser();
            User user = userMapper.selectByPrimaryKey(userId);
            userList.add(user);
        }
        return userList;
    }
    public List<User> getGroupUsersById(int groupId,String keyword){

        List<Groupwithuser> groupwithuserList = groupwithuserMapper.selectByGroupIdAndLikeUserName(groupId,keyword);
        List<User> userList = new ArrayList<>();
        for (Groupwithuser groupwithuser:groupwithuserList
             ) {
            int userId = groupwithuser.getIdu();
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

    public List<Groups> groupsAdmin(int userId){
        List<Integer> groupsIdList = groupsUsersMapper.groupsAdmin(userId);
        List<Groups> groupsList = new ArrayList<>();
        for (Integer groupId:
             groupsIdList) {
            Groups groups = groupsMapper.selectByPrimaryKey(groupId);
            groupsList.add(groups);
        }
        return groupsList;
    }
    public boolean applyGroup(int groupId,int userId){
        GroupsUsers groupsUsers1 = new GroupsUsers();
        groupsUsers1.setGroup(groupId);
        groupsUsers1.setPermissions(0);
        groupsUsers1.setUser(userId);
        groupsUsers1.setStatus(3);
        groupsUsers1.setTime(new Date());
        int result = groupsUsersMapper.insert(groupsUsers1);
        if(result==0){
            return false;
        }
        return true;
    }
    public boolean joinGroup(int groupId,int userId,int level){
        GroupsUsers groupsUsers1 = new GroupsUsers();
        groupsUsers1.setGroup(groupId);
        groupsUsers1.setPermissions(level);
        groupsUsers1.setUser(userId);
        groupsUsers1.setStatus(0);
        groupsUsers1.setTime(new Date());
        groupsUsers1.setPermissions(level);
        int result = groupsUsersMapper.insert(groupsUsers1);
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
