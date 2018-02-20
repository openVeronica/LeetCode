package com.company;

import java.util.*;

/** @author Veronica
 * @author https://github.com/openVeronica
 */

public class Solution {
    public boolean isPalindrome(ListNode head){
        if (head == null || head.next == null){
            return true;
        }
        ListNode mid = head;
        ListNode p = head;
        while (p.next != null && p.next.next != null){
            mid = mid.next;
            p = p.next.next;
        }
        ListNode prev = null;
        p = mid.next;
        while (p != null){
            mid = p;
            p = p.next;
            mid.next = prev;
            prev = mid;
        }
        while (mid != null){
            if (mid.val != head.val){
                return false;
            }
            mid = mid.next;
            head = head.next;
        }
        return true;
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
