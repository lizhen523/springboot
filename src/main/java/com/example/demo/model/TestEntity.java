package com.example.demo.model;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Data
@Component
@ConfigurationProperties(prefix = "test")
@PropertySource("classpath:test.properties")
public class TestEntity {
    private  int randomInt;
//随机10以内
    private int randomIntMax;
//随机20-50
    private int randomIntMiddle;
//随机Long
    private long randomLong;
//字符串
    private String randomValue;
// uuid
   private  String randomUuid;
   private  Integer a;
}
