package org.example.service.impl;

import org.example.dao.BookDao;
import org.example.service.BookService;

public class BookServiceImpl implements BookService {
    private BookDao bookDao;

    public void save() {
        System.out.println("bookService is saved ");
        bookDao.save();
    }

    // 6. provide realted set methods
    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }
}
