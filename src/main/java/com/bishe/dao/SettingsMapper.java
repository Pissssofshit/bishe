package com.bishe.dao;

import com.bishe.model.Settings;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface SettingsMapper {
    int insert(Settings record);

    List<Settings> selectAll();
}