package com.company;



public class Solution {
    public ListNode removeElements(ListNode head, int val){
        ListNode dummyhead = new ListNode(0);
        ListNode p,pre;
        dummyhead.next = head;
        pre = dummyhead;
        p = head;
        while (p != null){
            if (p.val == val){
                pre.next = p.next;
            }else {
                pre = pre.next;
            }
            p = p.next;
        }
        return dummyhead.next;
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
