package com.bishe.Interface;

import com.bishe.Http.Response;
import com.bishe.model.Article;

public interface FriendCycleManager {

    Response PushAricle(Article articel);

    Response deleteAricle(int articelid);

}
