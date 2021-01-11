package com.lemon.daily.L100;

import java.util.*;

/**
 * Created by lemoon on 2021/1/10 11:11 PM
 */
public class L015_3sum {
    List<List<Integer>> result = new ArrayList<List<Integer>>();
    Set<List<Integer>> set = new HashSet<List<Integer>>();

    public List<List<Integer>> threeSum(int[] nums) {
        if (nums == null || nums.length <= 2) {
            return result;
        }

        Arrays.sort(nums);
        for (int i = 0; i <= nums.length - 3; i++) {
            findNum(-nums[i], i, nums);
        }
        result = new ArrayList<List<Integer>>(set);
        return result;
    }

    private void findNum(int sum, int index, int[] nums) {
        int left = index + 1;
        int right = nums.length - 1;
        while (left < right) {
            if (nums[left] + nums[right] == sum) {
                List<Integer> list = new ArrayList<Integer>();
                list.add(nums[index]);
                list.add(nums[left]);
                list.add(nums[right]);
                set.add(list);
                left++;
            } else if (nums[left] + nums[right] > sum) {
                right--;
            } else {
                left++;
            }
        }
    }
}
