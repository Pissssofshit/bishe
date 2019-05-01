package com.bishe.service;

import com.bishe.Parameter.UserRegister;
import com.bishe.dao.UserMapper;
//import com.bishe.model.Users;
import com.bishe.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Component
public class UserService {

    @Autowired
    UserMapper userMapper;


    public boolean checkPwd(String username,String password){

        User user = userMapper.selectByUserName(username);
        if(user==null){
            return false;
        }
        if(user.getPassword().equals(password)){
            return true;
        }
        return false;
    }
    public int getUserId(HttpServletRequest request){
        HttpSession httpSession = request.getSession();
        return (int)httpSession.getAttribute("userid");
    }
    public User getUserById(Integer userId){
        return userMapper.selectByPrimaryKey(userId);
    }

    public Integer registerUser(UserRegister userRegister){
        User newUser = new User();
        newUser.setUsername(userRegister.getUsername());
        newUser.setPassword(userRegister.getPassword());
        userMapper.insert(newUser);

        return newUser.getIdu();
    }
    public User getUserByUsername(String username){
        User user = userMapper.selectByUserName(username);
        return user;
    }
}
