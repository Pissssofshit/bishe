package com.bishe.dao;

import com.bishe.model.Groups;
import com.bishe.model.GroupsUsers;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface GroupsUsersMapper {
    int deleteByPrimaryKey(@Param("group") Integer group, @Param("user") Integer user);

    int insert(GroupsUsers record);

    GroupsUsers selectByPrimaryKey(@Param("group") Integer group, @Param("user") Integer user);

    List<GroupsUsers> selectAll();

    List<GroupsUsers> selectGroupUsers(int groupId);

    List<GroupsUsers> selectGroupUsersAndPermission(int groupId,int level);
    List<GroupsUsers> selectGroupUsersByUserId(int userId);

    List<GroupsUsers> selectGroupUsersByUserIdAndNotBlock(int userId);

    int updateByPrimaryKey(GroupsUsers record);

    List<Integer> groupsAdmin(int userId);

    List<GroupsUsers> getUserApply(int groupId);
}