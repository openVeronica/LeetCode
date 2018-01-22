package com.company;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/** @author Veronica
 * @author https://github.com/openVeronica
 */

//sliding window : wildly used in array/string problems
public class Solution {
    public int lengthOfLongestSubstring(String s){
        Set<Character> set = new HashSet<Character>();
        int len = 0;
        int i = 0;
        int j = 0;
        int n = s.length();
        while (i < n && j < n){
            char x = s.charAt(j);
            if (!set.contains(x)){
                j++;
                set.add(x);
                len = Math.max(len, j-i);
            }else {
                set.remove(s.charAt(i++));
            }
        }
        return len;
    }
}
