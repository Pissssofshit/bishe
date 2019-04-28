package com.bishe.dao;

import com.bishe.model.Chat;
import java.util.List;

public interface ChatMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Chat record);

    Chat selectByPrimaryKey(Integer id);

    List<Chat> selectAll();

    int updateByPrimaryKey(Chat record);
}