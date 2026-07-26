package org.example.mapper;

import org.example.pojo.Brand;

import java.util.List;
import java.util.Map;

public interface BrandMapper {
    /**
     * Get all the brand
     *
     */
    List<Brand> selectAll();

    /**
     * select by id
     */
    Brand selectById(int id);

    /**
     * query by condition
     *
     * @param status
     * @param companyName
     * @param brandName
     * @return

     */
    // List<Brand> selectByCondition (@Param("status") int status, @Param("companyName") String companyName, @Param("brandName") String brandName);

    /**
     * use the object as the params

     */
    // List<Brand> selectByCondition(Brand brand);

    /**
     * use the Map collection as the params
     */
    List<Brand> selectByCondition(Map map);

    List<Brand> selectByDynamicCondition(Map map);
}
