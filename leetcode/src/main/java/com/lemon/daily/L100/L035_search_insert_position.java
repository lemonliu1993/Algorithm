package com.lemon.daily.L100;

/**
 * Created by lemoon on 2021/1/14 11:58 PM
 */
public class L035_search_insert_position {
    public int searchInsert(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int middle = (left + right) / 2;
            if (nums[middle] == target) {
                return middle;
            } else if (nums[middle] < target) {
                if (middle == nums.length - 1 || nums[middle + 1] > target) {
                    return middle + 1;
                }
                left = middle + 1;
            } else {
                if (middle == 0 || nums[middle - 1] < target) {
                    return middle;
                }
                right = middle - 1;
            }
        }
        return left;
    }
}
