package com.company;

import java.util.Stack;

public class Solution {
    public int[] twoSum(int[] nums, int target){
        int[] no = new int[2];//数组初始化为[0,0]
        for (int i = 0; i < nums.length; i++){
            for (int j = i+1; j< nums.length; j++){
                if (nums[i] + nums[j] == target){
                    no[0] = i;//数组元素操作
                    no[1] = j;
                    break;
                }
            }
        }
        return no;
    }
}
