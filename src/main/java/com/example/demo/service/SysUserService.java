package com.example.demo.service;

import com.example.demo.model.SysUser;

/**
 * @Description
 * @Author sgl
 * @Date 2018-06-11 17:10
 */
public interface SysUserService {
    SysUser findByUserName(String userName);
}
