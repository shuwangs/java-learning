package org.example;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.*;
import org.example.mapper.BrandMapper;
import org.example.pojo.Brand;
import org.junit.Test;

import java.io.InputStream;
import java.sql.Connection;
import java.util.List;

public class MyBatisTest {

    @Test
    public void testSelectAll() throws Exception {
        // 1. get sqlSessionFactory
        String resource = "mybatis-config.xml";
        InputStream inputStream= Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        // 2. get the sqlSession object
        SqlSession sqlSession = sqlSessionFactory.openSession();

        // 3. get the Mapper interface proxy object

        BrandMapper brandMapper = sqlSession.getMapper(BrandMapper.class);

        // 4. excute

        List<Brand> brands = brandMapper.selectAll();
        System.out.println(brands);


        // 5. release resources
        sqlSession.close();


    }

    public void testSelectById() throws Exception {
        int id = 1;

        // 1. get sqlSessionFactory
        String resource = "mybatis-config.xml";
        InputStream inputStream= Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        // 2. get the sqlSession object
        SqlSession sqlSession = sqlSessionFactory.openSession();

        // 3. get the Mapper interface proxy object

        BrandMapper brandMapper = sqlSession.getMapper(BrandMapper.class);

        // 4. excute

        Brand brand = brandMapper.selectById(id);
        System.out.println(brand);

        // 5. release resources
        sqlSession.close();
    }
}
