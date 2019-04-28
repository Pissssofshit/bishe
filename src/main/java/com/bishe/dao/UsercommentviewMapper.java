package com.bishe.dao;

import com.bishe.model.Usercommentview;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UsercommentviewMapper {
    int insert(Usercommentview record);

    List<Usercommentview> selectAll();

    List<Usercommentview> selectByMid(Integer mid);
}