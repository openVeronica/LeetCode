package com.company;

import org.omg.CORBA.INITIALIZE;

import java.util.*;

/** @author Veronica
 * @author https://github.com/openVeronica
 */

public class Solution {
    public boolean canJump(int[] nums){
        if (nums.length == 1)return true;
        int n = nums.length-2;
        while (n >= 0) {
            //from end to start, find 0
            while (n >= 0 && nums[n] != 0 ){
                n--;
            }
            if (n == -1){
                return true;
            }else if (n == 0){
                return false;
            }else {
                // when there is 0, check the elements before 0, see if it can reach the elements after 0
                int mini = 2;
                n--;
                while ( n >= 0 && nums[n] < mini){
                    n--;
                    mini++;
                }
                if (n == -1) return false;
            }
        }
        return true;
    }
}
