package com.lemon.daily.L100;

/**
 * Created by lemoon on 2021/1/4 7:41 AM
 */
public class L007_reverse_integer {
    public int reverse(int x) {
        if (x == 0) {
            return x;
        }
        int result = 0;
        while (x != 0) {
            int res = x % 10;
            if (result > Integer.MAX_VALUE / 10 || result < Integer.MIN_VALUE / 10) {
                return 0;
            }
            if (result == Integer.MAX_VALUE / 10 && res > 7) {
                return 0;
            }
            if (result == Integer.MIN_VALUE && res > 8) {
                return 0;
            }
            x = x / 10;
            result = result * 10 + res;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(new L007_reverse_integer().reverse(-123));
    }
}
