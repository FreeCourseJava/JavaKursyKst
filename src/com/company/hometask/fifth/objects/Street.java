package com.company.hometask.fifth.objects;

import com.company.hometask.fifth.lists.HomeList;

public class Street {
    // Указывается номер улицы и название
    private final int distance;
    private final int middleWidth;
    private final HomeList homeList = new HomeList();

    public Street( int distance, int middleWidth) {
        this.distance = distance;
        this.middleWidth = middleWidth;
    }

    public void setHomes(Home home) {
        homeList.pushNode(home);
    }

    public void printHomes() {
        homeList.printNode();
    }
    public int getHomesSquaresFromOneStreet(){
        return homeList.getSquaresOfHomes();
    }

    public int getSquareOfStreet() {
        return distance * middleWidth;
    }

    public int getHomesCount(){
        return homeList.getLength();
    }
}
