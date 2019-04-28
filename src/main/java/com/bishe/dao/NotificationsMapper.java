package com.bishe.dao;

import com.bishe.model.Notifications;
import java.util.List;

public interface NotificationsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Notifications record);

    Notifications selectByPrimaryKey(Integer id);

    List<Notifications> selectAll();

    int updateByPrimaryKey(Notifications record);
}