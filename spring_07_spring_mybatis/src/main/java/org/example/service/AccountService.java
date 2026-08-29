package org.example.service;

import org.example.domain.Account;

import java.util.List;

public interface AccountService {
    void save(Account account);

    void update(Account account);
    void delete(Integer id);
    List<Account> findAll();
    Account findById(Integer id);

}
