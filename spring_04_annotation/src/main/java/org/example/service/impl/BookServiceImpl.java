package org.example.service.impl;

import org.example.dao.BookDao;
import org.example.service.BookService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//@Component("bookService")
@Service
public class BookServiceImpl implements BookService {
    private BookDao bookDao;

    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    public  void save() {
        System.out.println(" book service save ...");
        bookDao.save();
    }
}
