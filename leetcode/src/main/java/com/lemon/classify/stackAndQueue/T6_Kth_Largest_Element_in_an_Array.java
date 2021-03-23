package com.lemon.classify.stackAndQueue;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Created by lemoon on 2020/10/1 2:56 PM
 * leetcode 215
 */
public class T6_Kth_Largest_Element_in_an_Array {
    public int findKthLargest(int[] nums, int k) {
        if (nums == null || nums.length < k) {
            throw new RuntimeException();
        }
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        });

        for (int i = 0; i < nums.length; i++) {
            if (priorityQueue.size() < k) {
                priorityQueue.offer(nums[i]);
            } else {
                if (nums[i] > priorityQueue.peek()) {
                    priorityQueue.poll();
                    priorityQueue.offer(nums[i]);
                }
            }
        }

        return priorityQueue.peek();
    }

    public static void main(String[] args) {
        int[] arr = {3, 5, 1, 2, 8};
        System.out.println(new T6_Kth_Largest_Element_in_an_Array().findKthLargest(arr, 2));
    }
}
