package com.example.demo.servoceImp;

import com.example.demo.mapper.SysPermissionMapper;
import com.example.demo.service.SysPermissionService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("sysPermissionService")
public class SysPermissionServiceImp implements SysPermissionService {
    @Resource
    private SysPermissionMapper sysPermissionMapper;
    @Override
    public List<String> selectPermissionByUserId(long userId) {
        return sysPermissionMapper.selectPermissionByUserId(userId);
    }
}
