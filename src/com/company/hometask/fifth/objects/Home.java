package com.company.hometask.fifth.objects;

public class Home {

    private final int length;
    private final int width;

    public Home( int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int getSquare() {
        return length * width;
    }
}
