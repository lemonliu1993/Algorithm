package com.lemon.daily.L100;

/**
 * Created by lemoon on 2020/10/2 4:45 PM
 */
public class L004_median_of_two_sorted_arrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if (nums1 == null && nums2 == null) {
            return 0;
        }
        int len1 = nums1.length;
        int len2 = nums2.length;
        int total = len1 + len2;
        if (total % 2 == 0) {
            //找中间两个
            //1,2    3,4      2,3   len:4
            //1,2,3,4   5,6     3,4     len:6
            int n1 = findK(nums1, 0, nums1.length - 1, nums2, 0, nums2.length - 1, total / 2);
            int n2 = findK(nums1, 0, nums1.length - 1, nums2, 0, nums2.length - 1, total / 2 + 1);
            return (n1 + n2) / 2.0;
        } else {
            //找中间一个
            int n1 = findK(nums1, 0, nums1.length - 1, nums2, 0, nums2.length - 1, (total + 1) / 2);
            return n1;
        }

    }

    private int findK(int[] nums1, int start1, int end1, int[] nums2, int start2, int end2, int k) {
        int len1 = end1 - start1 + 1;
        int len2 = end2 - start2 + 1;
        if (len1 > len2) {
            return findK(nums2, start2, end2, nums1, start1, end1, k);
        }
        //PS:这一步要放在前面
        if (len1 == 0) {
            return nums2[start2 + k - 1];
        }
        if (k == 1) {
            return Math.min(nums1[start1], nums2[start2]);
        }

        int part1 = Math.min(len1, k / 2);
        int part2 = k - part1;
        if (nums1[start1 + part1 - 1] == nums2[start2 + part2 - 1]) {
            return nums1[part1 - 1];
        } else if (nums1[start1 + part1 - 1] < nums2[start2 + part2 - 1]) {
            return findK(nums1, start1 + part1, end1, nums2, start2, end2, k - part1);
        } else {
            return findK(nums1, start1, end1, nums2, start2 + part2, end2, k - part2);
        }
    }

    public static void main(String[] args) {
//        int[] a1 = {1, 2, 3};
        int[] a1 = {};
        int[] a2 = {4, 5};
        System.out.println(new L004_median_of_two_sorted_arrays().findMedianSortedArrays(a1, a2));
    }
}
