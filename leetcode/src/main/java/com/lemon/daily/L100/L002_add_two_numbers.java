package com.lemon.daily.L100;

/**
 * Created by lemoon on 2020/10/2 3:39 PM
 */
public class L002_add_two_numbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        int isOver = 0;
        ListNode node = result;

        while (l1 != null || l2 != null || isOver != 0) {
            int val1 = 0, val2 = 0;
            if (l1 != null) {
                val1 = l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                val2 = l2.val;
                l2 = l2.next;
            }
            int sum = val1 + val2 + isOver;
            node.next = new ListNode(sum % 10);
            isOver = sum / 10;
            node = node.next;
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
