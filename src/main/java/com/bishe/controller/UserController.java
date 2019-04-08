package com.bishe.controller;

import com.bishe.Http.Response;
import com.bishe.Parameter.UserLogin;
import com.bishe.Parameter.UserRegister;
import com.bishe.model.Messages;
import com.bishe.model.User;
import com.bishe.service.MessageService;
import com.bishe.service.UserService;
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

    boolean isLogin(HttpServletRequest request){
        HttpSession httpSession = request.getSession();
        if(httpSession.getAttribute("userid")!=null){
            return true;
        }
        return false;
    }
    void setSession(HttpServletRequest request,int userId){
        HttpSession httpSession = request.getSession();
        httpSession.setAttribute("userid",userId);
//        if(httpSession.getAttribute("userid")!=null){
//            return true;
//        }
    }
    @RequestMapping("/register")
    String reg(@Valid UserRegister userRegister, BindingResult bindingResult, Model model, HttpServletRequest request){

        if(bindingResult.hasErrors()){
//            return null;
            for(ObjectError error:bindingResult.getAllErrors()){
                System.out.println(error.getDefaultMessage());
            }
            return null;
        }

        Viewattr viewattr =new Viewattr();
        if(this.isLogin(request)){
            viewattr.setFragment_id("timeline");
            viewattr.setFragment_path("shared/timeline");
            List<UserMessage> messagesList = messageService.getUserMessageList(10,1,(int)request.getSession().getAttribute("userid"));
        }else{
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
                    List<UserMessage> messagesList = messageService.getUserMessageList(10,1,userId);

                    model.addAttribute("messages",messagesList);
                }
            }
        }
        model.addAttribute("viewattr",viewattr);
        return "wrapper";
    }
    @RequestMapping("/login")
    String login(Model model,UserLogin userLogin,HttpServletRequest request){
        boolean result = userService.checkPwd(userLogin.getUsername(),userLogin.getPassword());
        Viewattr viewattr =new Viewattr();
        if(result){
            User user = userService.getUserByUsername(userLogin.getUsername());
            this.setSession(request,user.getIdu());
            viewattr.setFragment_id("content");
            viewattr.setFragment_path("feed/content");
        }else{
            viewattr.setFragment_id("content");
            viewattr.setFragment_path("welcome/content");
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
