package com.company;

import java.util.*;

/** @author Veronica
 * @author https://github.com/openVeronica
 */

public class Solution {
    public int strStr(String haystack, String needle){
        boolean exist;
        if (needle.equals("")){
            return 0;
        }
        if (haystack.equals("")){
            return -1;
        }
        for (int i = 0; i< haystack.length(); i++){
            exist = true;
            if (needle.charAt(0) == haystack.charAt(i)){
                for (int j = 1; j< needle.length(); j++){
                    if (i+j >= haystack.length() ||needle.charAt(j) != haystack.charAt(i + j)){
                        exist = false;
                        break;
                    }
                }
                if (exist == true){
                    return i;
                }
            }
        }
        return -1;
    }
}
