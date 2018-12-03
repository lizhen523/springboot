package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class IndexController {
    @GetMapping("/index")
    public ModelAndView index(){
        ModelAndView view = new ModelAndView("index");
        view.addObject("userName", "蝈蝈");
        return view;
    }
}
