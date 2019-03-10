package com.bishe.dao;

import com.bishe.model.UserLog;
import java.util.List;

public interface UserLogMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserLog record);

    UserLog selectByPrimaryKey(Integer id);

    List<UserLog> selectAll();

    int updateByPrimaryKey(UserLog record);
}