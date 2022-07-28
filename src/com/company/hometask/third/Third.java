package com.company.hometask.third;

import java.util.Random;

public class Third {
    // Написать метод, который на вход
    // принимает отсортированный массив годов
    // (из 2-го задания) и произвольный год,
    // возвращает boolean значение, которое
    // означает наличие или отсутствие даты
    // в переданном массиве. Читаем и используем binary search (бинарный поиск).


    public static void main(String[] args) {
        Second second = new Second();
        int[] massive = second.sortedMassive;
        boolean isExist;

        isExist = search(massive, massive[randomDate(massive.length)]);

        System.out.println(isExist);
    }

    public static boolean search(int[] nums, int target) {
        int firstIndex = 0;
        int lastIndex = nums.length - 1;

        while (firstIndex <= lastIndex) {
            int middleIndex = (firstIndex + lastIndex) / 2;

            if (nums[middleIndex] == target) {
                return true;
            } else if (nums[middleIndex] < target) {
                firstIndex = middleIndex + 1;
            } else if (nums[middleIndex] > target) {
                lastIndex = middleIndex - 1;
            }
        }
        return false;
    }

    public static int randomDate(int massiveLength) {
        Random random = new Random();
        return random.nextInt(massiveLength);
    }
}

