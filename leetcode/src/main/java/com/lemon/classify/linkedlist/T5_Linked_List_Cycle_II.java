package com.lemon.classify.linkedlist;

/**
 * Created by lemoon on 2021/1/27 11:12 PM
 * leetcode 142
 */
public class T5_Linked_List_Cycle_II {
    public ListNode detectCycle(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null) {
            fast = fast.next;
            if (fast != null) {
                fast = fast.next;
                slow = slow.next;
                if (fast == slow) {
                    slow = head;
                    while (fast != slow) {
                        fast = fast.next;
                        slow = slow.next;
                    }
                    return fast;
                }
            } else {
                return null;
            }
        }
        return null;
    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }
}
