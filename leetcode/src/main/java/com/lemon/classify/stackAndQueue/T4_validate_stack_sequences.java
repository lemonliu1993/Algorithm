package com.lemon.classify.stackAndQueue;

import java.util.Stack;

/**
 * Created by lemoon on 2020/10/1 2:54 PM
 * leetcode 946
 * <p>
 * 32145   12345
 */
public class T4_validate_stack_sequences {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        if (pushed == null && popped == null) {
            return true;
        }
        if (pushed == null || popped == null || pushed.length != popped.length) {
            return false;
        }
        int index = 0;
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < pushed.length; i++) {
            stack.push(pushed[i]);
            while ((!stack.isEmpty()) && stack.peek() == popped[index]) {
                index++;
                stack.pop();
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        int[] popped = {1, 2, 3, 4, 5};
//        int[] popped = {3, 2, 1, 4, 5};
        int[] pushed = {1, 2, 3, 4, 5};
        boolean b = new T4_validate_stack_sequences().validateStackSequences(pushed, popped);
        System.out.println(b);
    }
}
