package com.company;

import java.util.*;

/** @author Veronica
 * @author https://github.com/openVeronica
 */

public class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target){
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        List<Integer> list = new ArrayList<Integer>();
        backTrack(res, list, candidates, target, 0);
        return res;
    }
    public void backTrack(List<List<Integer>> res, List<Integer> list, int[] candidates, int target, int start){
        for (int i = start; i < candidates.length; i++){
            if (target < 0)return;
            else {
                if (target == 0){
                    //res.add(list); 错误❌不可以直接写list 当后面list变化之后，res中的list也会随之变化
                    res.add(new ArrayList<Integer>(list));
                    return;
                }else{
                    list.add(candidates[i]);
                    backTrack(res, list, candidates, target - candidates[i], i);
                    list.remove(list.size() -1);
                }
            }
        }
    }
}
