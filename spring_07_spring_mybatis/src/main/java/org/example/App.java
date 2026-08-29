package org.example;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.example.dao.AccountDao;
import org.example.domain.Account;

import java.io.InputStream;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class App {
    public static void main(String[] args) throws Exception {
        //Get connecton
        // create SqlSessionBFactoryBuilder obj
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();

        InputStream inputStream = Resources.getResourceAsStream("SqlMapConfig.xml.bak");

        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(inputStream);

        // Get the sql Session
        SqlSession sqlSession = sqlSessionFactory.openSession();

        // Exectue sql session obj, and get user;
        AccountDao accountDao = sqlSession.getMapper(AccountDao.class);

        Account ac = accountDao.findById(1);

        System.out.println(ac);

        sqlSession.close();
    }
}
