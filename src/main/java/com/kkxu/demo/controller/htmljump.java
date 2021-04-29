package com.kkxu.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class htmljump {
    @RequestMapping("/about")
    public String about() {
        return "about";
    }

    @RequestMapping("/contact")
    public String contact() {
        return "contact";
    }

    @RequestMapping("/index")
    public String index() {
        return "index";
    }

    @RequestMapping("/toregister")
    public String toregister() {
        return "register";
    }
    @RequestMapping("/tologin")
    public String tologin() {
        return "login";
    }

    @RequestMapping("/services")
    public String services() {
        return "services";

    }

    @RequestMapping("/pricing")
    public String pricing() {
        return "pricing";

    }
    @RequestMapping("/test")
    public String test() {
        return "test";

    }@RequestMapping("/test2")
    public String test2() {
        return "test2";

    }

    @RequestMapping("/Portfolio")
    public String Portfolio() {
        return "portfolio";
    }

    @RequestMapping("/jumpregister")
    public String jumpregister() {
        return "register";
    }

    @RequestMapping("/jumplogin")
    public String jumplogin() {
        return "login";
    }

    @RequestMapping("/blogsingle")
    public String jumpblogsingle() {
        return "blog-single";
    }

    @RequestMapping("/faq")
    public String jumpfaq() {
        return "faq";
    }
}
