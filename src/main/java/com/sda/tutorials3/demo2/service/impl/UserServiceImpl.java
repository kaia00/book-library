package com.sda.tutorials3.demo2.service.impl;

import com.sda.tutorials3.demo2.service.UserService;
import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl implements UserService {

    @Override
    public String login() {
       return "User logged in successfully";
    }
}
