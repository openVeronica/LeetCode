package com.company;

import java.util.*;

/** @author Veronica
 * @author https://github.com/openVeronica
 */

public class Solution {
    public boolean isToeplitzMatrix(int[][] matrix){
        int j;
        for (int i = 0; i < matrix.length; i++){
            j = 0;
            int num = matrix[i][0];
            int k = i;
            while (j < matrix[0].length && k < matrix.length){
                if (matrix[k++][j++] != num){
                    return false;
                }
            }
        }
        for (int i = 1; i < matrix[0].length; i++){
            j = 0;
            int num = matrix[0][i];
            int k = i;
            while (j < matrix.length && k < matrix[0].length){
                if (matrix[j++][k++] != num){
                    return false;
                }
            }
        }
        return true;
    }
}
