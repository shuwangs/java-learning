package org.example.service;

import org.example.domain.Account;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface AccountService {

    /**
     *
     * @param out
     * @param in
     * @param money
     */
    @Transactional
    public void transfer(String out, String in, Double money);
}
