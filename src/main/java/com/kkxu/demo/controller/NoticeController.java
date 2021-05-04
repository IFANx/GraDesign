package com.kkxu.demo.controller;

import com.kkxu.demo.common.domain.Notice;
import com.kkxu.demo.service.NoticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class NoticeController {
    @Autowired
    NoticeService noticeService;

    @RequestMapping ("/notice")
    public String  Notice(ModelMap modelMap){
        List<Notice> notices=noticeService.allnotice();
        Notice notice0 = notices.get(0);
        Notice notice1= notices.get(1);
        Notice notice2 = notices.get(2);
        Notice notice3 = notices.get(3);
        Notice notice4 = notices.get(4);
        modelMap.addAttribute("notice0",notice0);
        modelMap.addAttribute("notice1",notice1);
        modelMap.addAttribute("notice2",notice2);
        modelMap.addAttribute("notice3",notice3);
        modelMap.addAttribute("notice4",notice4);
        return "faq";
    }
}
