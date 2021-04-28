package com.kkxu.demo.service;

import com.kkxu.demo.common.domain.User;
import com.kkxu.demo.common.domain.UserExample;
import com.kkxu.demo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> look() {
        UserExample userExample = new UserExample();
        userExample.createCriteria().andUserIdNumberIsNotNull();
        List<User> users = userMapper.selectByExample(userExample);
        return users;
    }

    @Override
    public boolean register(String user_phone_number, String user_password1) {
        User user = new User();
        user.setUserPhoneNumber(user_phone_number);
        user.setUserPassword(user_password1);
        user.setUserAddress("123");
        user.setUserEmail("123");
        user.setUserGender(1);
        user.setUserIdNumber("123");
        user.setUserLeixing(1);
        user.setUserRealName("123");

        userMapper.insert(user);
        return true;
    }

    @Override
    public boolean login(String user_phone_number, String user_password) {
        User user = userMapper.selectByPrimaryKey(user_phone_number);
        if (user == null) {
            return false;
        } else if (user.getUserPassword().equals(user_password)) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void update(String user_phone_number, User user) {
        user.setUserPhoneNumber(user_phone_number);
        userMapper.updateByPrimaryKeySelective(user);
    }

    @Override
    public Integer MaxID() {
        Integer MaxID = userMapper.selectMaxID();
        return MaxID;
    }

    @Override
    public boolean selectprimary(String user_phone_number) {
       User user=null;
       user=userMapper.selectByPrimaryKey(user_phone_number);
        if (user==null) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public User userinfo(String userPhoneNumber) {
        User user = userMapper.selectByPrimaryKey(userPhoneNumber);
        return user;
    }
}
