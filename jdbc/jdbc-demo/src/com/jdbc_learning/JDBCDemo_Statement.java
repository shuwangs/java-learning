package com.jdbc_learning;

import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JDBCDemo_Statement {
    /*
    DML
     */
    @Test
    public void testDML() throws Exception{
        // connect
        String url="jdbc:mysql://127.0.0.1:3306/jdbc_learning";
        String username="root";
        String password="";
        Connection conn = DriverManager.getConnection(url, username, password);

        // define SQL queries
        // if the id is not exist, return 0 affected lines
        String sql ="update student set age = age - 2 where id = 4";

        // get the target object
        Statement state = conn.createStatement();

        try {
            int count = state.executeUpdate(sql);
            if (count > 0){
                System.out.println("successfully updated");
            } else {
                System.out.println("update failed");
            }
        }catch (Exception throwables){
            throwables.printStackTrace();
        }
        // release statement ->
        state.close();
        conn.close();
    }

}
