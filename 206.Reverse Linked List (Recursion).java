package com.company;



public class Solution {
    public ListNode reverseList(ListNode head){
        if (head == null || head.next == null){
            return head;
        }
        ListNode p = reverseList(head.next);
        head.next.next = head;//slightly trickier
        head.next = null;
        return p;
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
