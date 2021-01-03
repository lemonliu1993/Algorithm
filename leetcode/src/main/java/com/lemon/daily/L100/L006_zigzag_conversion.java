package com.lemon.daily.L100;

/**
 * Created by lemoon on 2021/1/3 9:44 AM
 */
public class L006_zigzag_conversion {
    public String convert(String s, int numRows) {
        if (numRows <= 1 || s == null || s.length() <= 2) {
            return s;
        }
        StringBuilder[] sbs = new StringBuilder[numRows];
        for (int i = 0; i < sbs.length; i++) {
            sbs[i] = new StringBuilder();
        }
        int index = 0;
        while (index < s.length()) {
            for (int i = 0; i < sbs.length; i++) {
                if (index >= s.length()) {
                    break;
                } else {
                    sbs[i].append(s.charAt(index++));
                }
            }
            for (int j = sbs.length - 2; j > 0; j--) {
                if (index >= s.length()) {
                    break;
                } else {
                    sbs[j].append(s.charAt(index++));
                }
            }
        }
        for (int i = 1; i < sbs.length; i++) {
            sbs[0].append(sbs[i]);
        }
        return sbs[0].toString();
    }

    public static void main(String[] args) {
        String leetcodeishiring = new L006_zigzag_conversion().convert("abc", 2);
        System.out.println(leetcodeishiring.equals("acb"));
    }
}
