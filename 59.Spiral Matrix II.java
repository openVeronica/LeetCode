package com.company;

import org.omg.CORBA.INITIALIZE;

import java.util.*;

/** @author Veronica
 * @author https://github.com/openVeronica
 */

public class Solution {
    public int[][] generateMatrix(int n){
        int row0 = 0;
        int row1 = n-1;
        int column0 = 0;
        int column1 = n-1;
        int num = 1;
        int l = n;
        int[][] matrix = new int[n][n];
        while (num <= Math.pow(n,2)){
            for (int j = column0; j < l + column0; j++){
                matrix[row0][j] = num++;
            };
            for (int j = row0+1; j< row0 + l; j++){
                matrix[j][column1] = num++;
            }
            for (int j = column1 - 1; j >= column0; j--){
                matrix[row1][j] = num++;
            }
            for (int j = row1 -1 ; j > row0; j-- ){
                matrix[j][column0] = num++;
            }
            row0++;
            row1--;
            column0++;
            column1--;
            l -= 2;
        }
        return matrix;
    }
}
