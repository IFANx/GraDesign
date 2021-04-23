package com.kkxu.demo.service;

import com.kkxu.demo.common.domain.User;
import com.kkxu.demo.common.domain.UserExample;
import com.kkxu.demo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements  UserService{
    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> look() {
        UserExample userExample=new UserExample();
        userExample.createCriteria().andUserIdNumberIsNotNull();
        List<User> users = userMapper.selectByExample(userExample);
        return users;
    }

    @Override
    public boolean register(String user_phone_number, String user_password1) {
        User user=new User();
        user.setUserPhoneNumber(user_phone_number);
        user.setUserPassword(user_password1);
        user.setUserAddress("123");
        user.setUserEmail("123");
        user.setUserGender(1);
        user.setUserIdNumber("123");
        user.setUserLeixing(1);
        user.setUserRealName("123");

        int insert = userMapper.insert(user);
        if (insert==0)
        return false;
        return  true;
    }

    @Override
    public boolean login(String user_phone_number, String user_password) {
        User user = userMapper.selectByPrimaryKey(user_phone_number);
        if(user==null)
            return  false;
        else if(user.getUserPassword().equals(user_password))
            return true;
        else
        return false;
    }

    @Override
    public boolean update(String user_phone_number, User user) {
        int i = userMapper.insertSelective(user);
        if(i==0)
        return false;
        return true;
    }
}
