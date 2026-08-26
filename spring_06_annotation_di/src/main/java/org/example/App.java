package org.example;

import org.example.config.SpringConfig;
import org.example.dao.BookDao;
import org.example.dao.com.example.service.BookService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);

        BookDao bookDao = (BookDao) ctx.getBean(BookDao.class);
        BookService bookService = (BookService) ctx.getBean(BookService.class);

        bookDao.save();
        bookService.save();

    }
}
