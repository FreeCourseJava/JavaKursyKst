package com.company.hometask.fifth.objects;

public class Home {
    private long homeId;
    private int length, width;

    public Home(long homeId, int length, int width) {
        this.homeId = homeId;
        this.length = length;
        this.width = width;
    }

    public int getSquare() {
        return length * width;
    }


}
