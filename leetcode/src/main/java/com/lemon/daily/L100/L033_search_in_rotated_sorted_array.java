package com.lemon.daily.L100;

/**
 * Created by lemoon on 2020/11/2 11:06 PM
 */
public class L033_search_in_rotated_sorted_array {
    public int search(int[] nums, int target) {
        if (nums == null || nums.length < 1) {
            return -1;
        }
        int begin = 0;
        int end = nums.length - 1;
        while (begin <= end) {
            int middle = (begin + end) / 2;
            if (nums[middle] == target) {
                return middle;
            }
            //4,5,6,7,0,1,2
            //分为两端，一段上升，一段下降后上升
            if (nums[middle] > target) {
                if (nums[begin] <= nums[middle]) {       //第一段上升
                    if (nums[begin] == target) {
                        return begin;
                    } else if (nums[begin] >= target) {
                        begin = middle + 1;
                    } else {
                        end = middle - 1;
                    }
                } else {//第一段下降
                    end = middle - 1;
                }
            } else {
                if (nums[begin] <= nums[middle]) {       //第一段上升
                    begin = middle + 1;
                } else {//第一段下降
                    if (nums[end] == target) {
                        return end;
                    } else if (nums[end] >= target) {
                        begin = middle + 1;
                    } else {
                        end = middle - 1;
                    }
                }
            }
        }
        return -1;
    }
}
