package com.bishe.Interface;

import com.bishe.Http.Response;
import com.bishe.model.User;

public interface UserManager {

    Response register(User user);

    Response login(User user);

}
