package com.dbms.triplehao.service;

import com.dbms.triplehao.entity.Stores;

import java.util.List;

public interface StoreService {
    List<Stores> getStoreList();



    List<Stores> getStoreByName(String address);

    boolean addStore(Stores stores);
    List<Stores> getStoreById(int storeId);


    boolean deleteStore(int storeId);
    boolean modifyStore(Stores stores);



}
