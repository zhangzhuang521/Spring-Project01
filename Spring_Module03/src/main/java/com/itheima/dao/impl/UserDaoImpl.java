package com.itheima.dao.impl;

import com.itheima.dao.UserDao;

public class UserDaoImpl implements UserDao {

    private String userName;
    private String passWord;

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public void save() {
        System.out.println(userName);
        System.out.println("userDao....."+passWord);
    }
}
