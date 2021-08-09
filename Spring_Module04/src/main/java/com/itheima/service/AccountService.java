package com.itheima.service;

import com.itheima.domain.Account;

import java.util.List;

public interface AccountService {
    public abstract void save(Account account);

    public abstract void delete(Integer id);

    public abstract void update(Account account);

    public abstract List<Account> findAll();

    public abstract Account findById(Integer id);
}
