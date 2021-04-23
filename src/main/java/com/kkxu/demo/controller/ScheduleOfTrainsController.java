package com.kkxu.demo.controller;

import com.kkxu.demo.common.domain.Schedule_Of_Trains;
import com.kkxu.demo.common.domain.Seat;
import com.kkxu.demo.service.ScheduleOfTrainsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@RequestMapping("/Trains")
@Controller
public class ScheduleOfTrainsController {

    @Autowired
    private ScheduleOfTrainsService scheduleOfTrainsService;

    @RequestMapping("/scheduleOfTrainsbytrain_number")
    public Object scheduleOfTrainsbytrain_number(ModelMap modelMap,String train_number) {
        List<Schedule_Of_Trains> trainlist = scheduleOfTrainsService.Trainsbytrain_number(train_number);
        modelMap.addAttribute("trainlist", trainlist);
        return "trainlist";
    }

    @RequestMapping("/scheduleOfTrainsbyid")
    @ResponseBody
    public Object scheduleOfTrainsbyid(ModelMap modelMap,int train_id) {
        List<Schedule_Of_Trains> schedule_of_trains = scheduleOfTrainsService.Trainsbytrain_id(train_id);
        modelMap.addAttribute("trainlist", schedule_of_trains);
        return schedule_of_trains;
    }

    @RequestMapping("/scheduleOfTrainsbydepartureandend")
    public Object scheduleOfTrainsbydepartureandend(ModelMap modelMap,String departure_station,String end_station) {
        List<Schedule_Of_Trains> trainlist = scheduleOfTrainsService.Trainsbybydepartureandend(departure_station,end_station);
        modelMap.addAttribute("trainlist", trainlist);
        return "trainlist";
    }
    @RequestMapping("/seatTrainsbyno")
    @ResponseBody
    public Object seatTrainsbyno(ModelMap modelMap,String train_no) {
        List<Seat> seats = scheduleOfTrainsService.seatTrainsbyno(train_no);
        modelMap.addAttribute("seatlist", seats);
        return seats;
    }

}
