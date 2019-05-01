package com.bishe.service;

import com.bishe.dao.LikesMapper;
import com.bishe.dao.MessagesMapper;
import com.bishe.dao.UsermessageviewMapper;
import com.bishe.model.Likes;
import com.bishe.model.Messages;
import com.bishe.model.Usercommentview;
import com.bishe.model.Usermessageview;
import com.bishe.tmp.MessageWithComments;
import com.bishe.tmp.UserMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Component
public class MessageService {

    @Autowired
    CommentService commentService;
    @Autowired
    MessagesMapper messagesMapper;
    @Autowired
    UsermessageviewMapper usermessageviewMapper;
    @Autowired
    LikesMapper likesMapper;
    @Autowired
    NotificationsService notificationsService;

    public List<Messages> getMessageList(int pagesize,int pagenum,int userId){
        return messagesMapper.getMessageList(pagesize*(pagenum-1),pagesize,userId);
    }
    public List<Usermessageview> getUserMessageList(int pagesize, int pagenum, int userId){
        return usermessageviewMapper.getUserMessageList(pagesize*(pagenum-1),pagesize,userId);
    }

    public Messages postMessage(Messages messages){
        int messageid = messagesMapper.insert(messages);
        if(messageid >0)
            return messages;
        else{
            return null;
        }
    }
    public List<MessageWithComments> getMessageWithComments(int userId){
        List<Usermessageview> messageList = this.getMessageByUserId(userId);
        List<MessageWithComments> messageWithComments = new ArrayList<>();
        for (Usermessageview usermessageview:messageList
        ) {
            List<Usercommentview> userCommentList= commentService.getMessageComments(usermessageview.getId());
            MessageWithComments messageWithComments1 = new MessageWithComments();
            messageWithComments1.setUserCommentList(userCommentList);
            messageWithComments1.setUsermessageviews(usermessageview);
            messageWithComments.add(messageWithComments1);
        }
        return messageWithComments;
    }
    public List<Usermessageview> getMessageByUserId(int userId){
        return usermessageviewMapper.selectByUserId(userId);
    }

    public void likeMessage(int messageId,int userId){
        Messages messages = messagesMapper.selectByPrimaryKey(messageId);
        messages.setLikes(messages.getLikes()+1);
        messagesMapper.updateByPrimaryKey(messages);
        Likes likes = new Likes();
        likes.setBy(userId);
        likes.setType(1);
        likes.setPost(messageId);
        likes.setTime(new Date());
        likesMapper.insert(likes);
        notificationsService.setNotificationsByLike(likes);


    }
    public Messages getMessageById(int messageId){
        return messagesMapper.selectByPrimaryKey(messageId);
    }
    public Messages getRandomMessage(){
        return null;
    }

}
