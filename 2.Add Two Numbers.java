package com.company;


import java.util.List;
import java.util.Stack;

public class Solution {
    public ListNode addTwoNumbers(ListNode L1, ListNode L2){
        if (L1 == null){
            return L2;
        }
        if (L2 == null){
            return L1;
        }

        ListNode sum = new ListNode(0);
        ListNode p = L1;
        ListNode q = L2;
        ListNode x = sum;
        int a,b,c,num;
        c = 0;
        while (true){
            if (p == null){
                a = 0;
            }else {
                a = p.val;
                p = p.next;
            }
            if (q == null){
                b = 0;
            }else {
                b = q.val;
                q = q.next;
            }
            num = a + b + c;
            if (num >= 10){
                c = 1;
                num = num%10;
            }else {
                c = 0;
            }
            ListNode sumNode = new ListNode(num);
            x.next = sumNode;
            x = x.next;
            if (p == null && q == null && c == 0){
                return sum.next;
            }
        }
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
