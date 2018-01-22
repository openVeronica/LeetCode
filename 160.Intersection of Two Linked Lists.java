package com.company;

public class Solution {
    /*
    1.得到链表的长度
    2.将长链表的头部向后移动差值（后端对齐，得到的是两个相同长度的链表）
    3.两个指针一起向后移动，遇到相同的即是交点，没找到则返回null
     */
    public ListNode getIntersectionNode(ListNode headA, ListNode headB){
        int l1 = getListLength(headA);
        int l2 = getListLength(headB);
        int l;
        ListNode headL, headS;
        if (l1 > l2) {
            l = l1 - l2;
            headL = headA;
            headS = headB;
        }else {
            l = l2 - l1;
            headL = headB;
            headS = headA;
        }

        for (int i = 0; i < l; i++){
            headL = headL.next;
        }
        if (headL == null){
            return null;
        }
        while (headL != null){
            if(headL == headS){
                return headL;
            }
            headL = headL.next;
            headS = headS.next;
        }
        return null;
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
}
