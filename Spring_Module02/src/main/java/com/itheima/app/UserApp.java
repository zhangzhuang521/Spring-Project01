package com.itheima.app;

import com.itheima.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserApp {
    public static void main(String[] args) {
        //加载配置文件(容器)
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //从容器中获取bean资源
        UserService userService = (UserService) context.getBean("userService");
//        UserService userService1 = (UserService) context.getBean("userService");
//        UserService userService2 = (UserService) context.getBean("userService");
//        UserService userService = context.getBean(UserService.class);
        //调用方法
//        System.out.println(userService);
//        System.out.println(userService1);
//        System.out.println(userService2);
        userService.save();

    }
}
