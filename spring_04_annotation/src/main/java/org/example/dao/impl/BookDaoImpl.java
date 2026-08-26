package org.example.dao.impl;

import org.example.dao.BookDao;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

//@Component("bookDao")
@Repository("bookDao")
/**
 * @Controller,
 * @Service, for service later bean
 * @Repository, for date layer bean
 */
public class BookDaoImpl implements BookDao {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void save() {
        System.out.println("book dao save..." + name);
    }
}

