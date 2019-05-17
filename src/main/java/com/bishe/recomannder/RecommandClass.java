package com.bishe.recomannder;

import com.bishe.dao.ClusterMapper;
import com.bishe.dao.ClusterpreferenceMapper;
import com.bishe.data.MongoDBUtil;
import com.bishe.model.Clusterpreference;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.model.Filters;
import org.bson.Document;
import org.bson.conversions.Bson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.Set;

@Controller
@RequestMapping("/rec")
public class RecommandClass {

    @Autowired
    ClusterMapper clusterMapper;
    @Autowired
    ClusterpreferenceMapper clusterpreferenceMapper;


    @ResponseBody
    @RequestMapping("/calPersonal")
    public void calPersonal(){
        ArrayList<float[]> dataSet = new ArrayList<float[]>();


        MongoCollection<Document> collection = MongoDBUtil.getConnect().getCollection("t");
//        Bson filter2 = Filters.eq("userId", messages.getUid());
        //指定查询过滤器查询
        FindIterable findIterable = collection.find();
        MongoCursor cursor = findIterable.iterator();
        while(cursor.hasNext()){
            float[] floats = {1,1,1,1,1};
            Document document = (Document)cursor.next();

            Integer integer = (Integer)document.get("userId");
            int i = integer.intValue();
            floats[0] = (float)i;
            if(document.containsKey("景")){
                Integer integer2 = (Integer)document.get("userId");
                int i2 = integer.intValue();
                floats[1] = (float)i2;
            }else{
                floats[1]=0;
            }
            if(document.containsKey("住宅")){

                Integer integer2 = (Integer)document.get("userId");
                int i2 = integer.intValue();
                floats[2] = (float)i2;
            }else{
                floats[2]=0;
            }
            if(document.containsKey("商务")){
                Integer integer2 = (Integer)document.get("userId");
                int i2 = integer.intValue();
                floats[3] = (float)i2;
            }else{
                floats[3]=0;
            }
            if(document.containsKey("科教文化")){
                Integer integer2 = (Integer)document.get("userId");
                int i2 = integer.intValue();
                floats[4] = (float)i2;
            }else{
                floats[4]=0;
            }
            dataSet.add(floats);
        }
        for (int i = 0;i<dataSet.size();i++
             ) {
            float preference = (float)1.2;
            for(int j=1;j<5;j++){
                ArrayList<float[]> tmpSet = dataSet;
                float[] tmp = tmpSet.get(i);
                int userId = (int)tmp[0];
                tmp[j] = tmp[j]*preference;
                tmpSet.set(i,tmp);

                KMeansRun kRun =new KMeansRun(3, tmpSet);

                Set<Cluster> clusterSet = kRun.run();
                System.out.println("单次迭代运行次数："+kRun.getIterTimes());
                for (Cluster cluster : clusterSet) {
                    for (Point point:cluster.getMembers()
                    ) {
                        Clusterpreference clusterpreference = new Clusterpreference();
                        clusterpreference.setUserId(point.getId());
                        clusterpreference.setClusterId(cluster.getId());
                        clusterpreference.setType(j);
                        clusterpreference.setBeuserId(userId);
                        clusterpreferenceMapper.insert(clusterpreference);
                    }
                }
            }


        }
    }

    @ResponseBody
    @RequestMapping("/cal")
    public void cal() {
        ArrayList<float[]> dataSet = new ArrayList<float[]>();


        MongoCollection<Document> collection = MongoDBUtil.getConnect().getCollection("t");
//        Bson filter2 = Filters.eq("userId", messages.getUid());
        //指定查询过滤器查询
        FindIterable findIterable = collection.find();
        MongoCursor cursor = findIterable.iterator();
        while(cursor.hasNext()){
            float[] floats = {1,1,1,1,1};
            Document document = (Document)cursor.next();

            Integer integer = (Integer)document.get("userId");
            int i = integer.intValue();
            floats[0] = (float)i;
            if(document.containsKey("景")){
                Integer integer2 = (Integer)document.get("userId");
                int i2 = integer.intValue();
                floats[1] = (float)i2;
            }else{
                floats[1]=0;
            }
            if(document.containsKey("住宅")){

                Integer integer2 = (Integer)document.get("userId");
                int i2 = integer.intValue();
                floats[2] = (float)i2;
            }else{
                floats[2]=0;
            }
            if(document.containsKey("商务")){
                Integer integer2 = (Integer)document.get("userId");
                int i2 = integer.intValue();
                floats[3] = (float)i2;
            }else{
                floats[3]=0;
            }
            if(document.containsKey("科教文化")){
                Integer integer2 = (Integer)document.get("userId");
                int i2 = integer.intValue();
                floats[4] = (float)i2;
            }else{
                floats[4]=0;
            }
            dataSet.add(floats);
        }

        KMeansRun kRun =new KMeansRun(3, dataSet);

        Set<Cluster> clusterSet = kRun.run();
        System.out.println("单次迭代运行次数："+kRun.getIterTimes());
        for (Cluster cluster : clusterSet) {


            for (Point point:cluster.getMembers()
                 ) {
                com.bishe.model.Cluster cluster1 = new com.bishe.model.Cluster();
                cluster1.setUserId(point.getId());
                cluster1.setClusterId(cluster.getId());
                clusterMapper.insert(cluster1);
            }
        }
    }
}