package com.lemon.daily.L100;

/**
 * Created by lemoon on 2021/1/5 11:03 PM
 */
public class L008_string_to_integer_atoi {
    public int myAtoi(String s) {
        if (s == null) {
            return 0;
        }
        s = s.trim();
        if (s.length() == 0) {
            return 0;
        }
        boolean isSig = false;
        int res = 1;
        if (s.charAt(0) == '-') {
            res = -1;
            isSig = true;
        }
        if (s.charAt(0) == '+') {
            res = 1;
            isSig = true;
        }
        int index = 0;
        if (isSig) {
            index = 1;
        }
        int result = 0;
        for (; index < s.length(); index++) {
            if (s.charAt(index) >= '0' && s.charAt(index) <= '9') {
                if (result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE / 10 && s.charAt(index) >= '7')) {
                    return Integer.MAX_VALUE;
                }
                if (result < Integer.MIN_VALUE / 10 || (result == Integer.MIN_VALUE / 10 && s.charAt(index) >= '8')) {
                    return Integer.MIN_VALUE;
                }
                result = result * 10 + res * (s.charAt(index) - '0');
            } else {
                break;
            }
        }
        return result;
    }
}
