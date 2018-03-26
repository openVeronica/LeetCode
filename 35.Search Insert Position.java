package com.company;

import org.omg.CORBA.INITIALIZE;

import java.util.*;

/** @author Veronica
 * @author https://github.com/openVeronica
 */

public class Solution {
    public int searchInsert(int[] nums, int target){
        for (int i = 0; i < nums.length; i++){
            if (nums[i] >= target){
                return i;
            }
        }
        return nums.length;
    }
}
