package com.bishe.controller;

import com.bishe.Http.Response;
import com.bishe.model.Notifications;
import com.bishe.service.MessageService;
import com.bishe.service.NotificationsService;
import com.bishe.service.UserService;
import com.bishe.tmp.NoticeMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/notice")
public class NoticeController {

    @Autowired
    UserService userService;
    @Autowired
    MessageService messageService;
    @Autowired
    NotificationsService notificationsService;

    @RequestMapping("/noticeList")
    public String checkNoticeList(Model model, HttpServletRequest httpServletRequest){
        int userId = userService.getUserId(httpServletRequest);
        List<Notifications> notificationsList = notificationsService.getNotificationsByUserId(userId);
        List<NoticeMessage> noticeMessageList = notificationsService.noticeToMessage(notificationsList);

        model.addAttribute("noticelist",noticeMessageList);
        return "/notice/noticelist::noticelist";
    }

}
