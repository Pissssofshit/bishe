package com.bishe.dao;

import com.bishe.model.Friendshipwithuser;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface FriendshipwithuserMapper {
    int insert(Friendshipwithuser record);

    List<Friendshipwithuser> selectAll();

    List<Friendshipwithuser> getUserApplyList(int userId);
}