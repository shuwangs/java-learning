package com.jdbc_learning;

import com.pojo.Student;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class JDBCDemo_ResultSet {
    /*
        DQL
    */
    @Test
    public void testDQL() throws Exception{
        // connect
        String url="jdbc:mysql://127.0.0.1:3306/jdbc_learning";
        String username="root";
        String password="";
        Connection conn = DriverManager.getConnection(url, username, password);

        // define SQL queries
        String sql ="select * from student";

        // get the target object
        Statement state = conn.createStatement();

        // excute sql
        ResultSet res = state.executeQuery(sql);

        while (res.next()) {
            int id = res.getInt(1);
            String name = res.getString(2);

            System.out.print(id);
            System.out.println(name);
            System.out.println("-----");
        }
        // release statement ->
        res.close();
        state.close();
        conn.close();
    }

    /**
     * Check Student table, and encapsulate into Student object, and save to ArrayList collections
     *  1. Define Student
     *  2. sql data, and encapsulate into Student object
     *  3. store to ArrayList in Student
     *
     */

    @Test
    public void testResultSet() throws Exception{
        // connect
        String url="jdbc:mysql://127.0.0.1:3306/jdbc_learning";
        String username="root";
        String password="";
        Connection conn = DriverManager.getConnection(url, username, password);

        // define SQL queries
        String sql ="select * from student";

        // get the target object
        Statement state = conn.createStatement();

        // excute sql
        ResultSet res = state.executeQuery(sql);

        List<Student> list = new ArrayList<>();
        while (res.next()) {
            Student student = new Student();

            int id = res.getInt(1);
            String name = res.getString(2);
            int age = res.getInt(3);

            student.setId(id);
            student.setName(name);
            student.setAge(age);

            list.add(student);
        }

        System.out.println(list);

        // release statement ->
        res.close();
        state.close();
        conn.close();
    }

}
