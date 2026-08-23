package org.example.dao.impl;

import org.example.dao.BookDao;

public class BookDaoImpl implements BookDao {
    // Beans can get both private and public constructor without params;
    // If no constructor is explicitly declared, Java provides a default no-argument constructor.

    private BookDaoImpl() {
        System.out.println("Book dao constructor is running");
    }

    public void save() {
        System.out.println("bookDao save.... ");
    }
}
