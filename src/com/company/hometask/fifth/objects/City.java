package com.company.hometask.fifth.objects;

import com.company.hometask.fifth.lists.HomeList;
import com.company.hometask.fifth.lists.StreetList;

public class City {
    private String name;
    private int maxLength, maxWidth;
    private StreetList streetList = new StreetList();
    private HomeList homeList = new HomeList();


    public City(int maxLength, int maxWidth) {
        this.maxLength = maxLength;
        this.maxWidth = maxWidth;
    }

    public void setStreets(Street street) {
        streetList.pushNode(street);
    }

    public void printStreets() {
        streetList.printNode();
    }

    public int getAllSquare() {
        return streetList.getAllSquare();
    }

    public int getHomesCount() {
        return streetList.getHomesCountFromStreet()*streetList.getLength();
    }
}
