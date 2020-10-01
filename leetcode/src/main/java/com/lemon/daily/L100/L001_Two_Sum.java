package com.lemon.daily.L100;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by lemoon on 2020/10/1 2:28 PM
 */
public class L001_Two_Sum {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        if (nums == null || nums.length < 2) {
            return null;
        }
        Map<Integer, Integer> map = new HashMap();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                result[0] = map.get(target - nums[i]);
                result[1] = i;
                return result;
            } else {
                map.put(nums[i], i);
            }
        }
        return result;
    }
}
