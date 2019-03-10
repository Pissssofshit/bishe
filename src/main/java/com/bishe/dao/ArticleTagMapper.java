package com.bishe.dao;

import com.bishe.model.ArticleTag;
import java.util.List;

public interface ArticleTagMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ArticleTag record);

    ArticleTag selectByPrimaryKey(Integer id);

    List<ArticleTag> selectAll();

    int updateByPrimaryKey(ArticleTag record);
}