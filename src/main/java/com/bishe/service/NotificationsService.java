package com.bishe.service;

import com.bishe.dao.CommentsMapper;
import com.bishe.dao.LikesMapper;
import com.bishe.dao.NotificationsMapper;
import com.bishe.dao.UsercommentviewMapper;
import com.bishe.model.*;
import com.bishe.tmp.MessageWithComments;
import com.bishe.tmp.NoticeMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.*;

@Component
public class NotificationsService {

    @Autowired
    NotificationsMapper notificationsMapper;
    @Autowired
    UserService userService;
    @Autowired
    MessageService messageService;
    @Autowired
    Notifications notifications;
    @Autowired
    CommentService commentService;


    public List<Notifications> getNotificationsByUserId(int userId){
        return notificationsMapper.selectByUserIdandUnread(userId);
    }

    public void setNotifications(Notifications notifications){
           notificationsMapper.insert(notifications);
    }

    public Notifications setNotificationsByComment(Comments comments){
        notifications.setChild(comments.getId());
        notifications.setParent(comments.getMid());
        notifications.setFrom(comments.getUid());
        Messages messages = messageService.getMessageById(comments.getMid());
        if(messages.getUid()==comments.getUid()){
            return null;
        }
        notifications.setTo(messages.getUid());
        notifications.setRead(0);
        notifications.setTime(new Date());
        notifications.setType(4);
        this.setNotifications(notifications);
        return notifications;
    }
    public List<NoticeMessage> noticeToMessage(List<Notifications> notificationsList){
        List<NoticeMessage> noticeMessageList = new ArrayList<>();
        for (Notifications notifications:notificationsList
             ) {
            NoticeMessage noticeMessage = this.noticeMessage(notifications);
            noticeMessageList.add(noticeMessage);
        }
        Collections.sort(noticeMessageList, new Comparator() {
            public int compare(Object a, Object b) {
                int one = ((NoticeMessage) a).getId();
                int two = ((NoticeMessage) b).getId();
                return two - one;
            }
        });
        return noticeMessageList;
    }
    public NoticeMessage noticeMessage(Notifications notifications){
        NoticeMessage noticeMessage = new NoticeMessage();
        int userid = notifications.getFrom();
        User user = userService.getUserById(userid);
        noticeMessage.setUsername(user.getUsername());
        int type = notifications.getType();
        noticeMessage.setOperate(this.getOperateByType(type));
        int messageId;
        if(this.isOperateMessage(type)){
            messageId = notifications.getParent();
        }else{
            int commentId = notifications.getChild();
            messageId = commentService.getMid(commentId);
        }
        noticeMessage.setOperateurl(messageService.getMessageUrl(messageId)+"&noticeId="+notifications.getId());
        noticeMessage.setId(notifications.getId());
        noticeMessage.setTime(notifications.getTime());
        return noticeMessage;
    }
    boolean isOperateMessage(int type){
        boolean result;
        switch (type){
            case 1:
                result = true;
                break;
            case 2:
                result = false;
                break;
            case 3:
                result = true;
                break;
            case 4:
                result = false;
                break;
            case 5:
                result = true;
                break;
            default:
                result = false;

        }
        return result;
    }
    String getOperateByType(int type){
        String result;
        switch (type){
            case 1:
                result = "给说说点赞";
                break;
            case 2:
                result = "给评论点赞";
                break;
            case 3:
                result = "发表说说";
                break;
            case 4:
                result = "给说说评论";
                break;
            case 5:
                result = "发表了附近的说说推送";
                break;
            default:
                    result = "我也不知道干了啥";

        }
        return result;
    }
    public void setNotificationsByMessage(Messages messages,int publicLevel){
        List<Integer> userIds = userService.getFriendsId(messages.getUid());
        if(publicLevel==1){
            List<User> userList = userService.getAroundUser(messages.getUid());
            for (User tmp:userList
                 ) {
                userIds.add(tmp.getIdu());
            }
        }
        for (Integer userId:userIds
             ) {
            Notifications notifications = new Notifications();
            notifications.setFrom(messages.getUid());
            notifications.setTo(userId);
            notifications.setTime(new Date());
            if(publicLevel==1){
                notifications.setType(5);
            }else{
                notifications.setType(3);
            }

            notifications.setParent(messages.getId());
            notifications.setChild(0);
            this.setNotifications(notifications);
        }
    }
    public Integer loadUnreadNotificationCount(int userId){
        List<Notifications> notificationsList = notificationsMapper.selectByUserIdandUnread(userId);
        return notificationsList.size();
    }
    public boolean setNoticeRead(int noticeId){
        Notifications notifications = notificationsMapper.selectByPrimaryKey(noticeId);
        notifications.setRead(1);
        notificationsMapper.updateByPrimaryKey(notifications);
        return true;
    }

    public Notifications setNotificationsByLike(Likes likes){
        notifications.setFrom(likes.getBy());
        if(likes.getType()==2){
//            Messages messages = messageService.getMessageById(likes.)
            notifications.setChild(likes.getPost());
            Usercommentview usercommentview = commentService.getComment(likes.getPost());
            notifications.setParent(usercommentview.getMid());
            notifications.setTo(usercommentview.getIdu());
        }else if(likes.getType()==1){
            Messages messages = messageService.getMessageById(likes.getPost());
            notifications.setTo(messages.getUid());
            notifications.setParent(likes.getPost());
            notifications.setChild(0);
        }

        notifications.setType(likes.getType());
        //这两个可以交给数据库去设置
        notifications.setRead(0);
        notifications.setTime(new Date());
        this.setNotifications(notifications);
        return notifications;
    }
}
