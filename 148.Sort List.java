package com.company;

import java.util.Stack;

public class Solution {

    //归并排序 时间复杂度O(nlogn)
    public ListNode sortList(ListNode head){
        ListNode middle = getMiddle(head);
        if (head == null || head.next == null){
            return head;
        }
        ListNode shalf = middle.next;
        middle.next = null;//这样不会导致后面全为空
        return merge(sortList(head),sortList(shalf));
    }

    //合并排好序的链表
    public ListNode merge(ListNode L1,ListNode L2){
        ListNode dummyHead,curr;
        dummyHead = new ListNode(1);
        curr = dummyHead;
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
        return dummyHead.next;
    }

    public ListNode getMiddle(ListNode head){
        if (head == null){
            return head;
        }
        ListNode slow,fast;
        slow = fast = head;
        while (fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
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
