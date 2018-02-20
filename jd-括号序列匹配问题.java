package com.company;

import java.util.*;

/** @author Veronica
 * @author https://github.com/openVeronica
 */

public class Solution {
    public int removeParentheses(String s){
        if (s.equals("")){
            return 0;
        }
        if (s.equals("()")){
            return 1;
        }
        int methods = 0;
        s = s.substring(1);
        String newS;
        for (int i = 0; i< s.length(); i++){
            if (s.charAt(i) == ')'){
                if (i+1 >= s.length()){
                    newS = s.substring(0,i);
                }else if (i == 0){
                    newS = s.substring(1);
                }else {
                    newS = s.substring(0,i)+s.substring(i+1);
                }
                if (isValid(newS)){
                    methods += removeParentheses(newS);
                }
            }
        }
        return methods;
    }
    public boolean isValid(String s){
        int left = 0;
        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) == '('){
                left++;
            }else {
                left--;
            }
            if (left < 0){
                return false;
            }
        }
        if (left > 0){
            return false;
        }else {
            return true;
        }
    }
}
