package org.example;

import org.example.dao.UserDao;
import org.example.factory.UserDaoFactory;

public class AppForInstanceUser {
    public static void main(String[] args) {

        UserDaoFactory userDaoFactory = new UserDaoFactory();

        UserDao userDao = userDaoFactory.getUserDao();
        UserDao userDao1 = userDaoFactory.getUserDao();
        //userDao.save();
        System.out.println(userDao);
        System.out.println(userDao1);
    }
}
