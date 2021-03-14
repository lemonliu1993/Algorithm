package com.lemon.classify.stackAndQueue;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by lemoon on 2021/2/8 11:54 PM
 * leetcode225
 */
public class T1_Implement_Stack_using_Queues {
    private Queue<Integer> q1 = new LinkedList();
    private Queue<Integer> q2 = new LinkedList();


    public T1_Implement_Stack_using_Queues() {

    }

    /**
     * Push element x onto stack.
     */
    public void push(int x) {
        q2.add(x);
        while (!q1.isEmpty()) {
            q2.add(q1.poll());
        }

        Queue temp = q1;
        q1 = q2;
        q2 = temp;
    }

    /**
     * Removes the element on top of the stack and returns that element.
     */
    public int pop() {
        return q1.poll();
    }

    /**
     * Get the top element.
     */
    public int top() {
        return q1.peek();
    }

    /**
     * Returns whether the stack is empty.
     */
    public boolean empty() {
        return q1.isEmpty();
    }
}
