package com.kkxu.demo.controller;

import com.kkxu.demo.common.domain.User;
import com.kkxu.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

import java.util.List;

@Controller
//@RequestMapping("/User")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/userlist")
    @ResponseBody
    //获取用户User信息
    public Object userlist(ModelMap modelMap) {
        List<User> userlist = userService.look();
        modelMap.addAttribute("Users", userlist);
        return userlist;
    }

    @RequestMapping("/register")
    //用户注册  <参数列表user_phone_number，user_password1，user_password2>
    public String userregister(HttpSession session, ModelMap modelMap, String user_phone_number,
                               String user_password1, String user_password2) {
        boolean exist=userService.selectprimary(user_phone_number);
        if(!exist)
        {
            modelMap.addAttribute("message", "注册失败,您的电话已注册");
            return "register";
        }
        else if (user_password1.equals(user_password2)) {
                userService.register(user_phone_number,user_password1);
                modelMap.addAttribute("message", "注册成功,请点击Login登录");
                session.setAttribute("user_phone_number", user_phone_number);
                return "login";

        } else {
            modelMap.addAttribute("message", "密码不一致，请重新输入");
            return "register";
        }
    }


    @RequestMapping("/login")
    public String userlogin(ModelMap modelMap, String user_phone_number,
                            String user_password) {
        boolean flag = userService.login(user_phone_number, user_password);
        if (flag==true) {
            modelMap.addAttribute("message", "登录成功");
            return "trainlist";
        } else {
            modelMap.addAttribute("message", "登录失败");
            return "login";
        }
    }

    @RequestMapping("/update")
    public String userupdate(HttpSession session, ModelMap modelMap,String user_password,
                             String user_email,String user_real_name,String user_id_number,int user_gender,
                             String user_address
                             ) {
        User user=new User();
        user.setUserIdNumber(user_id_number);
        user.setUserRealName(user_real_name);
        user.setUserLeixing(0);
        user.setUserGender(user_gender);
        user.setUserEmail(user_email);
        user.setUserAddress(user_address);
        boolean flag = userService.update((String)session.getAttribute("user_phone_number"),user);
        if (flag) {
            modelMap.addAttribute("message", "登录成功");
            return "result";
        } else {
            modelMap.addAttribute("message", "登录失败");
            return "result";
        }
    }

//    添加乘客
//    购买车票
//    查询订单
}

