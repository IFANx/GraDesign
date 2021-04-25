package com.kkxu.demo.controller;

import com.kkxu.demo.common.domain.Order_List;
import com.kkxu.demo.common.domain.Schedule_Of_Trains;
import com.kkxu.demo.service.OrderService;
import com.kkxu.demo.service.ScheduleOfTrainsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.List;


@Controller
@RequestMapping("/Order")
public class OrderController {
    @Autowired
    private OrderService orderService;
    @Autowired
    private ScheduleOfTrainsService scheduleOfTrainsService;

    //    订单功能一：客户预定车票
    @RequestMapping("/insertorder")
//    HttpSession session,String passengeridnumber,String money
    public String insertorder(String train_no, ModelMap modelMap) {

        //获取订单最大编号，新建一个编号加一的新订单
        int MaxID = orderService.MaxID();

        //根据当前选择的车次的train_no信息，查询当前车次的其余有关订票的信息，并组合成一个order实体类
        Schedule_Of_Trains trains = scheduleOfTrainsService.selectbytrainno(train_no).get(1);
        Date now = new Date();
        Order_List order_list = new Order_List();
        order_list.setOrderId(MaxID + 1);
        order_list.setUserPhoneNumber("17361048086");
        order_list.setPassengerIdNumber("510521");
        order_list.setPassengerPhoneNumber("17361040886");
        order_list.setTrainNo(trains.getTarinNo());
        order_list.setStartStationNo(trains.getDepartureStation());
        order_list.setEndStationNo(trains.getEndStation());
        order_list.setStartStationName(trains.getFromStation());
        order_list.setEndStationNo("123");
        order_list.setEndStationName(trains.getToStation());
        order_list.setCarriageNo("4");
        order_list.setSeatNo("444");
        order_list.setOrderMoney("123");
        order_list.setOrderCreateTime(now);
        order_list.setOrderStatus("正常");
        order_list.setTrainStartDate(now);
        boolean flag = orderService.insertorder(order_list);
        if (flag == true)
            modelMap.addAttribute("message", "预定成功");
        else
            modelMap.addAttribute("message", "预定失败");
        return "result";
    }

    @RequestMapping("/lookorder")
    @ResponseBody
    public List<Order_List> lookorder(HttpSession session){
        String UserPhonenumber="17361048086";
        session.setAttribute("UserPhonenumber",UserPhonenumber);
        List<Order_List> order_lists=orderService.lookorder((String) session.getAttribute("UserPhonenumber"));
        return order_lists;
    }

    @RequestMapping("/deleteorder")

    public String deleteorder(HttpSession session,ModelMap modelMap){
        Integer maxID = orderService.MaxID();
        orderService.deleteorder(maxID);
        modelMap.addAttribute("message","删除订单成功");
        return "result";
    }


}
