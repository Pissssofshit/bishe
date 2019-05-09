package com.bishe.controller;

import com.bishe.Http.Response;
import com.bishe.Parameter.UserLogin;
import com.bishe.Util.FileUtils;
import com.bishe.Util.LocationUtil;
import com.bishe.model.*;
import com.bishe.service.CommentService;
import com.bishe.service.MessageService;
import com.bishe.service.UserService;
import com.bishe.tmp.MessageWithComments;
import com.bishe.tmp.UserComment;
import com.bishe.tmp.UserMessage;
import com.bishe.tmp.Viewattr;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.*;

@Controller
@RequestMapping("/message")
public class MessageController {

    @Autowired
    MessageService messageService;
    @Autowired
    CommentService commentService;
    @Autowired
    UserService userService;

    @ResponseBody
    @RequestMapping("/post_comment")
    Response postmessagecomment(Comments comments, HttpServletRequest request){
        HttpSession httpSession = request.getSession();
        int userid = (int)httpSession.getAttribute("userid");
        comments.setUid(userid);
        commentService.postComments(comments);
        return new Response();
    }
    @ResponseBody
    @RequestMapping("/post")
    Response postmessage(Messages messages, @RequestParam(value = "fileName",required = false) MultipartFile file, HttpServletRequest request){

        String result_msg="";//上传结果信息
        String imageUrl="";
        if(file!=null){
            imageUrl = FileUtils.saveImg(file);
        }

        HttpSession httpSession = request.getSession();
        int userid = (int)httpSession.getAttribute("userid");

        messages.setUid(userid);
        messages.setLikes(0);
        messages.setImgurl(imageUrl);
        messages.setTime(new Date());
        User user = userService.getUserById(userid);
        messages.setLatitude(user.getLastloginlat());
        messages.setLongitude(user.getLastloginlong());
        messages.setValue(user.getAddress());
        messageService.postMessage(messages);
        Response response = new Response();
        response.setCode(200);
        return response;
    }
    @RequestMapping("/loadmessageAround")
    String loadmessageAround(Model model, HttpServletRequest request){
        HttpSession httpSession = request.getSession();
        int userId = (int) httpSession.getAttribute("userid");
        List<MessageWithComments> messageWithComments = messageService.getMessageWithComments(userId);
        User user = userService.getUserById(userId);
        double lat1 = 0;
        double long1 = 0;
        if(user.getLastloginlong() == null || user.getLastloginlat()==null){
            messageWithComments=null;
        }else{
            lat1 = user.getLastloginlat();
            long1 = user.getLastloginlong();
        }
        for (int i=0;i<messageWithComments.size();i++
             ) {
            if(messageWithComments.get(i).getUsermessageviews().getLatitude()==null || messageWithComments.get(i).getUsermessageviews().getLongitude()==null){
                messageWithComments.remove(i);
                i--;
                continue;
            }
            double lat2 = messageWithComments.get(i).getUsermessageviews().getLatitude();
            double long2 = messageWithComments.get(i).getUsermessageviews().getLongitude();
            double distance = LocationUtil.getDistance(lat1,long1,lat2,long2);
            if(distance>1000){
                messageWithComments.remove(i);
                i--;
            }
        }
        model.addAttribute("messages",messageWithComments);
        return "/messages/content::content";
    }
    @RequestMapping("/loadmessage")
    String loadmessage(Model model, HttpServletRequest request){
        HttpSession httpSession = request.getSession();
        int userId = (int) httpSession.getAttribute("userid");
        List<MessageWithComments> messageWithComments = messageService.getMessageWithComments(userId);
        model.addAttribute("messages",messageWithComments);
        return "/messages/content::content";
    }
    @RequestMapping("/loadcomments")
    String loadcomments(Model model,int messageId, HttpServletRequest request){
        List<Usercommentview> userCommentList= commentService.getMessageComments(messageId);
        model.addAttribute("commentList",userCommentList);
        return "/messages/comment::comment";
    }
    @RequestMapping("/loadcomment")
    String loadcomment(Model model,int commentId, HttpServletRequest request){
        Usercommentview usercommentview= commentService.getComment(commentId);
        model.addAttribute("comment",usercommentview);
        return "/messages/single-comment::singlecomment";
    }

    @RequestMapping("/like")
    String like(Model model,int id,int type,HttpServletRequest request){
//        List<UserComment> userCommentList= commentService.getMessageComments(messageId);

//        model.addAttribute("commentList",userCommentList);
        HttpSession httpSession = request.getSession();
        int userId = (int)httpSession.getAttribute("userid");
        if(type==1){
            messageService.likeMessage(id,userId);

        }else if(type==2){
            commentService.likeComment(id,userId);
            List<Usercommentview> userCommentList= commentService.getMessageComments(id);
            model.addAttribute("commentList",userCommentList);
        }

        return "/messages/comment::comment";
    }


}
