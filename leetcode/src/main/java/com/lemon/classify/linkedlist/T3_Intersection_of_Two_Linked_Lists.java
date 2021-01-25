package com.lemon.classify.linkedlist;

/**
 * Created by lemoon on 2020/10/3 6:05 PM
 * leetcode 160
 */
public class T3_Intersection_of_Two_Linked_Lists {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lenA = 0, lenB = 0;
        ListNode node = headA;
        while (node != null) {
            node = node.next;
            lenA++;
        }
        node = headB;
        while (node != null) {
            node = node.next;
            lenB++;
        }
        int difference = 0;
        if (lenA > lenB) {
            difference = lenA - lenB;
            while (difference > 0) {
                headA = headA.next;
                difference--;
            }
        } else if (lenA < lenB) {
            difference = lenB - lenA;
            while (difference > 0) {
                headB = headB.next;
                difference--;
            }
        }

        while (headA != null) {
            if (headA != headB) {
                headA = headA.next;
                headB = headB.next;
            } else {
                break;
            }
        }
        return headA;
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
