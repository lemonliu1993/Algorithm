package com.lemon.daily.L100;

/**
 * Created by lemoon on 2020/10/3 6:08 PM
 */
public class L005_Longest_Palindromic_Substring {
    String str = "";

    public String longestPalindrome(String s) {
        if (s == null || s.length() <= 0) {
            return null;
        }

        for (int i = 0; i < s.length(); i++) {
            getLongest(s, i, i);
            getLongest(s, i, i + 1);
        }

        return str;

    }


    private void getLongest(String s, int i, int j) {
        while (i >= 0 && j <= s.length() - 1) {
            if (s.charAt(i) == s.charAt(j)) {
                i--;
                j++;
            } else {
                break;
            }
        }
        int len = j - i - 1;
        if (len > str.length()) {
            str = s.substring(i + 1, j);
        }
    }

    public static void main(String[] args) {
        System.out.println(new L005_Longest_Palindromic_Substring().longestPalindrome("a"));
    }
}

