package com.company.hometask.third;

import java.util.Random;

public class First {
    // 1. Создать массив интов, заполнить его значениями Integer.MIN_VALUE.
    // Поменять какие-то значения в массиве.
    // Посчитать сколько элементов массива не равны Integer.MIN_VALUE.
    // Таким образом получим сколько элементов менялось от первоначального.
    public static void main(String[] args) {
        int massiveLength = 55;
        System.out.println(countTheNumbers(massiveLength, 5));
    }

    public static int countTheNumbers(int massiveLength, int otherNumber) {
        int result;
        int[] massive = new int[massiveLength], resultMassive;

        for (int i = 0; i < massiveLength; i++) {
            massive[i] = Integer.MIN_VALUE;
        }
        resultMassive = changeMassive(massiveLength, otherNumber, massive);
        result = checkForAnother(massiveLength, otherNumber, resultMassive);
        return result;
    }

    private static int[] changeMassive(int massiveLength, int otherNumber, int[] massive) {
        Random random = new Random();

        for (int i = 0; i < massiveLength; i++) {
            int randomNumber = random.nextInt(massiveLength);
            if (i == randomNumber) {
                massive[i] = otherNumber;
            }
        }
        return massive;
    }

    private static int checkForAnother(int masiveLength, int otherNumber, int[] massive) {
        int countOfAnother = 0;
        for (int i = 0; i < masiveLength; i++) {
            if (massive[i] == otherNumber) {
                countOfAnother++;
            }
        }
        return countOfAnother;
    }

}
