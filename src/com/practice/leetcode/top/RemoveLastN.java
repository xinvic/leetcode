package com.practice.leetcode.top;


import com.practice.leetcode.top.entity.ListNode;

public class RemoveLastN {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null ||(head.next==null && n==1))
            return null;

        ListNode node = new ListNode(1);
        ListNode h1 = node;
        h1.next = head;
        ListNode h2=h1;

        for (int i = 0; i < n; i++) {
            h2 = h2.next;
        }
        while (h2.next!=null){
            h2=h2.next;
            h1=h1.next;
        }
        h1.next=h1.next.next;
        return node.next;
    }
}

