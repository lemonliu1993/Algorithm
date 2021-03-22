package com.lemon.classify.stackAndQueue;

import java.util.Stack;

/**
 * Created by lemoon on 2021/3/16 9:04 AM
 * leetcode946
 */
public class T4_Validate_Stack_Sequences {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        if (pushed == null || popped == null) {
            return false;
        }
        if (pushed.length != popped.length) {
            return false;
        }
        int index = 0;
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < pushed.length; i++) {
            if (pushed[i] != popped[index]) {
                stack.push(pushed[i]);
            } else {
                index++;
                while (!stack.isEmpty() && stack.peek() == popped[index]) {
                    stack.pop();
                    index++;
                }

            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        int[] pushed = {1, 2, 3, 4};
//        int[] poped = {1,2,3,4};
        int[] poped = {4, 3, 2, 1};
        boolean b = new T4_Validate_Stack_Sequences().validateStackSequences(pushed, poped);
        System.out.println(b);
    }
}
