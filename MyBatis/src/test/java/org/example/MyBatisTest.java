package org.example;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.example.mapper.BrandMapper;
import org.example.pojo.Brand;
import org.junit.Test;

import java.io.InputStream;
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
        InputStream inputStream = Resources.getResourceAsStream(resource);
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
        InputStream inputStream = Resources.getResourceAsStream(resource);
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
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        // 2. get the sqlSession object
        SqlSession sqlSession = sqlSessionFactory.openSession();

        // 3. get the Mapper interface proxy object

        BrandMapper brandMapper = sqlSession.getMapper(BrandMapper.class);

        // 4. excute

        // List <Brand> brands = brandMapper.selectByCondition(status, companyName, brandName);
//        List <Brand> brands = brandMapper.selectByCondition(brand);
        List<Brand> brands = brandMapper.selectByCondition(map);

        System.out.println(brands);

        // 5. release resources
        sqlSession.close();
    }

    @Test
    public void testSelectByDynamicCondition() throws Exception {
        System.out.println("----------------------");
        System.out.println("testSelectByDynamicCondition");
        int status = 1;
        String companyName = "Nike";
        String brandName = "";

        // normalize the input
        companyName = "%" + companyName + "%";
        brandName = "%" + brandName + "%";

        // use map
        Map map = new HashMap();
//        map.put("status", status);
//        map.put("brandName", brandName);
//        map.put("companyName", companyName);

        // 1. get sqlSessionFactory
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        // 2. get the sqlSession object
        SqlSession sqlSession = sqlSessionFactory.openSession();

        // 3. get the Mapper interface proxy object

        BrandMapper brandMapper = sqlSession.getMapper(BrandMapper.class);

        // 4. excute
        List<Brand> brands = brandMapper.selectByDynamicCondition(map);

        System.out.println(brands);

        // 5. release resources
        sqlSession.close();
    }


    @Test
    public void testAdd() throws Exception {
        System.out.println("----------------------");
        System.out.println("testAdd");
        int status = 1;
        String companyName = "lululemon";
        String brandName = "";
        String description = "The best the sport brand";
        int ordered = 100;

        // contruct the brand obj
        Brand brand = new Brand();
        brand.setBrandName(brandName);
        brand.setCompanyName(companyName);
        brand.setStatus(status);
        brand.setDescription(description);
        brand.setOrdered(ordered);


        // 1. get sqlSessionFactory
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        // 2. get the sqlSession object
//        SqlSession sqlSession = sqlSessionFactory.openSession();
//        openSession() default: autoCOmmit to be false; so set it to true cna auto commit
        SqlSession sqlSession = sqlSessionFactory.openSession(true);

        // 3. get the Mapper interface proxy object

        BrandMapper brandMapper = sqlSession.getMapper(BrandMapper.class);

        // 4. excute
        brandMapper.add(brand);

        System.out.println(brand.getId());
        // commit the execution
        // sqlSession.commit();
        // 5. release resources
        sqlSession.close();
    }


    @Test
    public void testUpdateDynamic() throws Exception {
        System.out.println("----------------------");
        System.out.println("testUpdateDynamic");
        int status = 1;
//        String companyName = "lululemon";
        String brandName = "lululeapple";
//        String description = "The best sport brand";
        int ordered = 30;
        int id = 7;


        // contruct the brand obj
        Brand brand = new Brand();
        brand.setBrandName(brandName);
//        brand.setCompanyName(companyName);
        brand.setStatus(status);
//        brand.setDescription(description);
        brand.setOrdered(ordered);
        brand.setId(id);


        // 1. get sqlSessionFactory
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        // 2. get the sqlSession object
//        SqlSession sqlSession = sqlSessionFactory.openSession();
//        openSession() default: autoCOmmit to be false; so set it to true cna auto commit
        SqlSession sqlSession = sqlSessionFactory.openSession(true);

        // 3. get the Mapper interface proxy object

        BrandMapper brandMapper = sqlSession.getMapper(BrandMapper.class);

        // 4. excute
        int count = brandMapper.updateDynamic(brand);

        System.out.println(count);
        // commit the execution
        // sqlSession.commit();
        // 5. release resources
        sqlSession.close();
    }


    @Test
    public void testUpdate() throws Exception {
        System.out.println("----------------------");
        System.out.println("testUpdate");
        int status = 1;
        String companyName = "lululemon";
        String brandName = "lululemon";
        String description = "The best sport brand";
        int ordered = 100;
        int id = 8;


        // contruct the brand obj
        Brand brand = new Brand();
        brand.setBrandName(brandName);
        brand.setCompanyName(companyName);
        brand.setStatus(status);
        brand.setDescription(description);
        brand.setOrdered(ordered);
        brand.setId(id);


        // 1. get sqlSessionFactory
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        // 2. get the sqlSession object
//        SqlSession sqlSession = sqlSessionFactory.openSession();
//        openSession() default: autoCOmmit to be false; so set it to true cna auto commit
        SqlSession sqlSession = sqlSessionFactory.openSession(true);

        // 3. get the Mapper interface proxy object

        BrandMapper brandMapper = sqlSession.getMapper(BrandMapper.class);

        // 4. excute
        int count = brandMapper.update(brand);

        System.out.println(count);
        // commit the execution
        // sqlSession.commit();
        // 5. release resources
        sqlSession.close();
    }
}
