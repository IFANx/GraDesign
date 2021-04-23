package com.kkxu.demo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

    @Configuration
    public class MyMVCconfig implements WebMvcConfigurer {
        @Override
        public void addViewControllers(ViewControllerRegistry registry)
        {
            registry.addViewController("/").setViewName("SearchTrain");
            registry.addViewController("SearchTrain.html").setViewName("SearchTrain");
//            E:\2021毕业\毕设项目\Online-Shopping-System\src\main\resources\templates\E:\2021毕业\毕设项目\Online-Shopping-System\src\main\resources\templates\TrainSchedule\SearchTrain.html
        }
    }

