package com.learning.demo.service;

/**
 * @author: mufei
 * @date: 2022/9/8 09:55
 * @Description:
 */
public class UserServiceImpl implements UserService {

    public UserServiceImpl() {
        System.out.println("UserServiceImpl created");
    }

    @Override
    public void yelling() {
        System.out.println("aaaaaa");
    }
}
