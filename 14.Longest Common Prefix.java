package com.company;

import java.util.*;

/** @author Veronica
 * @author https://github.com/openVeronica
 */

public class Solution {
    public String longestCommonPrefix(String[] strs){
        if (strs.length == 0){
            return "";
        }
        String pre = strs[0];
        for (int i = 1; i < strs.length; i++){
            if (pre.equals("")){
                return "";
            }
            for (int j = 0; j < pre.length(); j++){
                if (strs[i].length() <= j || pre.charAt(j) != strs[i].charAt(j)){
                    pre = pre.substring(0,j);
                    break;
                }
            }
        }
        return pre;
    }
}
