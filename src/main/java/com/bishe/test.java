package com.bishe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class test {
    @RequestMapping("/")
    String home() {
        return "Hello Worldsss!";
    }
    @RequestMapping("/")
    String homes() {
        return "Hello Worldsss!";
    }
    public static void main(String[] args) throws Exception {
        SpringApplication.run(test.class, args);
    }
}