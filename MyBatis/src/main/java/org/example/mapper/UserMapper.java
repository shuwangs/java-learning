package org.example.mapper;

import org.apache.ibatis.annotations.Select;
import org.example.pojo.User;

import java.util.List;

public interface UserMapper {
    List<User> selectAllUser();

    // Annotation-based SQL mapping for simple statemnts
    @Select("select * from tb_user where id = #{id}")
    User selectById(int id);
}
