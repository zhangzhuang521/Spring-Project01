package com.itheima.service.impl;

import com.itheima.dao.UserDao;
import com.itheima.service.UserService;

public class UserServiceImpl implements UserService {
    //依赖注入 ，set方法注入
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
    public void save() {
        System.out.println("Hello World....");
        userDao.save();
    }
}
