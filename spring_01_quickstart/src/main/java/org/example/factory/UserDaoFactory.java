package org.example.factory;

import org.example.dao.UserDao;
import org.example.dao.impl.UserDaoImpl;

public class UserDaoFactory {
    // Not static here
    public UserDao getUserDao() {
        return new UserDaoImpl();
    }
}
