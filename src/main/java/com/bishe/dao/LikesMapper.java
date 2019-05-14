package com.bishe.dao;

import com.bishe.model.Likes;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface LikesMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Likes record);

    Likes selectByPrimaryKey(Integer id);

    List<Likes> selectAll();

    List<Likes> selectByBy(int userId);

    Likes selectByPostByType(int post,int by, int type);

    int updateByPrimaryKey(Likes record);

    Likes selectByUserIdandPostId(Integer userId,Integer postId);
}