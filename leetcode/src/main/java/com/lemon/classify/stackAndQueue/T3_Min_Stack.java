package com.lemon.classify.stackAndQueue;

import java.util.Stack;

/**
 * Created by lemoon on 2021/3/15 11:28 PM
 * leetcode155
 */
public class T3_Min_Stack {
    Stack<Integer> stack = new Stack<>();
    Stack<Integer> min = new Stack<>();

    public void push(int x) {
        if(min.isEmpty()){
            min.push(x);
        }else {
            if(x<min.peek()){
                min.push(x);
            }else {
                min.push(min.peek());
            }
        }

        stack.push(x);
    }

    public void pop() {
        stack.pop();
        min.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return min.peek();
    }
}
