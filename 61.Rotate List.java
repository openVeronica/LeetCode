package com.company;

import java.util.*;

/** @author Veronica
 * @author https://github.com/openVeronica
 */

public class Solution {
    public ListNode rotateRight(ListNode head, int k){
        if (k == 0 || head == null){
            return head;
        }
        ListNode dummyHead = new ListNode(0);
        dummyHead.next = head;
        ListNode prev = dummyHead;
        ListNode p = head;
        ListNode q = p;
        for (int i = 0; i< k-1; i++){
            q = q.next;
            if (q == null){
                if (k%(i+1) == 0){
                    k = i+1;
                }else {
                    k = k%(i+1);
                }
                q = head;
                i = -1;
            }
        }
        while (q.next != null){
            prev = prev.next;
            p = p.next;
            q = q.next;
        }
        if (p == head){
            return head;
        }
        prev.next = null;
        dummyHead.next = p;
        q.next = head;
        return dummyHead.next;
    }
    public ListNode generateList(int[] list) {
        ListNode head = new ListNode(list[0]);
        ListNode p = head;
        for (int i = 1; i< list.length; i++){
            p.next = new ListNode(list[i]);
            p = p.next;
        }
        p.next = null;
        return head;
    }
}
