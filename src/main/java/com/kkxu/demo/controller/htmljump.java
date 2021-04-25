package com.kkxu.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class htmljump {
    @RequestMapping("/contact")
    public String contact(){
        return "about";
    }
    @RequestMapping("/jumplogin")
    public String jumplogin(){
        return "register";
    }
}
