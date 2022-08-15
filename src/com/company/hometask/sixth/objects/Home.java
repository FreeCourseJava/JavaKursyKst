package com.company.hometask.sixth.objects;

import com.company.hometask.sixth.Measurable;
import com.company.hometask.sixth.ObjectList;

public class Home implements Measurable {

    private final int length;
    private final int width;

    ObjectList arrayHome = new ObjectList();

    public Home(int length, int width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public void setArray(Object object) {
        if (object instanceof Home) {
            arrayHome.add(object);
            System.out.println("this is home");
        }else {
            arrayHome.add(object);
            System.out.println("this is other object!");
        }
    }

    @Override
    public Object getObjects(int index) {
        return arrayHome.get(index);
    }

    public int getSquare(){
        return length*width;
    }

}
