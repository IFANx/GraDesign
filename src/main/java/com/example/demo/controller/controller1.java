package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
//merge 测试
@RestController
public class controller1 {
    @GetMapping("/test1")
    public String test1(){
        return "okok";
    }
}
