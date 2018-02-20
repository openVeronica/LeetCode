package com.company;

import java.util.*;

/** @author Veronica
 * @author https://github.com/openVeronica
 */

//注意closest和等于的差别
public class Solution {
    public boolean isPalindrome(int x){
        if (x < 0){
            return false;
        }
        int len = 0;
        while (x/(int)Math.pow(10,len) != 0){
            len++;
            if (len == 10)break;
        }
        int halfx = x/(int)Math.pow(10, len-len/2);
        if (reverseNum(halfx) == x%(int) (Math.pow(10,len/2))){
            return true;
        }
        return false;
    }
    public int reverseNum(int num){
        int rev = 0;
        while (num != 0){
            rev = rev*10 + num%10;
            num = num/10;
        }
        return rev;
    }
}
