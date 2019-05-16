package com.bishe.Http;

import org.junit.Test;

import static org.junit.Assert.*;

public class HttpRequestTest {

    @Test
    public void sendGet() {
        HttpRequest.sendGet("https://restapi.amap.com/v3/geocode/regeo", "output=json&location=116.310003,39.991957&key=cdba47e109636c5c0526fc46d5ffe69b&radius=1000&extensions=all");
    }

    @Test
    public void sendPost() {
    }
}