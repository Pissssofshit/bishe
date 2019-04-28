package com.bishe.dao;

import com.bishe.model.Plugins;
import java.util.List;

public interface PluginsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Plugins record);

    Plugins selectByPrimaryKey(Integer id);

    List<Plugins> selectAll();

    int updateByPrimaryKey(Plugins record);
}