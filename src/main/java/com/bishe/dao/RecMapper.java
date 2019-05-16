package com.bishe.dao;

import com.bishe.model.Rec;
import java.util.List;

public interface RecMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Rec record);

    Rec selectByPrimaryKey(Integer id);

    List<Rec> selectAll();

    int updateByPrimaryKey(Rec record);
}