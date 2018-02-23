package com.company;

import org.omg.CORBA.INITIALIZE;

import java.util.*;

/** @author Veronica
 * @author https://github.com/openVeronica
 */

public class Solution {
    public String convert(String s, int numRow){
        List rows = new ArrayList<>();
        if (numRow == 1)return s;
        for (int i = 0; i< s.length(); i++){
            if (i < numRow){
                rows.add(s.substring(i,i+1));
                continue;
            }
            int n;
            if ( i%(2*numRow-2) == 0 || i/(numRow -1)%2 == 0){
                n = i%(numRow-1);
            }else {
                n = numRow - i%(numRow-1) - 1;
            }
            String tmp = (String)rows.get(n);
            tmp += s.substring(i,i+1);
            rows.set(n, tmp);
        }
        String res = "";
        for (Object part : rows){
            res += (String) part;
        }
        return res;
    }
}
