package com.company.hometask.sixth.objects;

import com.company.hometask.sixth.ObjectList;
import com.company.hometask.sixth.Parent;

public class Street extends Parent {

    private final int length;
    private final int width;

    private final ObjectList arrayStreet = new ObjectList();

    private final ObjectList arrayHomeToStreet = new ObjectList();

    public Street() {
        this.length = 10;
        this.width = 10;
    }

    public Street(int length, int width) {
        this.length = length;
        this.width = width;
    }

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

    public Object getObjects(int index) {
        return arrayStreet.get(index);
    }


    public int getSquare() {
        return length * width;
    }
}
