package com.bishe.dao;

import com.bishe.model.CommentTag;
import java.util.List;

public interface CommentTagMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CommentTag record);

    CommentTag selectByPrimaryKey(Integer id);

    List<CommentTag> selectAll();

    int updateByPrimaryKey(CommentTag record);
}