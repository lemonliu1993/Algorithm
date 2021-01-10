package com.lemon.daily.L100;

/**
 * Created by lemoon on 2021/1/10 12:56 PM
 */
public class L014_longest_common_prefix {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        if (strs.length == 1) {
            return strs[0];
        }
        String shortest = strs[0];
        for (int i = 1; i < strs.length; i++) {
            if (strs[i].length() < shortest.length()) {
                shortest = strs[i];
            }
        }
        int index = 0;
        while (index < shortest.length()) {
            boolean isOver = false;
            for (int j = 0; j < strs.length; j++) {
                if (strs[j].charAt(index) != shortest.charAt(index)) {
                    isOver = true;
                }
            }
            if (isOver) {
                break;
            }
            index++;
        }
        return shortest.substring(0, index);
    }

    public static void main(String[] args) {
        String s = "avc";
//        String[] strs = {new String("abc"), new String("abcd"), new String("ab")};
        String[] strs = {"flower", "flow", "flight"};
        System.out.println(s.substring(0, 1));
        System.out.println(new L014_longest_common_prefix().longestCommonPrefix(strs));
    }
}
