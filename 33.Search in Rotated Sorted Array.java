package com.company;

import java.util.*;

/** @author Veronica
 * @author https://github.com/openVeronica
 */

public class Solution {
    public int search(int[] nums, int target){
        if (nums.length == 0){
            return -1;
        }
        int last = nums[nums.length-1];
        if (target == last) return nums.length-1;
        if (target > last){
            int i = 0;
            while (nums[i] > last){
                if (target == nums[i]) return i;
                i++;
            }
            return -1;
        }else {
            int i = nums.length -1;
            while (i >=0 && nums[i] <= last){
                if (target == nums[i]) return i;
                i--;
            }
            return -1;
        }
    }
}
