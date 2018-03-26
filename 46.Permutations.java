package com.company;
import java.util.*;

/** @author Veronica
 * @author https://github.com/openVeronica
 */

public class Solution {
    public List<List<Integer>> permute(int[] nums){
        if (nums.length == 0) return null;
        List<List<Integer>> res = backTrack(nums);
        return res;
    }
    public ArrayList backTrack(int[] nums){
        ArrayList<ArrayList<Integer>> numList = new ArrayList<ArrayList<Integer>>();
        if (nums.length == 0) numList.add(null);
        for (int i = 0; i < nums.length; i++) {
            int[] num = new int[nums.length - 1];
            int k = 0;
            for (int n : nums){
                if (n != nums[i]){
                    num[k++] = n;
                }
            }

            ArrayList<ArrayList<Integer>> list = backTrack(num);
            for (ArrayList li : list){
                ArrayList<Integer> inner = new ArrayList<Integer>();
                inner.add(nums[i]);
                if (li != null) inner.addAll(li);
                numList.add(inner);
            }
        }
        return numList;
    }
}