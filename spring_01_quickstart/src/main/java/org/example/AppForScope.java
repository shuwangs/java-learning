package org.example;

import org.example.dao.BookDao;
import org.example.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppForScope {
    public static void main(String[] args) {
// get IoC container
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookDao bookDao1 = (BookDao) ctx.getBean("bookDao");
        BookDao bookDao2 = (BookDao) ctx.getBean("bookDao");

        //e
        System.out.println(bookDao1); // org.example.dao.impl.BookDaoImpl@5ef60048
        System.out.println(bookDao1); // org.example.dao.impl.BookDaoImpl@5ef60048
    }
}
