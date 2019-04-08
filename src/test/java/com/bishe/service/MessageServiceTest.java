package com.bishe.service;

import com.bishe.model.Messages;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MessageServiceTest {
    @Autowired
    private MessageService messageService;

    @Test
    public void test(){
        List<Messages> tests = messageService.getMessageList(10,1,1);
        Assert.assertEquals(tests.size(),10);
    }
}