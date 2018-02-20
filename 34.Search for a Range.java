package com.company;

import java.util.*;

/** @author Veronica
 * @author https://github.com/openVeronica
 */

public class Solution {
    public int[] searchRange(int[] nums, int target){
        int[] index = search(nums, target, 0, nums.length-1);
        return index;
    }
    public int[] search(int[] nums, int target,int start, int end){
        int[] index = {-1,-1};
        int mid = (end-start)/2 + start;
        if (mid < start || mid > end){return index;}
        if (nums[mid] == target){
            int first= mid;
            int last = mid;
            while (first>=0 && nums[first] == target) {
                index[0] = first;
                first--;
            }
            while (last<=end && nums[last] == target) {
                index[1] = last;
                last++;
            }
        }else if (nums[mid] > target){
            return search(nums,target,start,mid-1);
        }else {
            return search(nums,target,mid+1,end);
        }
        return index;
    }
}
