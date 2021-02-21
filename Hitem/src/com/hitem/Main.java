package com.hitem;


import com.hitem.manager.HManager;

public class Main {

    public static void main(String[] args) {
       HManager hManager = new HManager();
        hManager.fillHitemList();
        hManager.displayHitemList();
        hManager.singleHitemList();
        hManager.updateHitemList();
        hManager.deleteHitemList();
        hManager.displayHitemList();
    }
}
