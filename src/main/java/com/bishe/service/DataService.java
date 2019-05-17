package com.bishe.service;

import com.bishe.dao.*;
import com.bishe.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.function.Predicate;

@Component
public class DataService {
    @Autowired
    ClusterMapper clusterMapper;

    @Autowired
    ClusterpreferenceMapper clusterpreferenceMapper;

    @Autowired
    UserService userService;

    public List<User> getRecommandListPreference(int userId,int type){
        Clusterpreference clusterpreference = clusterpreferenceMapper.selectByUserIdAndType(userId,type);
        List<Integer> userIdList = clusterpreferenceMapper.getTheSameClusterByClusterIdAndType(clusterpreference.getClusterId(),type,userId);
        List<User> userList = new ArrayList<>();
        List<Integer> friendIdList = userService.getFriendsId(userId);
//       userIdList.removeIf(new Predicate<Integer>() {
//           @Override
//           public boolean test(Integer integer) {
//               if(friendIdList.contains(integer)){
//                   return true;
//               }else{
//                   return false;
//               }
//           }
//       });
//       userIdList.removeAll(friendIdList);
//       intersting
//       userIdList.remove(userId);
        for(int i=0;i<userIdList.size();i++){
            if(userIdList.get(i)==userId){
                userIdList.remove(i);
                break;
            }
        }
        for(int j=0;j<friendIdList.size();j++){
            for(int i=0;i<userIdList.size();i++){
                if(userIdList.get(i)==friendIdList.get(j)){
                    userIdList.remove(i);
                    i=userIdList.size();
                    continue;
                }
            }
        }

        for (Integer userId2:userIdList
        ) {
            User user = userService.getUserById(userId2);
            userList.add(user);
        }
        return userList;
    }
    public List<User> getRecommandList(int userId){
       Cluster cluster = clusterMapper.selectByUserId(userId);
       List<Integer> userIdList = clusterMapper.getTheSameClusterByClusterId(cluster.getClusterId());
       List<User> userList = new ArrayList<>();
       List<Integer> friendIdList = userService.getFriendsId(userId);
//       userIdList.removeIf(new Predicate<Integer>() {
//           @Override
//           public boolean test(Integer integer) {
//               if(friendIdList.contains(integer)){
//                   return true;
//               }else{
//                   return false;
//               }
//           }
//       });
//       userIdList.removeAll(friendIdList);
//       intersting
//       userIdList.remove(userId);
        for(int i=0;i<userIdList.size();i++){
            if(userIdList.get(i)==userId){
                userIdList.remove(i);
                break;
            }
        }
        for(int j=0;j<friendIdList.size();j++){
            for(int i=0;i<userIdList.size();i++){
                if(userIdList.get(i)==friendIdList.get(j)){
                    userIdList.remove(i);
                    i=userIdList.size();
                    continue;
                }
            }
        }

       for (Integer userId2:userIdList
       ) {
           User user = userService.getUserById(userId2);
           userList.add(user);
       }
       return userList;
   }
}
