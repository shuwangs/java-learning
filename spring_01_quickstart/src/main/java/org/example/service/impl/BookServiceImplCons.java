package org.example.service.impl;

import org.example.dao.BookDao;
import org.example.dao.UserDao;
import org.example.service.BookService;

public class BookServiceImplCons implements BookService {
    private BookDao bookDao;
    private UserDao userDao;

    public BookServiceImplCons(BookDao bookDao, UserDao userDao) {
        this.bookDao = bookDao;
        this.userDao = userDao;
    }


    public void save() {
        System.out.println("book service cons save ...");
        bookDao.save();
        userDao.save();
    }
}
