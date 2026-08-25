package org.example.service.impl;

import org.example.dao.BookDao;
import org.example.service.BookService;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BookServiceImpl implements BookService, InitializingBean, DisposableBean {
    private BookDao bookDao;

    public void save() {
        System.out.println("bookService is saved ");
        bookDao.save();
    }

    // 6. provide related set methods
    public void setBookDao(BookDao bookDao) {
        System.out.println("SetBookDao...");
        this.bookDao = bookDao;
    }


    public void destroy() throws Exception {
        System.out.println("Service destroy...");
    }

    // after 属性设置之后, spring 给Bean 的属性注入依赖
    public void afterPropertiesSet() throws Exception {
        System.out.println("Service init...");
    }
}
