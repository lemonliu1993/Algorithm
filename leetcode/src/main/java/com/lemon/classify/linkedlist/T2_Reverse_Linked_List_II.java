package com.lemon.classify.linkedlist;

/**
 * Created by lemoon on 2020/10/3 6:05 PM
 * leetcode 92
 */
public class T2_Reverse_Linked_List_II {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        ListNode preHead;
        ListNode newHead = new ListNode(0);
        ListNode newTail;
        ListNode newNext;


        int len = n - m;
        ListNode node = head;
        while (m > 2) {
            node = node.next;
            m--;
        }

        preHead = node;
        newTail = node.next;

        if (m == 1) {
            newTail = head;
        }
        node = newTail;


        while (len >= 0) {
            ListNode tempNode = node.next;
            node.next = newHead.next;
            newHead.next = node;
            node = tempNode;
            len--;
        }

        newNext = node;

        if (m != 1) {
            preHead.next = newHead.next;
        } else {
            head = newHead.next;
        }
        newTail.next = newNext;

        return head;
    }


    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        ListNode node = new T2_Reverse_Linked_List_II().reverseBetween(node1, 1, 4);
        while (node != null) {
            System.out.println(node.val);
            node = node.next;
        }
    }
}
