package com.example.demo.model;

import lombok.Data;

import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @Description
 * @Author sgl
 * @Date 2018-05-02 14:59
 */
@Data
@Table(name = "tbl_user")
public class User {
    @Id
    private Long userId;
    private String userName;
    private Integer userAge;
}
