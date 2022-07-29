package com.company.hometask.forth;

public class Search {

    public static void main(String[] args) {
        int[] nums = {2, 5, 6, 8, 9, 10};
        int target = 5;
        int left = 0;
        int right = nums.length - 1;
        int index = binarySearch(nums, left, right, target);
        System.out.println(index);
    }

    public static int binarySearch(int[] nums, int left, int right, int target) {
        if (left > right) {
            return -1;
        }

        int mid = (left + right) / 2;

        if (target == nums[mid]) {
            return target;
        } else if (target < nums[mid]) {
            return binarySearch(nums, left, mid - 1, target);
        } else {
            return binarySearch(nums, mid + 1, right, target);
        }
    }
}
