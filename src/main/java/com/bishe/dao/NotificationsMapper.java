package com.bishe.dao;

import com.bishe.model.Notifications;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface NotificationsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Notifications record);

    Notifications selectByPrimaryKey(Integer id);

    List<Notifications> selectByUserIdandUnread(Integer userId);

    List<Notifications> selectAll();

    int updateByPrimaryKey(Notifications record);
}