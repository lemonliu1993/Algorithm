package com.lemon.daily.L100;

/**
 * Created by lemoon on 2021/1/8 11:31 PM
 */
public class L012_integer_to_roman {
    public String intToRoman(int num) {
        String[] str = {"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"};
        int[] nums = {1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};
        StringBuilder result = new StringBuilder();
        for (int i = nums.length - 1; i >= 0; i--) {
            int val = num / nums[i];
            if (val > 0) {
                for (int j = 0; j < val; j++) {
                    result.append(str[i]);
                }
                num = num - nums[i] * val;
            }
        }
        return result.toString();
    }
}
