package com.lemon.daily.L100;

/**
 * Created by lemoon on 2020/11/3 11:44 PM
 */
public class L034_find_first_and_last_position_of_element_in_sorted_array {
    public int[] searchRange(int[] nums, int target) {
        int[] result = new int[]{-1, -1};
        if (nums == null || nums.length == 0) {
            return result;
        }
        int left = findLeft(nums, target);
        int right = findRight(nums, target);
        result[0] = left;
        result[1] = right;
        return result;


    }

    private int findLeft(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int index = -1;
        while (left <= right) {
            int middle = (left + right) / 2;
            if (nums[middle] == target) {
                if (middle == 0 || nums[middle - 1] != target) {
                    return middle;
                } else {
                    right = middle - 1;
                }
            } else if (nums[middle] > target) {
                right = middle - 1;
            } else {
                left = middle + 1;
            }
        }
        return index;
    }

    private int findRight(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int index = -1;
        while (left <= right) {
            int middle = (left + right) / 2;
            if (nums[middle] == target) {
                if (middle == nums.length - 1 || nums[middle + 1] != target) {
                    return middle;
                } else {
                    left = middle + 1;
                }
            } else if (nums[middle] > target) {
                right = middle - 1;
            } else {
                left = middle + 1;
            }
        }
        return index;
    }
}
