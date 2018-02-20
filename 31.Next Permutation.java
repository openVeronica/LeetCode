package com.company;

import java.util.*;

/** @author Veronica
 * @author https://github.com/openVeronica
 */

//与solution方法一样， 就是代码不够美观， 逻辑不够清楚
public class Solution {
    public void nextPermutation(int[] nums){
        int i = nums.length -1;
        for (; i>=1; i--){
            if (nums[i] > nums[i-1]){
                int tmp = nums[i-1];
                int next = nums[i];
                int j = i;
                while (j>= i && j< nums.length){
                    if (nums[j] < next && nums[j]>tmp) next = nums[j];
                    j++;
                }
                nums[i-1] = next;
                int[] part = new int[nums.length-i];
                for (j = 0; j <= nums.length -i-1; j++){
                    part[j] = nums[j+i];
                }
                j = part.length-1;
                int flag = 1;
                for (int k = i; k<= nums.length -1; k++){
                    if (part[j] == next && flag == 1){
                        nums[k] = tmp;
                        flag--;
                    }else {
                        nums[k] = part[j];
                    }
                    j--;
                }
                break;
            }
        }
        if (i==0){
            Arrays.sort(nums);
        }
    }
}
