package com.company;

import java.util.*;

/** @author Veronica
 * @author https://github.com/openVeronica
 */

//dynamic programming
public class Solution {
    public int climbStairs(int n){
        if (n == 1){ return 1;}
        int[] way = new int[n+1];
        //way[0] = 0;冗余
        way[1] = 1;
        way[2] = 2;
        for (int i = 3; i < n+1; i++){
            way[i] = way[i-1] + way[i-2];
        }
        return way[n];
    }
}
