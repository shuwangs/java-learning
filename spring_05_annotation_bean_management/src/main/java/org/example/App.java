package org.example;

import org.example.config.SpringConfig;
import org.example.dao.BookDao;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);

        BookDao bookDao1 = (BookDao) ctx.getBean(BookDao.class);
        BookDao bookDao2 = (BookDao) ctx.getBean(BookDao.class);

        System.out.println(bookDao1);
        System.out.println(bookDao2);

        ctx.close();
    }
}
