package com.jdbc_learning;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/*

 */
public class JDBCDemo {
    public static void main(String[] args) throws Exception {

        // register the driver

//        Class.forName("com.mysql.cj.jdbc.Driver");

        // connect
        String url="jdbc:mysql://127.0.0.1:3306/jdbc_learning";
        String username="root";
        String password="";
        Connection conn = DriverManager.getConnection(url, username, password);

        // define SQL queries

        String sql1 ="update student set age = 22 where id = 1";
        String sql2 ="update student set age = 23 where id = 2";

        // get the target object
        Statement state = conn.createStatement();

        // exect sql
//        ResultSet resultSet = state.executeQuery(sql);


        try {
            conn.setAutoCommit(false);
            int count1 = state.executeUpdate(sql1);
            System.out.println(count1);

            int count2 = state.executeUpdate(sql2);
            System.out.println(count2);

            conn.commit();
        }catch (Exception throwables){
            // rollback
            conn.rollback();

            throwables.printStackTrace();
        }
        // release statement ->
        state.close();
        conn.close();
    }
}
