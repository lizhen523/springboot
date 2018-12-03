package com.example.demo.mapper;

import com.example.demo.common.BaseMapper;
import com.example.demo.model.User;
import com.github.pagehelper.Page;
public interface UserMapper extends BaseMapper<User>{
    Page<User> getUser();
}
