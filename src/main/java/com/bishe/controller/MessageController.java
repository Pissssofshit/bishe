package com.bishe.controller;

import com.bishe.Http.Response;
import com.bishe.Parameter.UserLogin;
import com.bishe.Util.FileUtils;
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
    Response postmessage(Messages messages, @RequestParam("fileName") MultipartFile file, HttpServletRequest request){

        String result_msg="";//上传结果信息

        Map<String,Object> root=new HashMap<String, Object>();

        if (file.getSize() / 1000 > 1000){
            result_msg="图片大小不能超过100KB";
        }
        else{
            //判断上传文件格式
            String fileType = file.getContentType();
            if (fileType.equals("image/jpeg") || fileType.equals("image/png") || fileType.equals("image/jpeg")) {
                // 要上传的目标文件存放的绝对路径
                //用src为保存绝对路径不能改名只能用原名，不用原名会导致ajax上传图片后在前端显示时出现404错误-->原因未知
//                String localPath="F:\\IDEAProject\\imageupload\\src\\main\\resources\\static\\img";
//                final String localPath="F:\\IDEAProject\\imageupload\\target\\classes\\static\\img";
                final String localPath="F:\\project\\backend\\bishe\\src\\main\\resources\\static\\images";
                //上传后保存的文件名(需要防止图片重名导致的文件覆盖)
                //获取文件名
                String fileName = file.getOriginalFilename();
                //获取文件后缀名
                String suffixName = fileName.substring(fileName.lastIndexOf("."));
                //重新生成文件名
                fileName = UUID.randomUUID()+suffixName;
                if (FileUtils.upload(file, localPath, fileName)) {
                    //文件存放的相对路径(一般存放在数据库用于img标签的src)
                    String relativePath="img/"+fileName;
                    root.put("relativePath",relativePath);//前端根据是否存在该字段来判断上传是否成功
                    result_msg="图片上传成功";
                }
                else{
                    result_msg="图片上传失败";
                }
            }
            else{
                result_msg="图片格式不正确";
            }
        }
        HttpSession httpSession = request.getSession();
        int userid = (int)httpSession.getAttribute("userid");
        messages.setUid(userid);
        messages.setLikes(0);
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
