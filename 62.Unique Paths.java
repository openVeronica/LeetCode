package com.company;

import java.util.*;

/** @author Veronica
 * @author https://github.com/openVeronica
 */

//dynamic programming
public class Solution {
    public int uniquePaths(int m, int n){
        int[][] dp = new int[m+1][n+1];
        for (int i = 1; i< m+1; i++){
            for (int j = 1; j < n+1; j++){
                dp[i][j] = dp[i-1][j] + dp[i][j-1];
                if (i == 1 && j==1){
                    dp[i][j] = 1;
                }
            }
        }
        return dp[m][n];
    }
}
