package com.itheima.test;

import com.itheima.dao.AccountDao;
import com.itheima.domain.Account;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class test01 {
    public static void main(String[] args) throws IOException {
        InputStream inputStream = Resources.getResourceAsStream("sqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        AccountDao accountDao = sqlSession.getMapper(AccountDao.class);
        Account account = accountDao.findById(1);
        System.out.println(account);
    }
}
