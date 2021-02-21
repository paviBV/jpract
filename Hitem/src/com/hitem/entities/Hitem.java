package com.hitem.entities;

public class Hitem {
    private String tId;
    private String tName;
    private int tCost;

    public String gettId() {
        return tId;
    }

    public void settId(String tId) {
        this.tId = tId;
    }

    public String gettName() {
        return tName;
    }

    public void settName(String tName) {
        this.tName = tName;
    }

    public int gettCost() {
        return tCost;
    }

    public void settCost(int tCost) {
        this.tCost = tCost;
    }

    @Override
    public String toString() {
        return "Hitem{" +
                "tId='" + tId + '\'' +
                ", tName='" + tName + '\'' +
                ", tCost=" + tCost +
                '}';
    }
}
