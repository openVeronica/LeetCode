package com.company;
import java.util.*;

/** @author Veronica
 * @author https://github.com/openVeronica
 */

public class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        backTrack(nums, new ArrayList<>(), ans, new boolean[nums.length]);
        return ans;
    }
    public void backTrack(int[] nums, List<Integer> list, List<List<Integer>> ans, boolean[] used) {
        if (list.size() == nums.length)
            ans.add(new ArrayList<>(list));
        for (int i = 0; i < nums.length; i++){
            if (used[i] == true)
                continue;
            //deduplicate
            if (i > 0 && used[i-1] == false && nums[i] == nums[i-1])
                continue;
            list.add(nums[i]);
            used[i] = true;
            backTrack(nums, list, ans, used);
            used[i] = false;
            list.remove(list.size() - 1);
        }
    }
}