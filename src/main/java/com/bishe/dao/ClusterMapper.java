package com.bishe.dao;

import com.bishe.model.Cluster;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ClusterMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Cluster record);

    Cluster selectByPrimaryKey(Integer id);

    Cluster selectByUserId(Integer userId);

    List<Cluster> selectAll();

    List<Integer> getTheSameClusterByClusterId(Integer clusterId);

    int updateByPrimaryKey(Cluster record);
}