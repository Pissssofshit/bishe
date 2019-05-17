package com.bishe.dao;

import com.bishe.model.Clusterpreference;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ClusterpreferenceMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Clusterpreference record);

    Clusterpreference selectByPrimaryKey(Integer id);

    Clusterpreference selectByUserIdAndType(int userId,int type);

    List<Integer> getTheSameClusterByClusterIdAndType(int clusterId,int type,int beuserId);

    List<Clusterpreference> selectAll();

    int updateByPrimaryKey(Clusterpreference record);
}