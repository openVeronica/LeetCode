package com.company;


import java.util.List;
import java.util.Stack;

public class Solution {
    public ListNode reverseBetween(ListNode head, int m, int n){
        int i = 1;
        ListNode dummyHead = new ListNode(0);
        dummyHead.next = head;
        ListNode start =dummyHead;
        ListNode prev = null;
        ListNode p = dummyHead;
        ListNode latter = p.next;
        while (i <= n && latter != null){
            if (i < m){
                start = start.next;
            }
            if (i >= m){
                prev = p;
                p = latter;
                latter = latter.next;
                p.next = prev;
            } else {
                p = p.next;
                latter = latter.next;
            }
            i++;
        }
        start.next.next = latter;
        start.next = p;
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
