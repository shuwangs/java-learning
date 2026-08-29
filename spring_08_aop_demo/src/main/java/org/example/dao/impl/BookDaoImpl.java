package org.example.dao.impl;

import org.example.dao.BookDao;
import org.springframework.stereotype.Repository;

@Repository
public class BookDaoImpl implements BookDao {
    //连接点。
    public void save() {
        Long startTime = System.currentTimeMillis();

        for (int i=0; i < 10000; i++) {
            System.out.println("book dao save...");
        }

        Long endTime = System.currentTimeMillis();

        Long totalTime = endTime-startTime;

        System.out.println("Total time cost: " + totalTime + "ms");

    }

    public void update(){
        System.out.println("book dao update...");
    }

    public void delete() {
        System.out.println("book dao delete...");
    }

    public void select() {
        System.out.println("book dao select...");
    }
}
