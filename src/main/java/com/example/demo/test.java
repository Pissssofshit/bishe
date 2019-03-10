package com.example.demo;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;
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