package com.company;

import java.util.*;

/** @author Veronica
 * @author https://github.com/openVeronica
 */

public class Solution {
    public List<String> generateParenthesis(int n){
        List<String> collection = new ArrayList<String>();
        char[] current = new char[2*n];
        generateAllSituation(current,0,collection);
        return collection;
    }
    public void generateAllSituation(char[] current,int pos, List<String> result){
        if (pos == current.length ){
            if(checkValid(current)) result.add(new String(current));
            return;
        }
        current[pos] = '(';
        generateAllSituation(current, pos+1,result);
        current[pos] = ')';
        generateAllSituation(current,pos+1,result);
    }
    public boolean checkValid(char[] current){
        int open = 0;
        for (int i = 0; i < current.length; i++){
            if (open < 0){
                return false;
            }
            if (current[i] == '(') {
                open++;
            }else {
                open--;
            }
        }
        if (open == 0){
            return true;
        }else {
            return false;
        }
    }
}
