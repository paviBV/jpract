package com.hitem.manager;

import com.hitem.dao.HDao;
import com.hitem.entities.Hitem;
import java.util.List;

public class HManager {
    HDao hDao = new HDao();
    List<Hitem> list = hDao.hitemList();

    public  void fillHitemList() {
        hDao.fillHitemList();
    }


    public void displayHitemList() {
        System.out.println("Displaying total records");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    public void singleHitemList() {
        System.out.println("Displaying single record");
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).gettId()=="H002") {
                System.out.println(list.get(i));
            }
        }
    }
    public void updateHitemList() {
        System.out.println("Displaying updated record");
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).gettId()=="H002") {
                list.get(i).settName("Dj set");
                list.get(i).settCost(9000);
                System.out.println(list.get(i));
            }
        }
    }
    public void deleteHitemList() {
        System.out.println("Deleting record");
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).gettId()=="H001") {
                list.remove(i);
            }
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).gettId()=="H001") {
                System.out.println("Record available");
            }else {
                System.out.println("Record deleted successfully");
                break;
            }
        }
    }
}
