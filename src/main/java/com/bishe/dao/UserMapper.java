package com.bishe.dao;

import com.bishe.model.User;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    int deleteByPrimaryKey(@Param("host") String host, @Param("user") String user);

    int insert(User record);

    User selectByPrimaryKey(@Param("host") String host, @Param("user") String user);

    List<User> selectAll();

    int updateByPrimaryKey(User record);
}