package com.bishe.dao;

import com.bishe.model.Comments;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CommentsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Comments record);

    Comments selectByPrimaryKey(Integer id);

    List<Comments> selectAll();

    int updateByPrimaryKey(Comments record);
}