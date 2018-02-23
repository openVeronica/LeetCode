package com.company;

import org.omg.CORBA.INITIALIZE;

import java.util.*;

/** @author Veronica
 * @author https://github.com/openVeronica
 */

public class Solution {
    List<List<Integer>> res = new ArrayList<List<Integer>>();
    int remv = 0;
    public List<List<Integer>> combinationSum2(int[] candidates, int target){
        Arrays.sort(candidates);
        List<Integer> list = new ArrayList<Integer>();
        combinationSum(candidates, list, 0, target);
        return res;
    }
    public void combinationSum(int[] candidates,List<Integer> list, int start, int target){
        if (target == 0){
            res.add(new ArrayList<Integer>(list));
        }
        for (int i = start; i< candidates.length; i++){
            if (remv == candidates[i]) continue;
            //List<Integer> list = new ArrayList<Integer>();
            if (candidates[i] > target) return;
            if (target > 0) {
                list.add(candidates[i]);
                combinationSum(candidates, list, i+1, target-candidates[i]);
                remv = list.remove(list.size()-1);
            }
        }
    }
}
