package com.company;

import java.util.*;

/** @author Veronica
 * @author https://github.com/openVeronica
 */

public class Solution {
    public int removeElement(int[] nums, int val){
        int mvLen = 0;
        for (int i = 0; i< nums.length; i++){
            if (nums[i] == val){
                mvLen ++;
            }else {
                nums[i-mvLen] = nums[i];
            }
        }
        return nums.length - mvLen;
    }
}
