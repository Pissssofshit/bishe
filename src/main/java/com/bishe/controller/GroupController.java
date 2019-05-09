package com.bishe.controller;

import com.bishe.Http.Response;
import com.bishe.Parameter.UserLogin;
import com.bishe.Parameter.UserRegister;
import com.bishe.Util.FileUtils;
import com.bishe.model.*;
import com.bishe.service.GroupService;
import com.bishe.service.MessageService;
import com.bishe.service.UserService;
import com.bishe.tmp.GroupWithMember;
import com.bishe.tmp.MessageWithComments;
import com.bishe.tmp.UserMessage;
import com.bishe.tmp.Viewattr;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/group")
public class GroupController {

    @Autowired
    UserService userService;
    @Autowired
    MessageService messageService;
    @Autowired
    GroupService groupService;


    @RequestMapping("loadGroupMember")
    public String loadGroupMember(Model model,HttpServletRequest request,Integer groupId){
        List<User> userList = groupService.getGroupUsersById(groupId);
        model.addAttribute("memberList",userList);
        return "group/member::member";
    }
    @RequestMapping("loadGroupAdmin")
    public String loadGroupAdmin(Model model,HttpServletRequest request,Integer groupId){
        List<User> userList = groupService.getGroupAdminById(groupId);
        model.addAttribute("memberList",userList);
        return "group/member::member";
    }

    @Transactional
    @RequestMapping("creatGroup")
    public String createGroup(Model model,HttpServletRequest request, @RequestParam(value = "groupcover",required = false) MultipartFile file, Groups groups){
        String imgUrl = "";
        if(file!=null){
            imgUrl = FileUtils.saveImg(file);
        }
        groups.setCover(imgUrl);
        groups.setTime(new Date());
        groupService.createGroup(groups);
        int userId = userService.getUserId(request);
        groupService.joinGroup(groups.getId(),userId,1);

        return "redirect:/group/group?groupId="+groups.getId();
//        //todo to fix it later
//        Viewattr viewattr =new Viewattr();
//        viewattr.setFragment_id("group");
//        viewattr.setFragment_path("group/content");
//        Groups groups1 = groupService.getGroupByGroupId(groups.getId());
//        List<User> userList = groupService.getGroupUsersById(groups.getId());
//        GroupWithMember groupWithMember = new GroupWithMember();
//        groupWithMember.setGroups(groups1);
//        groupWithMember.setUserList(userList);
//        model.addAttribute("group",groupWithMember);
//        model.addAttribute("viewattr",viewattr);
//        return "wrapper";
    }

    @RequestMapping("CreateGroupView")
    public String CreateGroupView(Model model){
        Viewattr viewattr =new Viewattr();
        viewattr.setFragment_id("creategroup");
        viewattr.setFragment_path("group/edit");
        model.addAttribute("viewattr",viewattr);
        return "wrapper";
    }
    @RequestMapping("group")
    public String GroupView(Model model,Integer groupId){
        Viewattr viewattr =new Viewattr();
        viewattr.setFragment_id("group");
        viewattr.setFragment_path("group/content");
        Groups groups = groupService.getGroupByGroupId(groupId);
        List<User> userList = groupService.getGroupUsersById(groupId);
        GroupWithMember groupWithMember = new GroupWithMember();
        groupWithMember.setGroups(groups);
        groupWithMember.setUserList(userList);
        model.addAttribute("group",groupWithMember);
        model.addAttribute("viewattr",viewattr);
        return "wrapper";
    }
    @RequestMapping("/applyList")
    String applyList(Model model,HttpServletRequest request){
        int userId = userService.getUserId(request);
        List<Groupwithuser> groupwithuserList = groupService.getApplyList(userId);
        model.addAttribute("applyList",groupwithuserList);
        return "notice/groupApply::apply";
    }

    @ResponseBody
    @RequestMapping("/dealGroupApply")
    Response dealGroupApply(int groupId,int userId,int result){
        int realResult = 0;
        if(result ==0){
            groupService.rejectJoinGroup(userId,groupId);
        }else{
            groupService.agreeJoinGroup(userId,groupId);
        }
        Response response = new Response();
        return response;

    }

    @ResponseBody
    @RequestMapping("applyJoinGroup")
    Response applyJoinGroup(Integer groupId,HttpServletRequest request){

        int userId = userService.getUserId(request);
        groupService.applyGroup(groupId,userId);

        Response response = new Response();
        response.setCode(200);
        return response;
    }

}
