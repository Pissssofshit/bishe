package com.bishe.dao;

import com.bishe.model.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    int deleteByPrimaryKey(Integer idu);

    int insert(User record);

    User selectByPrimaryKey(Integer idu);

    List<User> selectAll();

    int updateByPrimaryKey(User record);

    User selectByUserName(String userName);

    List<User> selectByLikeUserName(String userName);
}