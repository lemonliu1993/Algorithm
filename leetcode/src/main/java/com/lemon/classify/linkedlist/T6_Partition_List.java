package com.lemon.classify.linkedlist;

/**
 * Created by lemoon on 2021/1/28 11:53 PM
 * leetcode 86
 */
public class T6_Partition_List {
    public ListNode partition(ListNode head, int x) {
        if (head == null) {
            return null;
        }
        ListNode less = new ListNode(0);
        ListNode more = new ListNode(0);
        ListNode lessNode = less;
        ListNode moreNode = more;

        while (head != null) {
            if (head.val < x) {
                lessNode.next = head;
                lessNode = lessNode.next;
            } else {
                moreNode.next = head;
                moreNode = moreNode.next;
            }

            head = head.next;

        }
        lessNode.next = more.next;
        moreNode.next = null;
        return less.next;
    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
