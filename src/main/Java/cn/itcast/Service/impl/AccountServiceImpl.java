package cn.itcast.Service.impl;

import cn.itcast.Dao.AccountDao;
import cn.itcast.Service.AccountService;
import cn.itcast.domain.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("accountService")
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountDao accountDao;

    @Override
    public List<Account> findAll() {
        System.out.println("查询所有");
        return accountDao.findAll();
    }

    @Override
    public void save(Account account) {
        System.out.println("保存账户");
    }
}
