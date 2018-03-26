package com.company;

import org.omg.CORBA.INITIALIZE;

import java.util.*;

/** @author Veronica
 * @author https://github.com/openVeronica
 */

public class Solution {
    /*
    public int numTrees(int n){
        return backTrack(n);
    }
    public int backTrack(int n){
        if (n == 1 || n==0) return 1;
        if (n == 2) return 2;
        int num = 0;
        for (int i = 1; i <= n/2; i++){
            num += backTrack(n-i)*backTrack(i-1);
        }
        if (n%2 == 0) return num*2;
        else return num*2 + backTrack(n-(n/2+1))*backTrack(n/2);
    }
    */
    //动态规划很重要的一点就是将前面的结果记录下来 是一种以空间换时间的策略
    public int numTrees(int n){
        int[] dp = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;
        for (int level = 2; level < n+1; level++){
            for (int root = 1; root < level+1; root++){
                dp[level] += dp[level-root]*dp[root-1];
            }
        }
        return dp[n];
    }
}
