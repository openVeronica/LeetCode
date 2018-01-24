package com.company;

import java.util.*;

/** @author Veronica
 * @author https://github.com/openVeronica
 */

//字符串问题等，凡是涉及到索引的，都要考虑是不是超出索引范围
public class Solution {
    public String countAndSay(int n){
        String preStr = "1";
        String str = "";
        for (int i = 1; i< n; i++){
            String tmp = "";
            int count = 0;
            for (int j = 0; j< preStr.length(); j++){
                if (!String.valueOf(preStr.charAt(j)).equals(tmp)){
                    if (count != 0){
                        str += Integer.toString(count) + tmp;
                    }
                    tmp = String.valueOf(preStr.charAt(j));
                    count = 1;
                }else {
                    count++;
                }
                if (j == preStr.length()-1){
                    str += Integer.toString(count) + tmp;
                }
            }
            preStr = str;
            str = "";
        }
        return preStr;
    }
}
