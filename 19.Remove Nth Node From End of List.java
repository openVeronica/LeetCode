package com.company;


import java.util.List;
import java.util.Stack;

public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n){
        if (head == null){
            return head;
        }
        ListNode dummyHead = new ListNode(0);
        dummyHead.next = head;
        ListNode pre = dummyHead;
        ListNode p = head;
        ListNode q = p;
        for (int i = 0; i < n; i++){
            q = q.next;
        }
        while (q != null){
            pre = p;
            p = p.next;
            q = q.next;
        }
        pre.next = p.next;
        return dummyHead.next;
    }

    public ListNode generateList(int[] list){
        ListNode head = new ListNode(list[0]);
        ListNode p = head;
        for (int i = 1; i < list.length; i++){
            p.next = new ListNode(list[i]);
            p = p.next;
        }
        return head;
    }
}
