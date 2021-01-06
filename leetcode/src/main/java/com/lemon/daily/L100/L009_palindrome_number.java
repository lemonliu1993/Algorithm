package com.lemon.daily.L100;

/**
 * Created by lemoon on 2021/1/6 9:21 PM
 */
public class L009_palindrome_number {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int reverse = 0;
        int temp = x;
        while (temp != 0) {
            reverse = reverse * 10 + temp % 10;
            temp = temp / 10;
        }
        return reverse == x;
    }
}
