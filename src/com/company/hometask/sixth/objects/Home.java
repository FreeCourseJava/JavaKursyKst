package com.company.hometask.sixth.objects;

import com.company.hometask.sixth.ObjectList;
import com.company.hometask.sixth.Parent;

public class Home extends Parent {

    private final int length;
    private final int width;

    ObjectList arrayHome = new ObjectList();

    public Home(){
        this.length =10;
        this.width =10;
    }
    public Home(int length, int width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public int getSquare() {
        return width*length;
    }
}
