package com.kkxu.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class htmljump {
    @RequestMapping("/about")
    public String about(){
        return "about";
    }
    @RequestMapping("/contact")
    public String contact(){
        return "contact";
    }
    @RequestMapping("/index")
    public String index(){
        return "index";
    }
    @RequestMapping("/services")
    public String services(){
        return "services";

    } @RequestMapping("/pricing")
    public String pricing(){
        return "pricing";

    } @RequestMapping("/Portfolio")
    public String Portfolio(){
        return "portfolio";
    }

    @RequestMapping("/jumplogin")
    public String jumplogin(){
        return "register";
    }
}
