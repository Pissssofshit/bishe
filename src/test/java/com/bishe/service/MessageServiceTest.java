package com.bishe.service;

import com.bishe.dao.LikesMapper;
import com.bishe.model.Likes;
import com.bishe.model.Messages;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MessageServiceTest {
    @Autowired
    private MessageService messageService;
    @Autowired
    private LikesMapper likesMapper;

    @Test
    public void test(){
        List<Messages> tests = messageService.getMessageList(10,1,1);
        Assert.assertEquals(tests.size(),10);
    }
    @Test
    @Transactional
    public void testLikeMessage(){
        Messages messages = messageService.getMessageById(1);
        messageService.likeMessage(1,1);

        Messages messages2 = messageService.getMessageById(1);
        Assert.assertEquals((long)messages.getLikes()+1,(long)messages2.getLikes());
        Likes likes = likesMapper.selectByUserIdandPostId(1,1);
        Assert.assertNotEquals(null,likes);
    }
}