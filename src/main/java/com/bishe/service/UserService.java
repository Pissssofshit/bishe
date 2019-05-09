package com.bishe.service;

import com.bishe.Parameter.UserRegister;
import com.bishe.Util.LocationUtil;
import com.bishe.dao.FriendshipsMapper;
import com.bishe.dao.UserMapper;
//import com.bishe.model.Users;
import com.bishe.model.Friendships;
import com.bishe.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@Component
public class UserService {

    @Autowired
    UserMapper userMapper;

    @Autowired
    FriendshipsMapper friendshipsMapper;

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

    public double distanceBetweenUsers(User user1,User user2){
        double lat1 = user1.getLastloginlat();
        double long1 = user1.getLastloginlong();
        double lat2 = user2.getLastloginlat();
        double long2 = user2.getLastloginlong();
        return LocationUtil.getDistance(lat1,long1,lat2,long2);
    }
    public void updateUserLocation(int userId,Double latitude,Double longitude,String address){
        if(latitude==null || longitude ==null){
            return;
        }
        User user = this.getUserById(userId);
        user.setLastloginlat(latitude);
        user.setLastloginlong(longitude);
        user.setAddress(address);
        userMapper.updateByPrimaryKey(user);
    }
    public List<User> getAroundUser(int userId){
        User user= this.getUserById(userId);

        List<User> resultList = new ArrayList<>();
        List<User> userList = this.getWillPushUser();
        for (User tmp:
             userList) {
            if(user.getIdu()==tmp.getIdu()){
                continue;
            }
            double distance = this.distanceBetweenUsers(user,tmp);
            if(distance>500){
                continue;
            }
            resultList.add(tmp);
        }
        return resultList;
    }
    List<User> getWillPushUser(){
        return userMapper.getWillPushUser();
    }
    public List<Integer> getFriendsId(int userId){
        //for shame sheldon
        List<Friendships> friendshipsList =  friendshipsMapper.selectFriendsId(userId);
        List<Integer> userIdList = new ArrayList<>();
        for (Friendships friendships:friendshipsList
             ) {
            if(friendships.getUser1()==userId){
                userIdList.add(friendships.getUser2());
            }else{
                userIdList.add(friendships.getUser1());
            }
        }
        return userIdList;
    }
    public boolean updateUser(User user){
        User user1 = this.getUserById(user.getIdu());
        if(user1==null){
            return false;
        }
        user1.setCover(user.getCover());
        user1.setUsername(user.getUsername());
        //为啥不给我写成动态sql
        userMapper.updateByPrimaryKey(user1);
        return true;
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

    public boolean isFriends(Integer userId1,Integer userId2){
        if(userId1==userId2){
            return true;
        }
        Friendships friendships = friendshipsMapper.selectByUserIds(userId1,userId2);
        if(friendships==null){
            return false;
        }
        return true;
    }

    public User getUserByUsername(String username){
        User user = userMapper.selectByUserName(username);
        return user;
    }
    public List<User> getUserByLikeUsername(String username){
        List<User> userList = userMapper.selectByLikeUserName(username);
        return userList;
    }
}
