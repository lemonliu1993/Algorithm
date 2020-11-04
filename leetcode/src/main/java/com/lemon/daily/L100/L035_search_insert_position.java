package com.lemon.daily.L100;

/**
 * Created by lemoon on 2020/11/4 8:42 AM
 */
public class L035_search_insert_position {
    public int searchInsert(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int middle = (start + end) / 2;
            if (nums[middle] == target) {
                return middle;
            }
            if (nums[middle] > target) {
                if (middle == 0) {
                    return 0;
                }
                if (nums[middle - 1] < target) {
                    return middle;
                } else {
                    end = middle - 1;
                }
            } else if (nums[middle] < target) {
                if (middle == nums.length - 1) {
                    return nums.length;
                }
                if (nums[middle + 1] > target) {
                    return middle + 1;
                } else {
                    start = middle + 1;
                }
            }
        }
        return -1;
    }
}
