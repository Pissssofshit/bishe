package com.bishe.dao;

import com.bishe.model.Pages;
import java.util.List;

public interface PagesMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Pages record);

    Pages selectByPrimaryKey(Integer id);

    List<Pages> selectAll();

    int updateByPrimaryKey(Pages record);
}