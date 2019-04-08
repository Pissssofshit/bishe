package com.bishe.service;

import com.bishe.dao.MessagesMapper;
import com.bishe.model.Messages;
import com.bishe.tmp.UserMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MessageService {

    @Autowired
    MessagesMapper messagesMapper;

    public List<Messages> getMessageList(int pagesize,int pagenum,int userId){
        return messagesMapper.getMessageList(pagesize*(pagenum-1),pagesize,userId);
    }
    public List<UserMessage> getUserMessageList(int pagesize, int pagenum, int userId){
        return messagesMapper.getUserMessageList(pagesize*(pagenum-1),pagesize,userId);
    }
}
