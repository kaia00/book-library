package com.sda.tutorials3.demo2.service;

import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl implements UserService {

    @Override
    public String provideService() {
       return "This is user service";
    }
}
