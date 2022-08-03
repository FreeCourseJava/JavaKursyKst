package com.company.hometask.fifth.objects;

import com.company.hometask.fifth.lists.HomeList;

public class Street {
    // Указывается номер улицы и название
    private String name;
    private boolean isHigh;
    private int distance, middleWidth;
    private HomeList homeList = new HomeList();


    public Street(String name, boolean isHigh, int distance, int middleWidth) {
        this.name = name;
        this.isHigh = isHigh;
        this.distance = distance;
        this.middleWidth = middleWidth;
    }

    public void setHomes(Home home) {
        homeList.pushNode(home);
    }

    public void printHomes() {
        homeList.printNode();
    }
    public int getAllSquare(){
        return homeList.getAllSquare();
    }

    public int getSquare() {
        return distance * middleWidth;
    }

    public int getHomesCount(){
        return homeList.getLength();
    }

}
