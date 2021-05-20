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
    public Object scheduleOfTrainsbytrain_number(ModelMap modelMap, String train_number, String tostation) {
        List<Schedule_Of_Trains> trainlist = scheduleOfTrainsService.Trainsbytrain_number(train_number);
        Schedule_Of_Trains schedule_of_trains = null;
        List<String> stations = new LinkedList<>();
        Schedule_Of_Trains s;
        Iterator<Schedule_Of_Trains> iterator = trainlist.iterator();
        while (iterator.hasNext()) {
            s = iterator.next();
            if (!stations.contains(s.getToStation())) {
                stations.add(s.getToStation());
            }
            if (s.getToStation().equals(tostation)) {
                schedule_of_trains = s;
            }
        }
        modelMap.addAttribute("stations", stations);
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
    @RequestMapping("/transfer")
    public String scheduleOfTrainPassBy(HttpSession session, ModelMap modelMap) {
        List<String> fromstations = new LinkedList<>();
        List<Schedule_Of_Trains> result = new LinkedList<>();


        //利用session获得起点站和终点站
        String departure_station = (String) session.getAttribute("departure_station");
        String end_station = (String) session.getAttribute("end_station");

        //获得经过departure_station的所有列车
        List<Schedule_Of_Trains> startline = scheduleOfTrainsService.tostation(departure_station);
        Iterator<Schedule_Of_Trains> iterator = startline.iterator();
        Schedule_Of_Trains s1=null,s2=null;
        modelMap.addAttribute("start", startline);
        //获得经过end_station的所有列车

        List<Schedule_Of_Trains> endline = scheduleOfTrainsService.tostation(end_station);
        modelMap.addAttribute("end", endline);

        //过起始站的铁路线路数
        int line1 = startline.size();
        //过终点站的铁路线路数
        int line2 = endline.size();

        if (line1 > 0 && line2 > 0) {
            for (int i = 0; i < line1; i++) {
                List<String> stations1 = new LinkedList<>();
                List<String> stations2 = new LinkedList<>();
                List<Schedule_Of_Trains> selectbytrainno = scheduleOfTrainsService.selectbytrainno(startline.get(i).getTarinNo());
                Iterator<Schedule_Of_Trains> iterator1 = selectbytrainno.iterator();
                while (iterator1.hasNext()) {
                    s1 = iterator1.next();
                    if (!stations1.contains(s1.getToStation())) {
                        stations1.add(s1.getToStation());
                    }
                }
                System.out.println("1"+stations1);
                for (int j = 0; j < line2; j++) {
                    List<Schedule_Of_Trains> selectbytrainno2 = scheduleOfTrainsService.selectbytrainno(endline.get(j).getTarinNo());
                    Iterator<Schedule_Of_Trains> iterator2 = selectbytrainno2.iterator();
                    while (iterator2.hasNext()) {
                        s2 = iterator2.next();
                        if (!stations2.contains(s2.getToStation())) {
                            stations2.add(s2.getToStation());
                    }
                    }
                    System.out.println("2"+stations2);

                    for(int k=0;k<stations2.size();k++)
                    if(stations1.contains(stations2.get(k))) {
                        String transfer="中转建议为在--"+departure_station+"站--乘坐--"+s1.getTrainNumber()+"--号列车"+"经过--"+stations1+"--等站点，在--"+stations2.get(k)+"--站换乘--"+s2.getTrainNumber()+"--号列车经--"+stations2+"--到达终点站--"+end_station+"站";
                        modelMap.addAttribute("transstation",stations2.get(k));
                        modelMap.addAttribute("line1",s1.getTrainNumber());
                        modelMap.addAttribute("line2",s2.getTrainNumber());
                        modelMap.addAttribute("departure_station",departure_station);
                        modelMap.addAttribute("end_station",end_station);
                        modelMap.addAttribute("transfer",transfer);
                    }
                    stations2.clear();
                }

//                modelMap.addAttribute("s1",stations1);
//                modelMap.addAttribute("s2",stations2);
//
//
//                modelMap.addAttribute("message", "中转车次如下");
//                return "result";
            }
        } else {
            modelMap.addAttribute("message", "未查询到中转车次");
            return "result";
        }

//        while (iterator.hasNext()) {
//            s = iterator.next();
//            if (s.getToStation().equals(end_station) && !result.contains(s)) ;
//            result.add(s);
//        }
//        return "result";
return "result";
        }

    //分页
    @GetMapping("/gettrains")
    @ResponseBody
    public Object gettrains(@RequestParam(defaultValue = "1") int pageNo, @RequestParam(defaultValue = "10") int pageSize) {
        return Result.success(scheduleOfTrainsService.findtrains(pageNo, pageSize), "分页 查询trains 对象");
    }

    @GetMapping("/listtrains")
    public String toTrainListPage() {
        return "trainlist";
    }


    @GetMapping("/scheduleOfTrainsbydepartureandend")
    @ResponseBody
    public Object scheduleOfTrainsbydepartureandend(HttpSession session, @RequestParam(defaultValue = "1") int pageNo, @RequestParam(defaultValue = "10") int pageSize) {
//        return Result.success(scheduleOfTrainsService.scheduleOfTrainsbydepartureandend(departure_station, end_station, pageNo, pageSize), "分页 查询trains 对象");
        return Result.success(scheduleOfTrainsService.scheduleOfTrainsbydepartureandend((String) session.getAttribute("departure_station"), (String) session.getAttribute("end_station"), pageNo, pageSize), "分页 查询trains 对象");
//        return Result.success(scheduleOfTrainsService.scheduleOfTrainsbydepartureandend("北京","广州",pageNo,pageSize),"分页 查询trains 对象");
    }

    @GetMapping("/scheduleOfTrainsbydepartureandend1")
    public String scheduleOfTrainsbydepartureandendPage(HttpSession session, String departure_station, String end_station) {
        session.setAttribute("departure_station", departure_station);
        session.setAttribute("end_station", end_station);

        return "trainlist2";
    }


}