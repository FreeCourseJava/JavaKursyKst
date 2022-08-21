package com.company.hometask.sixth.objects;

import com.company.hometask.sixth.ObjectList;
import com.company.hometask.sixth.Parent;

public class City extends Parent {

    private final int size;

    private final ObjectList arrayCity = new ObjectList();

    public City(){
        this.size = 10;
    }

    public City(int size) {
        this.size = size;
    }

    @Override
    public int getSquare() {
        return size;
    }
}
