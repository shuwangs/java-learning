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

        Class.forName("com.mysql.cj.jdbc.Driver");

        // connect
        String url="jdbc:mysql://127.0.0.1:3306/jdbc_learning";
        String username="root";
        String password="";
        Connection conn = DriverManager.getConnection(url, username, password);

        // define SQL queries

        String sql ="SELECT * FROM student";
        // get the target object
        Statement state = conn.createStatement();

        // exect sql
        ResultSet resultSet = state.executeQuery(sql);

        // deal with the result
        while (resultSet.next()) {
            int id = resultSet.getInt("id");
            String name = resultSet.getString("name");
            int age = resultSet.getInt("age");

            System.out.println(id + " | " + name + " | " + age);
        }
        // release statement ->
        state.close();
        conn.close();
    }
}
