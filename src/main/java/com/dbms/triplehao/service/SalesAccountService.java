package com.dbms.triplehao.service;
import com.dbms.triplehao.entity.SalesAccount;

import java.util.List;

public interface SalesAccountService {

    List<SalesAccount> searchSalesAccount(String username);
    boolean addSalesAccount(SalesAccount salesAccount);

}
