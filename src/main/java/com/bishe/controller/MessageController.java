package com.bishe.controller;

import com.bishe.Http.Response;
import com.bishe.Parameter.UserLogin;
import com.bishe.model.*;
import com.bishe.service.CommentService;
import com.bishe.service.MessageService;
import com.bishe.tmp.MessageWithComments;
import com.bishe.tmp.UserComment;
import com.bishe.tmp.UserMessage;
import com.bishe.tmp.Viewattr;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/message")
public class MessageController {

    @Autowired
    MessageService messageService;
    @Autowired
    CommentService commentService;

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
    Response postmessage(Messages messages, HttpServletRequest request){
        HttpSession httpSession = request.getSession();
        int userid = (int)httpSession.getAttribute("userid");
        messages.setUid(userid);
        messageService.postMessage(messages);
        return new Response();
    }
    @RequestMapping("/loadmessage")
    String loadmessage(Model model,Messages messages, HttpServletRequest request){
        HttpSession httpSession = request.getSession();
        int userId = (int) httpSession.getAttribute("userid");
        List<MessageWithComments> messageWithComments = messageService.getMessageWithComments(userId);
        model.addAttribute("messages",messageWithComments);
        return "/shared/timeline::timeline";
    }
    @RequestMapping("/loadcomments")
    String loadcomments(Model model,int messageId, HttpServletRequest request){
        List<Usercommentview> userCommentList= commentService.getMessageComments(messageId);
        model.addAttribute("commentList",userCommentList);
        return "/messages/comment::comment";
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
