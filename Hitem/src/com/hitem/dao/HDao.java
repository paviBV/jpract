package com.hitem.dao;

import com.hitem.datastore.HDataStore;
import com.hitem.entities.Hitem;

import java.util.List;

public class HDao {

    HDataStore hDataStore = new HDataStore();

    public  void fillHitemList() {

        hDataStore.fillHitemList();
    }

    public List<Hitem> hitemList(){
        System.out.println("printing list");
        return hDataStore.hitemList();
    }
}
