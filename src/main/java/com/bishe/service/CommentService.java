package com.bishe.service;

import com.bishe.dao.CommentsMapper;
import com.bishe.dao.LikesMapper;
import com.bishe.dao.UsercommentviewMapper;
import com.bishe.model.Comments;
import com.bishe.model.Likes;
import com.bishe.model.Notifications;
import com.bishe.model.Usercommentview;
import com.bishe.tmp.UserComment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Component
public class CommentService {
    @Autowired
    CommentsMapper commentsMapper;
    @Autowired
    UsercommentviewMapper usercommentviewMapper;
    @Autowired
    LikesMapper likesMapper;
    @Autowired
    NotificationsService notificationsService;
    @Autowired
    MessageService messageService;

    public Comments postComments(Comments comments) {

        if (comments.getTime() == null) {
//            SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            comments.setTime(new Date());
        }
        if (comments.getLikes() == null) {
            comments.setLikes(0);
        }
        int commentid = commentsMapper.insert(comments);

        if (commentid > 0){
            notificationsService.setNotificationsByComment(comments);
            return comments;
        }else{
            return null;
        }
    }
    public List<Usercommentview> getMessageComments(Integer mid){
        return usercommentviewMapper.selectByMid(mid);
    }

    public Usercommentview getComment(Integer commentId){
        return usercommentviewMapper.selectById(commentId);
    }

    public Integer getMid(Integer commentId){
        Usercommentview comments =this.getComment(commentId);
        return comments.getMid();
    }
    public void likeComment(int commentId,int userId){
        if(messageService.haslike(commentId,2,userId))
            return;
        Comments comments =commentsMapper.selectByPrimaryKey(commentId);
        comments.setLikes(comments.getLikes()+1);
        commentsMapper.updateByPrimaryKey(comments);
        Likes likes = new Likes();
        likes.setBy(userId);
        likes.setType(2);
        likes.setPost(commentId);
        likes.setTime(new Date());
        likesMapper.insert(likes);
        notificationsService.setNotificationsByLike(likes);
    }
}
