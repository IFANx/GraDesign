package com.kkxu.demo.controller;

import com.kkxu.demo.common.domain.Order_List;
import com.kkxu.demo.common.domain.Schedule_Of_Trains;
import com.kkxu.demo.common.utils.Result;
import com.kkxu.demo.service.OrderService;
import com.kkxu.demo.service.ScheduleOfTrainsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Random;


@Controller
//@RequestMapping("/Order")
public class OrderController {
    @Autowired
    private OrderService orderService;
    @Autowired
    private ScheduleOfTrainsService scheduleOfTrainsService;

    //    订单功能一：客户预定车票
    @RequestMapping("/insertorder")
//    HttpSession session,String passengeridnumber,String money
    public String insertorder(String train_no, String passenger_id_number,String passenger_phone_number,ModelMap modelMap,HttpSession session) {
        //获取订单最大编号，新建一个编号加一的新订单
        int MaxID = orderService.MaxID();
        //根据当前选择的车次的train_no信息，查询当前车次的其余有关订票的信息，并组合成一个order实体类
        Schedule_Of_Trains trains = scheduleOfTrainsService.selectbytrainno(train_no).get(0);
        Date now = new Date();
        Date date = new Date();
        SimpleDateFormat format = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
//   设置时间为7天后
// 1. 得到当前时间的毫秒数
        long time = date.getTime();
// 2. 计算间隔时间的毫秒数
        long n=7*24*60*60*1000;
// 3. 相加/减得到目标时间的毫秒数
        time=time+n;
// 4. 通过构造方法生成一个新的Date对象，该对象的时间值即使目标值
        date=new Date(time);
        System.out.println("七天后的时间："+format.format(date));

        Random rand = new Random();
        Order_List order_list = new Order_List();
        order_list.setOrderId(MaxID + 1);
        order_list.setUserPhoneNumber((String)session.getAttribute("UserPhoneNumber"));
        order_list.setPassengerIdNumber(passenger_id_number);
        order_list.setPassengerPhoneNumber(passenger_phone_number);
        order_list.setTrainNo(trains.getTarinNo());
        order_list.setStartStationNo(trains.getDepartureStation());
        order_list.setEndStationNo(trains.getEndStation());
        order_list.setStartStationName(trains.getFromStation());
        order_list.setEndStationNo(train_no);
        order_list.setEndStationName(trains.getToStation());
        order_list.setCarriageNo("S"+(rand.nextInt(500 - 20 + 1) + 20));
        order_list.setSeatNo("N"+(rand.nextInt(500 - 20 + 1) + 20));
        order_list.setOrderMoney(String.valueOf((rand.nextInt(500 - 20 + 1) + 20)));
        order_list.setOrderCreateTime(now);
        order_list.setOrderStatus("未支付");
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(now);
        calendar.add(Calendar.DAY_OF_MONTH,3);
        order_list.setTrainStartDate(date);
        boolean flag = orderService.insertorder(order_list);
        if (flag == true)
            modelMap.addAttribute("message", "预定成功");
        else
            modelMap.addAttribute("message", "预定失败");
        return "orderlist";
    }

    @RequestMapping("/lookorder")
    public List<Order_List> lookorder(HttpSession session){
        String UserPhonenumber= (String) session.getAttribute("user_phone_number");
        List<Order_List> order_lists=orderService.lookorder(UserPhonenumber);
        return order_lists;
    }

    @RequestMapping("/deleteorder")
    public String deleteorder(HttpSession session,ModelMap modelMap){
        Integer maxID = orderService.MaxID();
        orderService.deleteorder(maxID);
        modelMap.addAttribute("message","删除订单成功");
        return "result";
    }

    //分页
    @GetMapping("/getorderlist")
    @ResponseBody
    public Object getorderlist(HttpSession session,@RequestParam(defaultValue = "17361048086") String UserPhonenumber,@RequestParam(defaultValue = "1") int pageNo, @RequestParam(defaultValue = "10")int pageSize){
        return Result.success(orderService.findorder((String) session.getAttribute("UserPhoneNumber"),pageNo,pageSize),"分页 查询trains 对象");
    }
    @GetMapping("/displayorder")
    public String toorderListPage(){
        return "orderlist";
    }
    @GetMapping("/payedorder")
    @ResponseBody
    public Object payedorder(HttpSession session,@RequestParam(defaultValue = "17361048086") String UserPhonenumber,@RequestParam(defaultValue = "1") int pageNo, @RequestParam(defaultValue = "10")int pageSize){
        return Result.success(orderService.payedorder((String) session.getAttribute("UserPhoneNumber"),pageNo,pageSize),"分页 查询trains 对象");
    }

    @GetMapping("/payedorder1")
    public String topayedorderListPage(){
        return "payedorder";
    }

    @GetMapping("/notpayedorder")
    @ResponseBody
    public Object notpayedorder(HttpSession session,@RequestParam(defaultValue = "17361048086") String UserPhonenumber,@RequestParam(defaultValue = "1") int pageNo, @RequestParam(defaultValue = "10")int pageSize){
        return Result.success(orderService.notpayedorder((String) session.getAttribute("UserPhoneNumber"),pageNo,pageSize),"分页 查询trains 对象");
    }
    @GetMapping("/notpayedorder1")
    public String tonotpayedorderListPage(){
        return "notpayedorder";
    }



}
