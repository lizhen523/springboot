package com.example.demo.controller;

import com.example.demo.model.SysUser;
import org.apache.shiro.SecurityUtils;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {
   // @RequestMapping(value = {"/", "/index"})
    @GetMapping("/index")
    public String index(Model model){
        SysUser sysUser = (SysUser) SecurityUtils.getSubject().getPrincipal();
        model.addAttribute("userName", sysUser.getFullName());
        return "index";
    }
}
