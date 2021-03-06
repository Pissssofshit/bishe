package com.bishe.dao;

import com.bishe.model.Usermessageview;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface UsermessageviewMapper {
    int insert(Usermessageview record);

    Usermessageview selectByMessageId(int messageId);

    List<Usermessageview> selectAll();

    List<Usermessageview> selectByUserId(Integer userId);

    List<Usermessageview> selectByUserIdWithoutGroup(Integer userId);

    List<Usermessageview> selectByGroupId(Integer groupId);


    List<Usermessageview> getUserMessageList(int offset,int limit ,int userId);
}