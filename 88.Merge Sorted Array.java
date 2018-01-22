package com.company;

import java.util.Stack;

public class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n){
        //这种方法时间复杂度大了些，有更巧妙的办法：https://siddontang.gitbooks.io/leetcode-solution/content/array/merge_sorted_array.html
        for (int i = 0; i < n; i++){
            if(m == 0){
                nums1[i] = nums2[i];
                continue;
            }
            if (nums2[i] >= nums1[m-1]){
                nums1[m] = nums2[i];
                m += 1;
            }else{
                for (int j = 0; j < m; j++){
                    if (nums2[i] < nums1[j]){
                        for (int k = m-1; k >= j; k-- ){
                            nums1[k+1] = nums1[k];
                        }
                        m += 1;
                        nums1[j] = nums2[i];
                        break;
                    }
                }
            }
        }
    }
}
