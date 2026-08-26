package org.example.dao.impl;

import org.example.dao.BookDao;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
@Repository("bookDao")
@Scope("singleton") // or prototype to control
public class BookDaoImpl implements BookDao {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void save() {
        System.out.println("book dao save..." + name);
    }

    @PostConstruct
    public void init(){
        System.out.println("book dao init...");
    }
    @PreDestroy
    public void destroy() {
        System.out.println("book dao destroy...");
    }
}

