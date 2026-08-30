package org.example.service.impl;

import org.example.dao.AccountDao;
import org.example.domain.Account;
import org.example.service.AccountService;
import org.example.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountDao accountDao;

    @Autowired
    private LogService logService;

    public void transfer(String out, String in, Double money) {
        try{
            accountDao.outMoney(out, money);
            accountDao.inMoney(in, money);
        } finally {
            logService.log(out, in, money);

        }

    }
}
