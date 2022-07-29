package com.company.hometask.forth;

public class Factorial {
    public static void main(String[] args) {
        getFactorial(5);
    }

    public static void getFactorial(int number) {

        if (number == 0) {
            System.out.println(1);
        } else if (number < 0) {
            System.out.println("Only positive!");
        } else {
            int result = 1;
            for (int i = 1; i <= number; i++) {
                result = result * i;
            }
            System.out.println(result);
        }

    }
}
