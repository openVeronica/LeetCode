package com.company;

public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB){
        if (headA == null || headB == null){
            return null;
        }
        ListNode p = headA;
        ListNode q = headB;
        ListNode tailA = null,tailB=null;
        while(true){
            if (p == null){
                p = headB;
            }
            if (q == null){
                q = headA;
            }
            if (p.next == null){
                tailA = p;
            }
            if (q.next == null){
                tailB = q;
            }
            if (tailA != tailB && tailA != null && tailB != null){
                return null;
            }
            if (p == q){
                return p;
            }
            p = p.next;
            q = q.next;
        }
    }

    public int getListLength(ListNode L){
        int l = 0;
        if (L == null){
            return 0;
        }
        while(L != null){
            l++;
            L = L.next;
        }
        return l;
    }
    public ListNode[] generateList(){
        ListNode headA = new ListNode(1);
        ListNode headB = new ListNode(2);
        ListNode tail = new ListNode(3);
        headA.next = tail;
        headB = tail;
        ListNode[] twoLists = {headA,headB};
        return twoLists;
    }
}
