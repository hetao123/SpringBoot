package com.example.demo.dao;

import com.example.demo.Account;
import org.springframework.stereotype.Component;

import java.util.List;

public interface IAccountDAO {
    int add(Account account);

    int update(Account account);

    int delete(int id);

    Account findAccountById(int id);

    List<Account> findAccountList();
}
