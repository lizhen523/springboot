package com.example.demo.mapper;

import com.example.demo.model.SysUser;

/**
 * @Description
 * @Author sgl
 * @Date 2018-06-11 17:19
 */
public interface SysUserMapper {
    SysUser findByUserName(String userName);
}
