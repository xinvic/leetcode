package com.practice.leetcode.top;


import com.practice.leetcode.top.entity.ListNode;

public class CombineSortList {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        ListNode node = new ListNode(1);
        ListNode h = node;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                node.next = l1;
                node = node.next;
                l1 = l1.next;

            } else {
                node.next = l2;
                node = node.next;
                l2 = l2.next;
            }
        }
        if (l1 != null) node.next = l1;
        if (l2 != null) node.next = l2;

        return h.next;
    }
}


