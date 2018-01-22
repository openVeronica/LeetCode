package com.company;

import java.util.*;

/** @author Veronica
 * @author https://github.com/openVeronica
 */

public class Solution {
    public int romanToInt(String s){
        Character[] romanChar = {'I','V','X','L','C','D','M'};
        Integer[] romanNum = {1,5,10,50,100,500,1000};
        HashMap<Character, Integer> r = new HashMap<Character, Integer>();
        for (int i = 0; i < romanChar.length; i++){
            r.put(romanChar[i],romanNum[i]);
        }
        int currNum = 0;
        int number = 0;
        int latterNum = 0;
        for (int i = 0; i < s.length(); i++){
            currNum = r.get(s.charAt(i));
            if (i+1 < s.length()){
                latterNum = r.get(s.charAt(i + 1));
            }else {
                latterNum = 0;
            }
            if (currNum < latterNum){
                number += latterNum - currNum;
                i++;
            }else {
                number += currNum;
            }
        }
        return number;
    }
}
