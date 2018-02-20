package com.company;

import java.util.*;

/** @author Veronica
 * @author https://github.com/openVeronica
 */

//dynamic programming
public class Solution {
    public int maxSubArray(int[] nums){
        int sum = nums[0];
        int[] mid = new int[nums.length];
        mid[0] = nums[0];
        for (int i = 1; i< nums.length; i++){
            if (mid[i-1] < 0) mid[i] = nums[i];
            else {
                mid[i] = mid[i-1] + nums[i];
            }
            sum = Math.max(sum,mid[i]);
        }
        return sum;
    }
}
