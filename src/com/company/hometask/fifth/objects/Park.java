package com.company.hometask.fifth.objects;

public class Park {
    private final String name;
    private final int length;
    private final int width;

    public Park(String name , int length , int width){
        this.name = name;
        this.length = length;
        this.width = width;
    }

    public void getName(){
        System.out.println(name);
    }

    public int getSquareOfOnePark(){
        return length*width;
    }
}
