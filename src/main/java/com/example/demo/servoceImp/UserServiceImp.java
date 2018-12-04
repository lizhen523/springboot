package com.example.demo.servoceImp;

import com.example.demo.mapper.UserMapper;
import com.example.demo.model.User;
import com.example.demo.service.UserService;
import com.github.pagehelper.Page;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("userService")
public class UserServiceImp implements UserService {
    @Resource
    private UserMapper userMapper;

    @Override
    public Page<User> getUsers() {
        return userMapper.getUser();
    }

    @Override
    @Cacheable(cacheNames = "user",key = "#id")
    public User selectById(long id) {
        return userMapper.selectByPrimaryKey(id);
    }

    @Override
    @CacheEvict(value = "user",key = "#id")
    public void evictUser(Long id) {
        System.out.println("evict user"+id);
    }

}
