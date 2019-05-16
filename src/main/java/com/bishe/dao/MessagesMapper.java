package com.bishe.dao;

import com.bishe.model.Messages;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MessagesMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Messages record);

    Messages selectByPrimaryKey(Integer id);

    List<Messages> selectAll();

    List<Messages> selectAllWithGeo();

    int updateByPrimaryKey(Messages record);

    List<Messages> getMessageList(Integer offset,Integer limit,Integer userId);

}