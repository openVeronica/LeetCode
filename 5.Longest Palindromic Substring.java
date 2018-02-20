package com.company;

import java.util.*;

/** @author Veronica
 * @author https://github.com/openVeronica
 */

//dynamic programming
public class Solution {
    private int low, maxLen;
    public String longestPalindrome(String s){
        //String tmp;
        if (s.length() == 1) return s;
        for (int i = 0; i< s.length() -1; i++){
            extendPalindorme(s, i, i);
            /*
            if (s.charAt(i) == s.charAt(i+1)){
                extendPalindorme(s, i ,i+1);
            }
            */
            extendPalindorme(s, i ,i+1);
        }
        return s.substring(low, maxLen+low);
    }
    public void extendPalindorme(String s, int left, int right){
        while (left >=0 && right < s.length() && s.charAt(left) == s.charAt(right)){
            left--;
            right++;
        }
        if (right - left -1 > maxLen){
            low = left + 1;
            maxLen = right-left-1;
        }
    }
}
