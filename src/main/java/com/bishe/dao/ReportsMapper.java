package com.bishe.dao;

import com.bishe.model.Reports;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface ReportsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Reports record);

    Reports selectByPrimaryKey(Integer id);

    List<Reports> selectAll();

    int updateByPrimaryKey(Reports record);
}