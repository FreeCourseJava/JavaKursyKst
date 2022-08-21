package com.company.hometask.sixth.objects;

import com.company.hometask.sixth.ObjectList;
import com.company.hometask.sixth.Parent;

public class Street extends Parent {

    private final int length;
    private final int width;

    private final ObjectList arrayStreet = new ObjectList();

    public Street() {
        this.length = 10;
        this.width = 10;
    }

    public Street(int length, int width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public int getSquare() {
        return length*width;
    }
}
