package com.lemon.classify.linkedlist;

/**
 * Created by lemoon on 2020/10/3 1:20 PM
 * leetcode 206
 */
public class T1_Reverse_Linked_List {

    public ListNode reverseList(ListNode head) {
        ListNode result = new ListNode(0);
        if (head == null) {
            return null;
        }
        while (head != null) {
            ListNode newHead = head.next;
            head.next = result.next;
            result.next = head;
            head = newHead;
        }
        return result.next;
    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
