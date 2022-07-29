package com.company.hometask.forth;

public class Cocktail {
    public static void main(String[] args) {
        int[] a = {5, 1, 4, 2, 5, 8, 2, 0};
        printArray(a);
    }

    public static void printArray(int[] a) {
        int[] resultArray = new int[a.length];
       resultArray = cocktailSort(a);
        for (int j : resultArray) {
            System.out.println(j);
        }
    }

    private static int[] cocktailSort(int[] a) {
        boolean swapped = true;
        int start = 0;
        int end = a.length;
        while (swapped) {
            swapped = false;
            for (int i = start; i < end-1; i++) {
                if (a[i] > a[i + 1]) {
                    int temp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
            swapped = false;
            end = end - 1;
            for (int i = end - 1; i >= start; i--) {
                if (a[i] > a[i + 1]) {
                    int temp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = temp;
                    swapped = true;
                }
            }
            start = start + 1;
        }
        return a;
    }
}
