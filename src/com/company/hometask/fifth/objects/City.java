package com.company.hometask.fifth.objects;

import com.company.hometask.fifth.lists.HomeList;
import com.company.hometask.fifth.lists.StreetList;

public class City {
    private final StreetList streetList = new StreetList();

    public void setStreets(Street street) {
        streetList.pushNode(street);
    }

    public int getSquaresFromAllStreets() {
        return streetList.getSumOfSquaresOfStreetNode();
    }

    public int getHomesCount() {
        return streetList.getHomesCountFromStreet();
    }
}
