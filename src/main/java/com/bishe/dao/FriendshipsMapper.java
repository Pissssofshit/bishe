package com.bishe.dao;

import com.bishe.model.Friendships;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface FriendshipsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Friendships record);

    Friendships selectByPrimaryKey(Integer id);

    List<Friendships> selectFriendsId(int userId);

    List<Friendships> selectAll();

    int updateByPrimaryKey(Friendships record);

    Friendships selectByUserIds(Integer userId1,Integer userId2);

    List<Friendships> getUserApplyList(int userId);

    Friendships getByUserId1AndUserId2(int userId1,int userId2);
}