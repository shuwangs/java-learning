package org.example;

import org.example.dao.OrderDao;
import org.example.factory.OrderDaoFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppForInstanceOrder {

    public static void main(String[] args) {
        //OrderDao orderDao = OrderDaoFactory.getOrderDao();
        //orderDao.save();

        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        OrderDao orderDao = (OrderDao) ctx.getBean("orderDao");
        orderDao.save();
    }

}
