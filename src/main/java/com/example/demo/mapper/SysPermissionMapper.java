package com.example.demo.mapper;

import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SysPermissionMapper {
    List<String> selectPermissionByUserId(@Param("userId") long userId);
}