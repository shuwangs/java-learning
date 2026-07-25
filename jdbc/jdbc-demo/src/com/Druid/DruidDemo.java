package com.Druid;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.FileInputStream;
import java.sql.Connection;
import java.util.Properties;

/**
 * Druid pooling connection demo
 */
public class DruidDemo {
    public static void main(String[] args) throws Exception{
        System.out.println(System.getProperty("user.dir"));
        // 1. import the druid jar

        // 2. define configuration

        // 3. import the configuation file
        Properties prop = new Properties();
        prop.load(new FileInputStream("jdbc-demo/src/druid.properties"));
        //4. get the connection pooling object
        DataSource dataSource =DruidDataSourceFactory.createDataSource(prop);

        // 5. connect
        Connection connection = dataSource.getConnection();

        System.out.println(connection);

    }
}
