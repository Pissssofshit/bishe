package com.bishe.data;

import com.bishe.Http.HttpRequest;

public class testClass {
    public static void main(String[] args) {
        //发送 GET 请求
        HttpRequest.sendGet("https://restapi.amap.com/v3/geocode/geo", "address=北京市朝阳区阜通东大街6号&extentions=all&poitype&output=json&key=cdba47e109636c5c0526fc46d5ffe69b");
//        System.out.println(s);

        //发送 POST 请求
//        String sr=HttpRequest.sendPost("http://localhost:6144/Home/RequestPostString", "key=123&v=456");
//        System.out.println(sr);
    }
}
