package com.company.hometask.first;

public class Float {
    public static void main(String[] args) {
        multiplayFloat(4);
    }

    /**
     * Float это примитив с пловоющей точкой, то есть он может разделять свои биты
     * на число до точки и после
     * В данной ситуаций число вышло за пределы своего диапозона и
     * число также обрезалось, и на консоль выводит Infinity
     */

    private static void multiplayFloat(int multiplayCount) {
        float someFloat = 1000000000, result = 0;

        for (int i = 0; i < multiplayCount - 1; i++) {
            someFloat = someFloat*someFloat;
        }

        System.out.println(someFloat);
    }
}
