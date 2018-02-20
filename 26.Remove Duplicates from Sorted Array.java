package com.company;

import java.util.*;

/** @author Veronica
 * @author https://github.com/openVeronica
 */


public class Solution {
    public int removeDuplicates(int[] nums){
        int mvLen = 0;
        int num = 0;
        for (int i = 0; i< nums.length; i++){
            if (i == 0){
                num = nums[0];
                continue;
            }
            if (num == nums[i]){
                mvLen ++;
                continue;
            }else {
                nums[i-mvLen] = nums[i];
                num = nums[i];
            }
        }
        return nums.length-mvLen;
    }
}
