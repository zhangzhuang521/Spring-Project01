package com.itheima.test;

import com.itheima.domain.Account;
import com.itheima.service.AccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDemo01 {

    @Test
    public void test01(){
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        AccountService accountService = (AccountService) context.getBean("accountService");
        Account account = accountService.findById(1);
        System.out.println(account);
    }
}
