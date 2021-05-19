package com.kkxu.demo.controller;

import com.kkxu.demo.common.domain.Passenger;
import com.kkxu.demo.common.utils.Result;
import com.kkxu.demo.service.PassengerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;


@Controller
public class PassengerController {
    @Autowired
    private PassengerService passengerService;

    @RequestMapping("/getpassengers")
    @ResponseBody
    public Object getPassengers(HttpSession session,@RequestParam(defaultValue = "17361048086") String UserPhonenumber,@RequestParam(defaultValue = "1") int pageNo, @RequestParam(defaultValue = "10")int pageSize){
        return Result.success(passengerService.findPassengers((String) session.getAttribute("UserPhoneNumber"),pageNo,pageSize),"分页 查询book 对象");
    }
    @RequestMapping("/showPassengers")
    public String showPassengers(){
        return "passengers";
    }

    @RequestMapping("/deletePassenger")
    @ResponseBody
    public Object deletepassenger(String passengerPhoneNumber){
        passengerService.deletePassengerById(passengerPhoneNumber);
        return Result.success();
    }

    @RequestMapping("/addPassenger")
    public String addPassengers(ModelMap modelMap,HttpSession session, String passengerRealName, String passengerIdNumber, String passengerPhoneNumber, String passengerAddress) {
        if (session.getAttribute("UserPhoneNumber") == null) {
            session.setAttribute("UserPhoneNumber", "17361048086");
        }
        boolean exits = passengerService.duplicate(passengerPhoneNumber);
        if (exits) {
            modelMap.addAttribute("message", "新增失败，当前旅客电话已注册");
            return "passengers";
        } else {
            Passenger passenger = new Passenger();
            passenger.setPassengerAddress(passengerAddress);
            passenger.setPassengerIdNumber(passengerIdNumber);
            passenger.setPassengerPhoneNumber(passengerPhoneNumber);
            passenger.setPassengerRealName(passengerRealName);
            passenger.setPassengerType(1);
            passenger.setUserPhoneNumber((String) session.getAttribute("UserPhoneNumber"));
            passengerService.addpassenger(passenger);
            modelMap.addAttribute("messeage","新增旅客成功");
            return "passengers";
        }
    }
}
