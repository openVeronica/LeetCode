package com.company;

import java.util.*;

/** @author Veronica
 * @author https://github.com/openVeronica
 */

//注意closest和等于的差别
public class Solution {
    public int threeSumClosest(int[] nums,int target){
        Arrays.sort(nums);
        int sum = nums[0]+nums[1]+nums[2];
        int distance = Math.abs(target - nums[0]-nums[1]-nums[2]);
        for (int i = 0; i< nums.length-2; i++){
            int istart = i+1;
            int iend = nums.length -1;
            int tmpTarget = target - nums[i];
            while (istart < iend){
                int tmpDis = Math.abs(tmpTarget - nums[istart] - nums[iend]);
                if (tmpDis < distance){
                    sum = nums[i] + nums[istart] + nums[iend];
                    distance = tmpDis;
                }
                if (nums[istart] + nums[iend] > tmpTarget){
                    iend--;
                }else if (nums[istart] + nums[iend] < tmpTarget){
                    istart++;
                }else {
                    return sum;
                }
            }
        }
        return sum;
    }
}
