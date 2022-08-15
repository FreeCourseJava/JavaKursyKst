package com.company.hometask.sixth.objects;

import com.company.hometask.sixth.Measurable;
import com.company.hometask.sixth.ObjectList;

public class Street implements Measurable {

    private final int length;
    private final int width;

    private final ObjectList arrayStreet = new ObjectList();

    private final ObjectList arrayHomeToStreet = new ObjectList();

    public Street(int length, int width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public void setArray(Object object) {
        if (object instanceof Street) {
            arrayStreet.add(object);
        } else if (object instanceof Home) {
            arrayHomeToStreet.add(object);
            System.out.println("add home to street!");
        } else {
            arrayStreet.add(object);
            System.out.println("this is other object!");
        }
    }

    @Override
    public Object getObjects(int index) {
        return arrayStreet.get(index);
    }

    @Override
    public int getSquare() {
        return length * width;
    }
}
