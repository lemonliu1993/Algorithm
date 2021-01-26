package com.lemon.classify.linkedlist;

/**
 * Created by lemoon on 2021/1/26 11:16 PM
 * leetcode 141
 */
public class T4_Linked_List_Cycle {
    public boolean hasCycle(ListNode head) {
        if (head == null) {
            return false;
        }
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null) {
            fast = fast.next;
            if (fast != null) {
                fast = fast.next;
                slow = slow.next;
                if (fast == slow) {
                    return true;
                }
            } else {
                return false;
            }
        }
        return false;
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
