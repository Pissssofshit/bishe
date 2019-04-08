package com.example.demo;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;
@RestController
@EnableAutoConfiguration
public class test {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(test.class, args);
    }
}