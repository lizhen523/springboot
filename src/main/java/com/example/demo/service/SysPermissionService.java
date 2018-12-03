package com.example.demo.service;

import java.util.List;

/**
 * @Description
 * @Author sgl
 * @Date 2018-06-11 17:10
 */
public interface SysPermissionService {
    public List<String> selectPermissionByUserId(long userId) ;
}
