package com.lemon.daily.L100;

/**
 * Created by lemoon on 2020/10/13 11:50 PM
 */
public class L013_roman_to_integer {
    public int romanToInt(String s) {
        int[] nums = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] romans = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int result = 0;
        int offset = 0;
        for (int i = 0; i < romans.length; i++) {
            if (s.startsWith(romans[i], offset)) {
                result += nums[i];
                offset += romans[i].length();
                i--;
            }
        }
        return result;
    }
}
