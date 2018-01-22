package com.company;

import java.util.Stack;

public class Solution {
    public ListNode mergeTwoLists(ListNode L1,ListNode L2){
        ListNode head;
        ListNode s,b;
        if (L1 == null ){// in case of nullpointerExceptions
            return L2;
        }
        if (L2 == null) {// in case of nullpointerExceptions
            return L1;
        }
        if(L1.val <= L2.val){
            head = L1;
            s = L1;
            b = L2;
        }else {
            head = L2;
            s = L2;
            b = L1;
        }
        ListNode s_pre = s;
        //ListNode s_begin = s;
        ListNode b_pre = b;
        ListNode b_begin = b;
        while (s!=null && b!=null){
            while ( s!=null && b!=null && s.val <= b.val){ //head : p
                s_pre = s;
                s = s.next;
            }
            while (b!= null && s!=null && s.val > b.val){ //head : q
                b_pre = b;
                b = b.next;
            }
            s_pre.next = b_begin;
            s_pre = b_pre;
            b_begin = b;
            b_pre = b;
            if (s != null){
                s_pre.next = s;
            }
        }
        return head;

    }

    public ListNode linkedList(long num){
        ListNode head = new ListNode(Math.toIntExact(num % 10));
        ListNode p = head;
        int i = 1;
        while((long)Math.floor(num/Math.pow(10,i)) > 0){
            long digit = (long) Math.pow(10,i);
            ListNode q = new ListNode((int) (Math.floor(num/digit)%10));
            p.next = q;
            q.next = null;
            p = q;
            i++;
        }
        return head;
    }

}
