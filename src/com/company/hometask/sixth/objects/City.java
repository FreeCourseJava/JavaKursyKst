package com.company.hometask.sixth.objects;

import com.company.hometask.sixth.Measurable;
import com.company.hometask.sixth.ObjectList;

public class City implements Measurable {

    private final int size;

    private final ObjectList arrayCity = new ObjectList();

    private final ObjectList arrayStreetToCity = new ObjectList();

    public City(int size) {
        this.size = size;
    }

    @Override
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

    @Override
    public Object getObjects(int index) {
        return arrayCity.get(index);
    }

    @Override
    public int getSquare() {
        return size;
    }
}
