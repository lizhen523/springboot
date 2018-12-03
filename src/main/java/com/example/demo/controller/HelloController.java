package com.example.demo.controller;

import com.example.demo.model.TestEntity;
import com.example.demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Autowired
    private User user;
    @Autowired
    private TestEntity testEntity;

    @Value("${pocket.name}")
    private String name;

    @Value("${pocket.age}")
    private String age;

    @Value("${pocket.address}")
    private String address;

    private String home;

    @GetMapping("/hello")
    public String hello(){
        return "大家好，我的名字是" + name + "，我今年" + age + "岁了，我在" + address+"工作！"+home;

}
    @GetMapping("/test")
    public TestEntity testEntity(){
        return testEntity;
    }

}
