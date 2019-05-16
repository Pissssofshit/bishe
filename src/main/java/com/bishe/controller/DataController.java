package com.bishe.controller;

import com.bishe.Http.HttpRequest;
import com.bishe.Http.Response;
import com.bishe.Util.FileUtils;
import com.bishe.dao.ClusterMapper;
import com.bishe.data.MongoDBUtil;
import com.bishe.model.*;
import com.bishe.service.GroupService;
import com.bishe.service.MessageService;
import com.bishe.service.UserService;
import com.bishe.tmp.GroupWithMember;
import com.bishe.tmp.MessageWithComments;
import com.bishe.tmp.Viewattr;
import com.fasterxml.jackson.databind.util.JSONPObject;
import com.mongodb.Block;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import net.sf.json.JSON;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.bson.Document;
import org.bson.conversions.Bson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/data")
public class DataController {

    @Autowired
    MessageService messageService;
    @Autowired
    UserService userService;
    @Autowired
    ClusterMapper clusterMapper;

    @ResponseBody
    @RequestMapping("/getRecommandList")
    public List<User> getRecommandList(@RequestParam(value = "type",required = false) int type,HttpServletRequest request){
        int userId = userService.getUserId(request);
        Cluster cluster = clusterMapper.selectByUserId(userId);
        List<Integer> userIdList = clusterMapper.getTheSameClusterByClusterId(cluster.getClusterId());
        List<User> userList = new ArrayList<>();
        for (Integer userId2:userIdList
             ) {
            User user = userService.getUserById(userId2);
            userList.add(user);
        }
        return userList;
    }

    @ResponseBody
    @RequestMapping("/te2")
    public void test2(){
        MongoCollection<Document> collection = MongoDBUtil.getConnect().getCollection("t");

        Bson filter2 = Filters.eq("ssss", "sdgg");
        //指定查询过滤器查询
        FindIterable findIterable = collection.find(filter2);
        MongoCursor cursor = findIterable.iterator();
        while (cursor.hasNext()) {
            Document object =(Document) cursor.next();

//            Bson filter = Filters.eq("ssss",(String)object.get("ssss"));
//            Document document2;
//            if(object.containsKey("age")){
//                document2 = new Document("$set", new Document("age", 1+(int)object.get("age")));
//            }else{
//                document2 = new Document("$set", new Document("age", 1));
//            }
//
//            //修改单个文档
//            collection.updateMany(filter, document2);
//            System.out.println(cursor.next());

        }


//        Bson filter = Filters.eq("ssss", "sds");
        //指定修改的更新文档
//        Document document2 = new Document("$set", new Document("ff", 100));
//
//        //修改单个文档
//        collection.updateOne(filter, document2);
    }
    @ResponseBody
    @RequestMapping("/te3")
    public void te3(){
//        MongoCollection<Document> collection = MongoDBUtil.getConnect().getCollection("t");
//
//        Bson filter2 = Filters.eq("ssss", "sdgg");
//        //指定查询过滤器查询
//        FindIterable findIterable = collection.find(filter2);
//        MongoCursor cursor = findIterable.iterator();
//        boolean ttt = cursor.hasNext();
//        if(!ttt){
//            Document document = new Document("userId","")
//        }
    }
    @ResponseBody
    @RequestMapping("/te")
    public void test(){

        List<Messages> messagesList = messageService.getAllMessageWithGeo();

        for (Messages messages:messagesList
             ) {
            JSONObject jsonObject = HttpRequest.sendGet("https://restapi.amap.com/v3/geocode/regeo", "output=json&location="+messages.getLongitude()+","+messages.getLatitude()+"&key=cdba47e109636c5c0526fc46d5ffe69b&radius=1000&extensions=all");
            if(jsonObject.has("regeocode")){
                JSONObject object = (JSONObject)jsonObject.get("regeocode");
                if(object.has("pois")){
                    JSONArray object1 = (JSONArray) object.get("pois");
                    if(object1.size()==0)
                        continue;
                    JSONObject object2 = (JSONObject) object1.get(0);
                    String type = (String)object2.get("type");
                    System.out.println(type);

                    if(type.indexOf("科教文化")!=-1){
                        type = "科教文化";
                    }else if(type.indexOf("住宅")!=-1){
                        type = "住宅";
                    }else if(type.indexOf("景")!=-1){
                        type = "景";
                    }else if(type.indexOf("商务")!=-1){
                        type = "商务";
                    }else{
                        continue;
                    }
                    MongoCollection<Document> collection = MongoDBUtil.getConnect().getCollection("t");
                    Bson filter2 = Filters.eq("userId", messages.getUid());
                    //指定查询过滤器查询
                    FindIterable findIterable = collection.find(filter2);
                    MongoCursor cursor = findIterable.iterator();
                    boolean ttt = cursor.hasNext();
                    Document document;
                    if(!ttt){
                        document = new Document("userId",messages.getUid());
                        collection.insertOne(document);
                    }else{
                        document = (Document) cursor.next();
                    }

                    Document document2;
                    if(document.containsKey(type)){
                        document2 = new Document("$set", new Document(type, 1+(int)document.get(type)));
                    }else{
                        document2 = new Document("$set", new Document(type, 1));
                    }

                    //修改单个文档
                    collection.updateMany(filter2, document2);
                }
            }

        }
    }
}
