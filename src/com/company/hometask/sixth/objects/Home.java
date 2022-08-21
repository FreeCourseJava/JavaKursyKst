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


    public void setArray(Object object) {
        if (object instanceof Home) {
            arrayHome.add(object);
            System.out.println("this is home");
        }else {
            arrayHome.add(object);
            System.out.println("this is other object!");
        }
    }


    public Object getObjects(int index) {
        return arrayHome.get(index);
    }

    public int getSquare(){
        return length*width;
    }

}
