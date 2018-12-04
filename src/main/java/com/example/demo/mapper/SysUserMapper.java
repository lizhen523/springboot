package com.example.demo.mapper;

import com.example.demo.model.SysUser;

public interface SysUserMapper {
    SysUser findByUserName(String userName);
}