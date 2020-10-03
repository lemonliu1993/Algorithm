package com.lemon.daily.L100;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by lemoon on 2020/10/2 4:27 PM
 */
public class L003_longest_substring_without_repeating_characters {
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        Map<Character, Integer> map = new HashMap<>();
        int result = 0;
        int preIndex = -1;
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                preIndex = Math.max(preIndex, map.get(s.charAt(i)));
            }
            result = Math.max(result, i - preIndex);
            map.put(s.charAt(i), i);
        }
        return result;
    }

    public static void main(String[] args) {
//        String s = "aaa";
//        String s = "abcabc";
//        String s = "abcdabc";
        String s = "abcbabcd";
        System.out.println(new L003_longest_substring_without_repeating_characters().lengthOfLongestSubstring(s));
    }
}
