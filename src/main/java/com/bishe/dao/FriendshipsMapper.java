package com.bishe.dao;

import com.bishe.model.Friendships;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface FriendshipsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Friendships record);

    Friendships selectByPrimaryKey(Integer id);

    List<Friendships> selectAll();

    int updateByPrimaryKey(Friendships record);

    Friendships selectByUserIds(Integer userId1,Integer userId2);
}