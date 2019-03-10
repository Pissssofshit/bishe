package com.bishe.dao;

import com.bishe.model.Rating;
import java.util.List;

public interface RatingMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Rating record);

    Rating selectByPrimaryKey(Integer id);

    List<Rating> selectAll();

    int updateByPrimaryKey(Rating record);
}