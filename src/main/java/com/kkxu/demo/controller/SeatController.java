package com.kkxu.demo.controller;

import com.kkxu.demo.common.domain.Seat;
import com.kkxu.demo.common.utils.Result;
import com.kkxu.demo.service.ScheduleOfTrainsService;
import com.kkxu.demo.service.SeatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
//@RequestMapping("/Seat")
public class SeatController {
    @Autowired
    private SeatService seatService;
    @RequestMapping("/Seatinfo")
    public String  seatinfo(ModelMap modelMap,String train_no){
        List<Seat> seats=seatService.gettseatinfobyid(train_no);
        modelMap.addAttribute("seats",seats);
        return "seatinfo";
    }
    @GetMapping("/getseats")
    @ResponseBody
    public Object getseats(@RequestParam(defaultValue = "3300000K560A") String train_no,@RequestParam(defaultValue = "1") int pageNo, @RequestParam(defaultValue = "10")int pageSize){
        return Result.success(seatService.findseats(train_no,pageNo,pageSize),"分页 查询trains 对象");
    }

    @GetMapping("/listseats")
    public String toSeatListPage(){
        return "pricing";
    }
}
