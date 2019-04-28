package com.bishe.service;

import com.bishe.model.Comments;
import com.bishe.model.Usercommentview;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
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
public class CommentServiceTest {

    @Autowired
    CommentService commentService;

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    @Transactional
    public void postComments() {
        Comments comments = new Comments();
        comments.setUid(1);
        comments.setMessage("123");
        comments.setMid(10);
        Comments comments1 = commentService.postComments(comments);
        Assert.assertNotEquals((long)0,(long)comments1.getId());
    }

    @Test
    public void getMessageComments() {
        List<Usercommentview> result = commentService.getMessageComments(10);
        Assert.assertNotEquals((long)0,result.size());
    }
}