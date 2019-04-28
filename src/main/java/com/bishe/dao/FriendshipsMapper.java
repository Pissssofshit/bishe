package com.bishe.dao;

import com.bishe.model.Friendships;
import java.util.List;

public interface FriendshipsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Friendships record);

    Friendships selectByPrimaryKey(Integer id);

    List<Friendships> selectAll();

    int updateByPrimaryKey(Friendships record);
}