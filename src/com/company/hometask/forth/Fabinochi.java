package com.company.hometask.forth;

public class Fabinochi {
    public static void main(String[] args) {
        runFabinochi();
    }

    public static void runFabinochi() {
        int num = 1;
        int sum = 1;
        int temp;

        while (num < 1000) {
            System.out.println(num);
            temp = num;
            num = sum;
            sum = num + temp;
        }
    }

}
