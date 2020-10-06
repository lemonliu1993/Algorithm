package com.lemon.classify.stackAndQueue;

import java.util.Stack;

/**
 * Created by lemoon on 2020/10/1 6:02 PM
 */
public class T3_Min_Stack {

    Stack<Integer> stack = new Stack();
    Stack<Integer> min = new Stack();
    public void push(int x) {
        stack.push(x);
        if(min.isEmpty()){
            min.push(x);
        }else{
            Integer minVal = this.min.peek();
            if(minVal<x){
                min.push(minVal);
            }else{
                min.push(x);
            }
        }

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
