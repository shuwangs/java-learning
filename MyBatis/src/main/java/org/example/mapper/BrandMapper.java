package org.example.mapper;
import org.example.pojo.Brand;

import java.util.List;

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
}
