package com.lemon.classify.recursive;

import java.util.*;

/**
 * Created by lemoon on 2020/12/30 10:45 PM
 * leetcode 90
 */
public class T2_subsets_ii {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        if (nums == null || nums.length == 0) {
            return result;
        }
        Arrays.sort(nums);
        List<Integer> list = new ArrayList<>();
        Set<List<Integer>> set = new HashSet<>();
        set.add(new ArrayList<>(list));
        generate(set, list, 0, nums);
        for (List<Integer> list1 : set) {
            result.add(list1);
        }
        return result;
    }

    private void generate(Set<List<Integer>> set, List<Integer> list, int i, int[] nums) {
        if (i >= nums.length) {
            set.add(new ArrayList<>(list));
            return;
        }
        list.add(nums[i]);
        generate(set, list, i + 1, nums);
        list.remove(list.size() - 1);
        generate(set, list, i + 1, nums);
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2};
        List<List<Integer>> lists = new T2_subsets_ii().subsetsWithDup(arr);
        System.out.println(lists);
    }

}
