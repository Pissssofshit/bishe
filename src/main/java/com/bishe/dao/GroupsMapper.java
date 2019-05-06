package com.bishe.dao;

import com.bishe.model.Groups;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface GroupsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Groups record);

    Groups selectByPrimaryKey(Integer id);

    List<Groups> selectByLikeGroupName(String groupName);

    List<Groups> selectAll();



    int updateByPrimaryKey(Groups record);
}