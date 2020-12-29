package com.lemon.classify.recursive;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lemoon on 2020/12/29 11:37 PM
 * leetcode 78
 */
public class T1_subsets {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if (nums == null || nums.length == 0) {
            return result;
        }
        List<Integer> list = new ArrayList<Integer>();
        //PS:因为有空集合，所以要先加入这个
        result.add(new ArrayList<Integer>(list));
        generate(result, list, 0, nums);
        return result;
    }

    private void generate(List<List<Integer>> result, List<Integer> list, int i, int[] nums) {
        if (i >= nums.length) {
            return;
        }
        list.add(nums[i]);
        result.add(new ArrayList<Integer>(list));
        generate(result, list, i + 1, nums);
        list.remove(list.size() - 1);
        generate(result, list, i + 1, nums);
    }
}
