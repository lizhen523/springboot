package com.example.demo.service;

import com.example.demo.model.User;
import com.github.pagehelper.Page;

public interface UserService {
    Page<User> getUsers();
    User selectById(long id);

    public void evictUser(Long id);
}


