package com.company;

import java.util.Stack;

public class Solution {

    public ListNode mergeTwoLists(ListNode L1,ListNode L2){
        if (L1 == null){
            return L2;
        }
        if (L2 == null){
            return L1;
        }
        ListNode dummyNode,curr;
        dummyNode = new ListNode(1);
        curr = dummyNode;
        while (L1 != null && L2 != null){
            if (L1.val <= L2.val){
                curr.next = L1;
                L1 = L1.next;
            }else {
                curr.next = L2;
                L2 = L2.next;
            }
            curr = curr.next;
        }
        curr.next = (L1 == null)? L2 : L1;
        return dummyNode.next;
    }

    public ListNode linkedList(int[] list){
        ListNode head = new ListNode(list[0]);
        ListNode p = head;
        for (int i = 1; i < list.length; i++){
            ListNode x = new ListNode(list[i]);
            p.next = x;
            p = p.next;
        }
        return head;
    }
}
