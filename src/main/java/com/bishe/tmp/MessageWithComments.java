package com.bishe.tmp;

import com.bishe.model.Usercommentview;
import com.bishe.model.Usermessageview;

import java.util.List;

public class MessageWithComments {
    Usermessageview usermessageviews;
    List<Usercommentview> userCommentList;

    public Usermessageview getUsermessageviews() {
        return usermessageviews;
    }

    public void setUsermessageviews(Usermessageview usermessageviews) {
        this.usermessageviews = usermessageviews;
    }

    public List<Usercommentview> getUserCommentList() {
        return userCommentList;
    }

    public void setUserCommentList(List<Usercommentview> userCommentList) {
        this.userCommentList = userCommentList;
    }
}
