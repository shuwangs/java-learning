package org.example.service.impl;

import org.example.dao.LogDao;
import org.example.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LogServiceImpl implements LogService {
    @Autowired
    private LogDao logDao;

    public void log(String out, String in, Double money) {
        logDao.log("Transfer from " + out + " to " + in + ", amount: " + money);
    }
}
