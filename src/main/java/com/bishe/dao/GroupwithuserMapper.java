package com.bishe.dao;

import com.bishe.model.Groupwithuser;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface GroupwithuserMapper {
    int insert(Groupwithuser record);

    List<Groupwithuser> selectAll();

    List<Groupwithuser> getApplyList(int groupId);

    List<Groupwithuser> selectByGroupIdAndLikeUserName(int groupId,String userName);
}