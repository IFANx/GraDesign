package com.kkxu.demo.controller;

import com.kkxu.demo.common.domain.Schedule_Of_Trains;
import com.kkxu.demo.common.domain.Seat;
import com.kkxu.demo.common.utils.Result;
import com.kkxu.demo.service.ScheduleOfTrainsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

//@RequestMapping("/Trains")
@Controller
public class ScheduleOfTrainsController {

    @Autowired
    private ScheduleOfTrainsService scheduleOfTrainsService;

    @RequestMapping("/schedulepart")
    public Object schedulepart(ModelMap modelMap,String train_number) {
        List<Schedule_Of_Trains> trainlist = scheduleOfTrainsService.listpart();
        modelMap.addAttribute("trainlist", trainlist);
        return "trainlist";
    }
    @RequestMapping("/scheduleOfTrainsbytrain_number")
    public Object scheduleOfTrainsbytrain_number(ModelMap modelMap,String train_number) {
        List<Schedule_Of_Trains> trainlist = scheduleOfTrainsService.Trainsbytrain_number(train_number);
        modelMap.addAttribute("trainlist", trainlist);
        return "trainlist";
    }

    @RequestMapping("/scheduleOfTrainsbyid")
    public Object scheduleOfTrainsbyid(ModelMap modelMap,int train_id) {
        List<Schedule_Of_Trains> schedule_of_trains = scheduleOfTrainsService.Trainsbytrain_id(train_id);
        modelMap.addAttribute("trainlist", schedule_of_trains);
        return "index";
    }

    @RequestMapping("/scheduleOfTrainsbydepartureandend")
    public Object scheduleOfTrainsbydepartureandend(ModelMap modelMap,String departure_station,String end_station) {
        List<Schedule_Of_Trains> trainlist = scheduleOfTrainsService.Trainsbybydepartureandend(departure_station,end_station);
        modelMap.addAttribute("trainlist", trainlist);
        return "trainlist";
//        return "index";
    }
    @RequestMapping("/seatTrainsbyno")
    @ResponseBody
    public Object seatTrainsbyno(ModelMap modelMap,String train_no) {
        List<Seat> seats = scheduleOfTrainsService.seatTrainsbyno(train_no);
        modelMap.addAttribute("seatlist", seats);
        return seats;
    }

    //求出途径所有站点
    @RequestMapping("/scheduleOfTrainPassBy")
    public Object scheduleOfTrainPassBy(ModelMap modelMap,String departure_station,String end_station) {
        List<Schedule_Of_Trains> trains = scheduleOfTrainsService.TrainPassBy(departure_station,end_station);
        modelMap.addAttribute("trainlist", trains);
        return "trainlist";
    }

    //分页
    @GetMapping("/gettrains")
    @ResponseBody
    public Object gettrains(@RequestParam(defaultValue = "1") int pageNo, @RequestParam(defaultValue = "10")int pageSize){
        return Result.success(scheduleOfTrainsService.findtrains(pageNo,pageSize),"分页 查询trains 对象");
    }

    @GetMapping("/listtrains")
    public String toTrainListPage(){

        return "test";
    }
}
