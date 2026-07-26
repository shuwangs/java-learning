package org.example;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.*;
import org.example.mapper.BrandMapper;
import org.example.pojo.Brand;
import org.junit.Test;

import java.io.InputStream;
import java.sql.Connection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyBatisTest {

    @Test
    public void testSelectAll() throws Exception {
        System.out.println("----------------------");
        System.out.println("testSelectAll");
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
    @Test
    public void testSelectById() throws Exception {
        System.out.println("----------------------");
        System.out.println("testSelectById");
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

    @Test
    public void testSelectByCondition() throws Exception {
        System.out.println("----------------------");
        System.out.println("testSelectByCondition");
        int status = 1;
        String companyName = "Nike";
        String brandName = "Nike";

        // normalize the input
        companyName = "%" + companyName + "%";
        brandName = "%" + brandName + "%";

        // encapsulate the object
//        Brand brand = new Brand();
//        brand.setBrandName(brandName);
//        brand.setCompanyName(companyName);
//        brand.setStatus(status);
        // use map
        Map map = new HashMap();
        map.put("status", status);
        map.put("brandName", brandName);
        map.put("companyName", companyName);

        // 1. get sqlSessionFactory
        String resource = "mybatis-config.xml";
        InputStream inputStream= Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        // 2. get the sqlSession object
        SqlSession sqlSession = sqlSessionFactory.openSession();

        // 3. get the Mapper interface proxy object

        BrandMapper brandMapper = sqlSession.getMapper(BrandMapper.class);

        // 4. excute

        // List <Brand> brands = brandMapper.selectByCondition(status, companyName, brandName);
//        List <Brand> brands = brandMapper.selectByCondition(brand);
        List <Brand> brands = brandMapper.selectByCondition(map);

        System.out.println(brands);

        // 5. release resources
        sqlSession.close();
    }
}
