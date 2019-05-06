package com.bishe.dao;

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

    List<GroupsUsers> selectGroupUsersByUserId(int userId);

    int updateByPrimaryKey(GroupsUsers record);
}