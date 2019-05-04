package com.bishe.controller;

import com.bishe.Http.Response;
import com.bishe.Parameter.UserLogin;
import com.bishe.Parameter.UserRegister;
import com.bishe.Util.FileUtils;
import com.bishe.model.Groups;
import com.bishe.model.User;
import com.bishe.service.GroupService;
import com.bishe.service.MessageService;
import com.bishe.service.UserService;
import com.bishe.tmp.GroupWithMember;
import com.bishe.tmp.MessageWithComments;
import com.bishe.tmp.UserMessage;
import com.bishe.tmp.Viewattr;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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

    @RequestMapping("creatGroup")
    public Response createGroup(HttpServletRequest request, @RequestParam(value = "groupcover",required = false) MultipartFile file, Groups groups){
        String imgUrl = "";
        if(file!=null){
            imgUrl = FileUtils.saveImg(file);
        }
        groups.setCover(imgUrl);
        groups.setTime(new Date());
        groupService.createGroup(groups);
        int userId = userService.getUserId(request);
        groupService.joinGroup(groups.getId(),userId,1);
        return new Response();
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
//        model.addAttribute("messages",messageService.getMessageWithComments(45));
        List<User> userList = groupService.getGroupUsersById(groupId);
        GroupWithMember groupWithMember = new GroupWithMember();
        groupWithMember.setGroups(groups);
        groupWithMember.setUserList(userList);
        model.addAttribute("group",groupWithMember);
        model.addAttribute("viewattr",viewattr);
        return "wrapper";
    }

}
