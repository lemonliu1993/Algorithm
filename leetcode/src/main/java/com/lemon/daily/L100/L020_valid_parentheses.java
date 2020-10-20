package com.lemon.daily.L100;

import java.util.Stack;

/**
 * Created by lemoon on 2020/10/20 11:58 PM
 */
public class L020_valid_parentheses {
    public boolean isValid(String s) {
        if (s == null || s == "") {
            return true;
        }
        if (s.length() % 2 == 1) {
            return false;
        }
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case '(':
                case '[':
                case '{':
                    stack.push(s.charAt(i));
                    break;

                case ')':
                    if (stack.isEmpty()) {
                        return false;
                    }
                    if (stack.pop() != '(') {
                        return false;
                    }
                    break;
                case ']':
                    if (stack.isEmpty()) {
                        return false;
                    }
                    if (stack.pop() != '[') {
                        return false;
                    }
                    break;
                case '}':
                    if (stack.isEmpty()) {
                        return false;
                    }
                    if (stack.pop() != '{') {
                        return false;
                    }
                    break;
            }
        }
        return stack.isEmpty();

    }
}
