package com.dbms.triplehao.service;

import com.dbms.triplehao.entity.CustomerAccount;

import java.util.List;

public interface CustomerAccountService
{
    List<CustomerAccount> searchCustomerAccount(String username);
    boolean addCustomerAccount(CustomerAccount customerAccount);

    int countCustomer();
}
