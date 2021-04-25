package com.kkxu.demo.service;

import com.kkxu.demo.common.domain.User;

import java.util.List;

public interface UserService {
    List<User> look();

    boolean register(String user_phone_number, String user_password1);

    boolean login(String user_phone_number, String user_password);

    boolean update(String user_phone_number, User user);

    Integer MaxID();
}
