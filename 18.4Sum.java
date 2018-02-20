package com.company;

import java.util.*;

/** @author Veronica
 * @author https://github.com/openVeronica
 */

//注意closest和等于的差别
public class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target){
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        int jstart;
        int jend;
        for (int i = 0; i< nums.length-3; i++){
            if (i==0 || nums[i]!= nums[i-1]){
                for (int j = i+1; j < nums.length - 2;j++){
                    if (j == i+1 || nums[j] != nums[j-1]){
                        int twoSum = target - nums[j] -nums[i];
                        jstart = j+1;
                        jend = nums.length -1;
                        while (jstart < jend){
                            if (nums[jstart] + nums[jend] == twoSum){
                                ans.add(Arrays.asList(nums[i],nums[j],nums[jstart],nums[jend]));
                                while (jstart<jend && nums[jstart] == nums[jstart + 1]) jstart++;
                                while (jstart<jend && nums[jend] == nums[jend - 1]) jend--;
                                jstart++;
                                jend--;
                            }else if(nums[jstart] + nums[jend] < twoSum){
                                jstart++;
                            }else jend--;
                        }
                    }
                }
            }
        }
        return ans;
    }
}
