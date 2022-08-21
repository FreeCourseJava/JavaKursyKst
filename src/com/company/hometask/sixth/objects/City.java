package com.company.hometask.sixth.objects;

import com.company.hometask.sixth.ObjectList;
import com.company.hometask.sixth.Parent;

public class City extends Parent {

    private final int size;

    private final ObjectList arrayCity = new ObjectList();

    private final ObjectList arrayStreetToCity = new ObjectList();

    public City(){
        this.size = 10;
    }

    public City(int size) {
        this.size = size;
    }


    public void setArray(Object object) {
        if (object instanceof City) {
            arrayCity.add(object);
            System.out.println("this is city!");
        } else if (object instanceof Street) {
            arrayStreetToCity.add(object);
            System.out.println("add street to city!");
        } else {
            arrayCity.add(object);
            System.out.println("this is other object!");
        }
    }


    public Object getObjects(int index) {
        return arrayCity.get(index);
    }


    public int getSquare() {
        return size;
    }
}
