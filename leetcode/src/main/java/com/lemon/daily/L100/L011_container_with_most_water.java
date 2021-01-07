package com.lemon.daily.L100;

/**
 * Created by lemoon on 2021/1/7 11:12 PM
 */
public class L011_container_with_most_water {
    public int maxArea(int[] height) {
        if (height == null || height.length < 2) {
            return 0;
        }
        int start = 0;
        int end = height.length - 1;
        int result = 0;
        while (start <= end) {
            int width = end - start;
            result = Math.max(result, Math.min(height[start], height[end]) * width);
            if (height[start] < height[end]) {
                start++;
            } else {
                end--;
            }
        }

        return result;
    }
}
