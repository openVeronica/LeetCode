package com.company;
import java.util.*;

/** @author Veronica
 * @author https://github.com/openVeronica
 */

public class Solution {
    public String fractionToDecimal(int numerator, int denominator) {
        if (numerator == 0) return "0";
        HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
        String res = "";
        String tmp = "";
        int count = 0;
        long x;
        long nume = numerator;
        long denomi = denominator;
        if (numerator/denomi < -1 || numerator/denomi > 1 ){
            x = numerator/denomi;
            res += String.valueOf(x);
            if (nume%denomi == 0) {
                return res;
            }
            else {
                res += ".";
                nume = numerator%denomi;
            }
        }else {
            if ((float)numerator/denomi < 0) res += "-";
            res += "0.";
        }
        while (nume/denomi < 1 || nume/denomi >-1) {
            if (hashMap.containsKey((int)nume)){
                int pos = hashMap.get((int)nume);
                int index = res.indexOf(".");
                for (int i = 0; i <= pos; i++){
                    index ++;
                }
                res = res.substring(0, index) + "(" + res.substring(index)+ ")";
                break;
            }else {
                hashMap.put((int) nume, count);
            }
            nume = 10*nume;
            if (nume/denomi >= 1 || nume/denomi <= -1){
                x = nume/denomi;
                String str_x;
                if (x < 0){
                    str_x = String.valueOf((-1)*x);
                }else {
                    str_x = String.valueOf(x);
                }
                res += str_x;
                nume = nume%denomi;
            }else {
                res += "0";
            }
            if (nume == 0) {
                return res;
            }
            count++;
        }
        return res;
    }
}