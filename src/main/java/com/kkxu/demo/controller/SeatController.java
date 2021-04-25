package com.kkxu.demo.controller;

import com.kkxu.demo.common.domain.Seat;
import com.kkxu.demo.service.ScheduleOfTrainsService;
import com.kkxu.demo.service.SeatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/Seat")
public class SeatController {
    @Autowired
    private SeatService seatService;
    @RequestMapping("/Seatinfo")
    public String  seatinfo(ModelMap modelMap,String train_no){
        List<Seat> seats=seatService.gettseatinfobyid(train_no);
        modelMap.addAttribute("seats",seats);
        return "seatinfo";

    }
}
