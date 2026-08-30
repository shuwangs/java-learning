package org.example.service;

import org.apache.ibatis.annotations.Insert;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

public interface LogService {
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    @Insert("insert into tbl_log(info, create_time) values(#{info}, now())")
    void log(String out, String in, Double money);
}
