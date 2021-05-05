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

import javax.servlet.http.HttpSession;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

//@RequestMapping("/Trains")
@Controller
public class ScheduleOfTrainsController {

    @Autowired
    private ScheduleOfTrainsService scheduleOfTrainsService;

    @RequestMapping("/schedulepart")
    public Object schedulepart(ModelMap modelMap, String train_number) {
        List<Schedule_Of_Trains> trainlist = scheduleOfTrainsService.listpart();
        modelMap.addAttribute("trainlist", trainlist);
        return "trainlist";
    }

    @RequestMapping("/scheduleOfTrainsbytrain_number")
    public Object scheduleOfTrainsbytrain_number(ModelMap modelMap, String train_number) {
        List<Schedule_Of_Trains> trainlist = scheduleOfTrainsService.Trainsbytrain_number(train_number);
        Schedule_Of_Trains schedule_of_trains = trainlist.get(0);
        modelMap.addAttribute("schedule_of_trains", schedule_of_trains);
        return "pricing";
    }

    @RequestMapping("/scheduleOfTrainsbyid")
    public Object scheduleOfTrainsbyid(ModelMap modelMap, int train_id) {
        List<Schedule_Of_Trains> schedule_of_trains = scheduleOfTrainsService.Trainsbytrain_id(train_id);
        modelMap.addAttribute("trainlist", schedule_of_trains);
        return "index";
    }


    @RequestMapping("/seatTrainsbyno")
    @ResponseBody
    public Object seatTrainsbyno(ModelMap modelMap, String train_no) {
        List<Seat> seats = scheduleOfTrainsService.seatTrainsbyno(train_no);
        modelMap.addAttribute("seatlist", seats);
        return seats;
    }

    //给定起点终点求出途径所有站点 换乘
    @RequestMapping("/scheduleOfTrainfromstationtotostation")
    @ResponseBody
    public Object scheduleOfTrainPassBy(ModelMap modelMap, String start, String stop) {
        List<String> fromstations = new LinkedList<>();
        List<Schedule_Of_Trains> result=new LinkedList<>();
        //获得以start为起点的所有终点站
        List<Schedule_Of_Trains> startstation = scheduleOfTrainsService.tostation(start);
        Iterator<Schedule_Of_Trains> iterator = startstation.iterator();
        Schedule_Of_Trains s;
        while(iterator.hasNext()){
            s=iterator.next();
            if(s.getToStation().equals(stop)&&!result.contains(s));
            result.add(s);
        }
        return  result;

    }

    //分页
    @GetMapping("/gettrains")
    @ResponseBody
    public Object gettrains(@RequestParam(defaultValue = "1") int pageNo, @RequestParam(defaultValue = "10")int pageSize){
        return Result.success(scheduleOfTrainsService.findtrains(pageNo,pageSize),"分页 查询trains 对象");
    }
    @GetMapping("/listtrains")
    public String toTrainListPage(){
        return "trainlist";
    }



    @GetMapping("/scheduleOfTrainsbydepartureandend")
    @ResponseBody
    public Object scheduleOfTrainsbydepartureandend(HttpSession session, @RequestParam(defaultValue = "1") int pageNo, @RequestParam(defaultValue = "10")int pageSize){
//        return Result.success(scheduleOfTrainsService.scheduleOfTrainsbydepartureandend(departure_station, end_station, pageNo, pageSize), "分页 查询trains 对象");
        return Result.success(scheduleOfTrainsService.scheduleOfTrainsbydepartureandend((String) session.getAttribute("departure_station"), (String) session.getAttribute("end_station"), pageNo, pageSize), "分页 查询trains 对象");
//        return Result.success(scheduleOfTrainsService.scheduleOfTrainsbydepartureandend("北京","广州",pageNo,pageSize),"分页 查询trains 对象");
    }
    @GetMapping("/scheduleOfTrainsbydepartureandend1")
    public String scheduleOfTrainsbydepartureandendPage(HttpSession session,String departure_station, String end_station){
        session.setAttribute("departure_station",departure_station);
        session.setAttribute("end_station",end_station);
        return "trainlist2";
    }



}