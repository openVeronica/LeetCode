package com.company;

import java.util.*;

/** @author Veronica
 * @author https://github.com/openVeronica
 */

//dynamic programming
public class Solution {
    public ListNode swapPairs(ListNode head){
        ListNode dummyhead = new ListNode(0);
        ListNode p = dummyhead;
        ListNode q = p;
        p.next = head;
        while (p.next != null && p.next.next != null){
            q = p.next;
            p.next = q.next;
            q.next = p.next.next;
            p.next.next = q;
            p = p.next.next;

        }
        return dummyhead.next;
    }
}
