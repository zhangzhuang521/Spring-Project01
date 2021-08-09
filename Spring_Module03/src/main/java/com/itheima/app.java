package com.itheima;

import com.itheima.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class app {
    public static void main(String[] args) {
        //加载配置文件
       ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
       //调用getBean()方法
        UserService userService = context.getBean(UserService.class);
        userService.save();

    }
}
