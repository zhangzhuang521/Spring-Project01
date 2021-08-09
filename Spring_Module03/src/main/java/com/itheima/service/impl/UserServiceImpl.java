package com.itheima.service.impl;

import com.alibaba.druid.pool.DruidDataSource;
import com.itheima.dao.UserDao;
import com.itheima.service.UserService;

import javax.sql.DataSource;


public class UserServiceImpl implements UserService {
    //依赖注入
    private UserDao userDao;

    //set注入
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    private DataSource dataSource;

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public void save() {
        System.out.println("userService .....");
        userDao.save();
        System.out.println(dataSource);
    }
}
