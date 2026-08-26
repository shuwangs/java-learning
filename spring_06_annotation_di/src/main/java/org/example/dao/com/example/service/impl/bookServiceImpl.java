package org.example.dao.com.example.service.impl;

import org.example.dao.BookDao;
import org.example.dao.com.example.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class bookServiceImpl implements BookService {
    @Autowired
    @Qualifier("bookDao") // use to specify which instance
    private BookDao bookDao;

    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    public void save() {
        System.out.println("book service save ...");
        bookDao.save();
    }
}
