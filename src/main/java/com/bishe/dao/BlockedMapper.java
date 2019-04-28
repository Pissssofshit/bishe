package com.bishe.dao;

import com.bishe.model.Blocked;
import java.util.List;

public interface BlockedMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Blocked record);

    Blocked selectByPrimaryKey(Integer id);

    List<Blocked> selectAll();

    int updateByPrimaryKey(Blocked record);
}