package com.hitem.datastore;

import com.hitem.entities.Hitem;

import java.util.ArrayList;
import java.util.List;

public class HDataStore {
    List<Hitem> hitemList = new ArrayList<>();

    public  void setHitemList(String id, String name, int cost) {
        Hitem hitem = new Hitem();
        hitem.settId(id);
        hitem.settName(name);
        hitem.settCost(cost);
        hitemList.add(hitem);
    }
    public  void fillHitemList(){
        setHitemList("H001", "Invertor", 5000);
        setHitemList("H002", "CD", 3000);
        setHitemList("H003", "Vaccum cleaner", 8000);
    }
    public List<Hitem> hitemList(){

        return hitemList;
    }

}
