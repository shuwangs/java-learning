package org.example.dao;

import org.apache.ibatis.annotations.Insert;
import org.springframework.context.annotation.Bean;


public interface LogDao {
    @Insert("insert into tbl_log(info, create_time) values(#{info}, now())")
    void log(String info);
}
