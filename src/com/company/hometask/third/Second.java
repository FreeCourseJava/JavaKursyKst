package com.company.hometask.third;

public class Second {
    public final int[] sortedMassive = bubbleSort(yearsOfTatarstan().length, yearsOfTatarstan());

    // 2. Составить массив из значимых годов Республики
    // Татартсан (любые 20), добавить их в массив в
    // рандомном порядке, написать метод, принимающий
    // массив годов (интов) и возвращающий их в отсортированном
    // порядке. Сортировку реализовать методом bubble sort
    // (пузырьковая сортировка).
    public static void main(String[] args) {
        sortedYears();
    }

    public static void sortedYears() {

        int[] result = bubbleSort(yearsOfTatarstan().length, yearsOfTatarstan());
        for (int i = 0; i < yearsOfTatarstan().length; i++) {
            System.out.println(result[i]);
        }
    }

    private static int[] bubbleSort(int massiveLength, int[] massive) {
        for (int i = 0; i < massiveLength - 1; i++) {
            for (int j = massiveLength - 1; j > i; j--) {
                if (massive[j - 1] > massive[j]) {
                    int temp = massive[j - 1];
                    massive[j - 1] = massive[j];
                    massive[j] = temp;
                }
            }
        }
        return massive;
    }

    private static int[] yearsOfTatarstan() {
        return new int[]{1708, 1709, 1725, 1718,
                1918, 1920, 1921, 1922, 1927, 1936, 1952, 1953,
                1723, 1759, 1781, 1796, 1805, 1891, 1892, 1917,};
    }

}
