package com.company;


import java.util.List;
import java.util.Stack;

public class Solution {
    public ListNode reverseList(ListNode head){
        ListNode prev = null;
        ListNode p = head;
        while (p != null){
            head = p;
            p = p.next;
            head.next = prev;
            prev = head;
        }
        return head;
    }

    /* Stack Solution
    public ListNode reverseList(ListNode head){
        ListNode dummyHead = new ListNode(0);
        Stack<ListNode> s = new Stack<ListNode>();
        if (head == null){
            return null;
        }
        ListNode p = head;
        while (p != null){
            s.push(p);
            p = p.next;
        }
        p = dummyHead;
        while (!s.isEmpty()){
            p.next = s.pop();
            p = p.next;
            p.next = null;
        }
        return dummyHead.next;
    }
    */

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
