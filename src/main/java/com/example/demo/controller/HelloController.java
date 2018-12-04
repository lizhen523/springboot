package com.example.demo.controller;

import com.example.demo.model.TestEntity;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class HelloController {
    @Resource
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
