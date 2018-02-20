package com.company;

import java.util.*;

/** @author Veronica
 * @author https://github.com/openVeronica
 */

//三数之和变两数之和再去重
public class Solution {
    public List<List<Integer>> threeSum(int[] nums){
        Arrays.sort(nums);
        List ans = new ArrayList();
        for (int i = 0; i< nums.length; i++){
            int j = i+1;
            int istart = j;
            int iend = nums.length-1;
            int twosum = 0-nums[i];
            if (i == 0 || nums[i] != nums[i-1]){
                while(istart < iend){
                    if (nums[istart] + nums[iend] == twosum){
                        ans.add(Arrays.asList(nums[istart],nums[iend],nums[i]));
                        while (istart< iend && nums[istart] == nums[istart+1])istart++;
                        while (istart< iend && nums[iend] == nums[iend - 1])iend--;
                        istart++;
                        iend--;
                    }else if (nums[istart] + nums[iend] > twosum){
                        iend--;
                    }else istart++;
                }
            }
        }
        return ans;
    }
}
