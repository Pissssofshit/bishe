package com.bishe.dao;

import com.bishe.model.Comments;
import java.util.List;

public interface CommentsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comments
     *
     * @mbggenerated Sun Apr 07 18:38:05 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comments
     *
     * @mbggenerated Sun Apr 07 18:38:05 CST 2019
     */
    int insert(Comments record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comments
     *
     * @mbggenerated Sun Apr 07 18:38:05 CST 2019
     */
    Comments selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comments
     *
     * @mbggenerated Sun Apr 07 18:38:05 CST 2019
     */
    List<Comments> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comments
     *
     * @mbggenerated Sun Apr 07 18:38:05 CST 2019
     */
    int updateByPrimaryKey(Comments record);
}