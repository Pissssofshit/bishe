package com.bishe.controller;

import com.bishe.Http.Response;
import com.bishe.Parameter.UserLogin;
import com.bishe.Parameter.UserRegister;
import com.bishe.Util.FileUtils;
import com.bishe.model.*;
import com.bishe.service.*;
import com.bishe.tmp.MessageWithComments;
import com.bishe.tmp.SearchItem;
import com.bishe.tmp.UserMessage;
import com.bishe.tmp.Viewattr;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;
    @Autowired
    MessageService messageService;
    @Autowired
    GroupService groupService;
    @Autowired
    FriendshipService friendshipService;
    @Autowired
    NotificationsService notificationsService;

    public boolean isLogin(HttpServletRequest request){
        HttpSession httpSession = request.getSession();
        if(httpSession.getAttribute("userid")!=null){
            return true;
        }
        return false;
    }
    int getUserId(HttpServletRequest request){
        HttpSession httpSession = request.getSession();
        return (int)httpSession.getAttribute("userid");
    }
    void setSession(HttpServletRequest request,int userId){
        HttpSession httpSession = request.getSession();
        httpSession.setAttribute("userid",userId);
//        if(httpSession.getAttribute("userid")!=null){
//            return true;
//        }
    }


    @RequestMapping("/setting")
    public String  Setting(Model model){
        Viewattr viewattr =new Viewattr();
        viewattr.setFragment_id("setting");
        viewattr.setFragment_path("settings/setting");
        model.addAttribute("viewattr",viewattr);
        return "wrapper";
    }
    @RequestMapping("/register")
    String reg(@Valid UserRegister userRegister, BindingResult bindingResult, Model model, HttpServletRequest request){

        Viewattr viewattr =new Viewattr();
        if(this.isLogin(request)){
            viewattr.setFragment_id("timeline");
            viewattr.setFragment_path("shared/timeline");
            List<Usermessageview> messagesList = messageService.getUserMessageList(10,1,(int)request.getSession().getAttribute("userid"));
        }else{
            if(bindingResult.hasErrors()){
//            return null;
                for(ObjectError error:bindingResult.getAllErrors()){
                    System.out.println(error.getDefaultMessage());
                }
                return null;
            }
            if(userService.getUserByUsername(userRegister.getUsername())!=null){
                viewattr.setFragment_id("content");
                viewattr.setFragment_path("welcome/content");
            }else{
                int userId = userService.registerUser(userRegister);
                this.setSession(request,userId);
                if(userId==0){
                    viewattr.setFragment_id("content");
                    viewattr.setFragment_path("welcome/content");
                }else{
                    viewattr.setFragment_id("timeline");
                    viewattr.setFragment_path("shared/timeline");
                    List<Usermessageview> messagesList = messageService.getUserMessageList(10,1,userId);

                    model.addAttribute("messages",messagesList);
                }
            }
        }
        model.addAttribute("viewattr",viewattr);
        return "wrapper";
    }
    @RequestMapping("/message")
    String message(Model model,Integer messageId, @RequestParam(value = "noticeId",required = false) Integer noticeId,HttpServletRequest request){
        Viewattr viewattr =new Viewattr();
        viewattr.setFragment_id("row");
        viewattr.setFragment_path("messages/rows");
        if(noticeId!=null){
            notificationsService.setNoticeRead(noticeId);
        }
        int userId = userService.getUserId(request);
        MessageWithComments messageWithComments = messageService.getMessageWithComments(userId,messageId);
        model.addAttribute("message",messageWithComments);
        model.addAttribute("viewattr",viewattr);
        return "wrapper";
    }

    @RequestMapping("/logout")
    String logout(Model model,HttpServletRequest httpServletRequest){
        HttpSession httpSession = httpServletRequest.getSession();
        httpSession.setAttribute("userid",null);
        Viewattr viewattr =new Viewattr();
        viewattr.setFragment_id("content");
        viewattr.setFragment_path("welcome/content");
        model.addAttribute("viewattr",viewattr);
        return "wrapper";
    }

    @RequestMapping("/loadPeopleAndGroup")
    String loadPeopleAndGroup(Model model,String keyword,HttpServletRequest request){
        List<User> userList = userService.getUserByLikeUsername(keyword);
        List<Groups> groupsList = groupService.selectByLikeGroupName(keyword);
        List<SearchItem> searchItemList = new ArrayList<>();
        int userId = userService.getUserId(request);
        for (Groups  groups:groupsList
             ) {
            SearchItem searchItem = new SearchItem();
            searchItem.setId(groups.getId());
            searchItem.setName(groups.getName());
            searchItem.setType(1);
            boolean isGroupMember = groupService.isGroupMember(userId,groups.getId());
            if(isGroupMember){
                searchItem.setRelationship(1);
            }else{
                searchItem.setRelationship(2);
            }
            searchItem.setLogoUrl(groups.getCover());
            searchItemList.add(searchItem);
        }
        for(User user:userList){
            SearchItem searchItem = new SearchItem();
            searchItem.setId(user.getIdu());
            searchItem.setName(user.getUsername());
            searchItem.setType(2);
            boolean isFriends = userService.isFriends(userId,user.getIdu());
            if(isFriends){
                searchItem.setRelationship(1);
            }else{
                searchItem.setRelationship(2);
            }
            searchItem.setLogoUrl(user.getCover());
            searchItemList.add(searchItem);
        }
        model.addAttribute("itemList",searchItemList);
        return "search/searchItem::searchitem";
    }


    @ResponseBody
    @RequestMapping("/dealFriends")
    Response dealFriends(int applyId,int result){
        int realResult = 1;
        if(result==0){
            realResult = 4;
        }else{
            realResult = 1;
        }
        friendshipService.dealFriends(applyId,realResult);
        Response response = new Response();
        return response;
    }
    @ResponseBody
    @RequestMapping("/applyBeFriends")
    Response applyBeFriends(Model model,int userId,HttpServletRequest httpServletRequest){

        int userId1 = userService.getUserId(httpServletRequest);
        friendshipService.applyBeFriends(userId1,userId);
        Response response = new Response();
        response.setCode(200);
        return response;
    }

    @ResponseBody
    @RequestMapping("/saveProfile")
    public Response saveProfile(HttpServletRequest request,@RequestParam(value = "fileName",required = false) MultipartFile file,String userName){
        int userId = userService.getUserId(request);
        String urlcover = FileUtils.saveImg(file);
        User user = userService.getUserById(userId);
        user.setUsername(userName);
        user.setCover(urlcover);
        userService.updateUser(user);
        Response response = new Response();
        return response;
    }

    @RequestMapping("person")
    public String person(Model model,HttpServletRequest request,Integer userId){
//        int userId = userService.getUserId(request);
        User user = userService.getUserById(userId);
        model.addAttribute("user",user);
        Viewattr viewattr =new Viewattr();
        viewattr.setFragment_id("profile");
        viewattr.setFragment_path("profile/profile");
        model.addAttribute("viewattr",viewattr);
        return "wrapper";
    }

    @RequestMapping("profile")
    public String profile(Model model,HttpServletRequest request,Integer userId){
//        int userId = userService.getUserId(request);
        User user = userService.getUserById(userId);
        model.addAttribute("user",user);
        Viewattr viewattr =new Viewattr();
        viewattr.setFragment_id("profile");
        viewattr.setFragment_path("profile/content");
        model.addAttribute("viewattr",viewattr);
        return "wrapper";
    }

    @RequestMapping("/applyList")
    String applyList(Model model,HttpServletRequest request){
        int userId = userService.getUserId(request);
        List<Friendshipwithuser> friendshipsList = friendshipService.getUserApplyList(userId);
        model.addAttribute("applyList",friendshipsList);
        return "notice/apply::apply";
    }
    @RequestMapping("/login")
    String login(Model model,UserLogin userLogin,HttpServletRequest request){
        boolean result = userService.checkPwd(userLogin.getUsername(),userLogin.getPassword());
        Viewattr viewattr =new Viewattr();
        if(this.isLogin(request)){
            viewattr.setFragment_id("timeline");
            viewattr.setFragment_path("shared/timeline");
            List<MessageWithComments> messageWithComments = messageService.getMessageWithComments(this.getUserId(request));
            int userId = this.getUserId(request);
            List<Groups> groupsList = groupService.loadGroupsByUserId(userId);
            User user = userService.getUserById(userId);
            model.addAttribute("user",user);
            model.addAttribute("groupsList",groupsList);
            model.addAttribute("messages",messageWithComments);
            int count = notificationsService.loadUnreadNotificationCount(userId);
            model.addAttribute("noticeCount1",count);
        }else {
            if (result) {
                User user = userService.getUserByUsername(userLogin.getUsername());
                this.setSession(request, user.getIdu());
                viewattr.setFragment_id("timeline");
                viewattr.setFragment_path("shared/timeline");
                List<MessageWithComments> messageWithComments = messageService.getMessageWithComments(user.getIdu());
                model.addAttribute("messages",messageWithComments);
                int userId = this.getUserId(request);
                User user1 = userService.getUserById(userId);
                model.addAttribute("user",user1);
                List<Groups> groupsList = groupService.loadGroupsByUserId(userId);
                model.addAttribute("groupsList",groupsList);
                int count = notificationsService.loadUnreadNotificationCount(userId);
                model.addAttribute("noticeCount1",count);
            } else {

                model.addAttribute("errormsg","用户名或密码不对");
                viewattr.setFragment_id("content");
                viewattr.setFragment_path("welcome/content");
            }
        }
        model.addAttribute("viewattr",viewattr);
        return "wrapper";
    }
    /*
    目前返回前端页面的方式采用 “拼接”的方式  wrapper = content + ...
    似乎没有大问题
    th:include="${字符串}"这样是不行的
    但是
    th:include="${属性1 :: 属性2}"这样是可以的 todo 再讲吧
     */


    @RequestMapping("/test")
    public String  test(Model model) {
        Viewattr viewattr =new Viewattr();
        System.out.println("sss");
        viewattr.setFragment_id("row");
        viewattr.setFragment_path("messages/rows");
        model.addAttribute("viewattr",viewattr);
        return "wrapper";
    }
}
