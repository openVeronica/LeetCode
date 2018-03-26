package com.company;
import java.util.*;

/** @author Veronica
 * @author https://github.com/openVeronica
 */

public class Solution {
    public void rotate(int[][] matrix){
        List<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
        ArrayList arr = new ArrayList();
        for (int i = 0; i < matrix.length; i++){
            arr.clear();
            for (int j= i+1; j < matrix.length; j++){
                arr.add(matrix[i][j]);
            }
            list.add(new ArrayList<Integer>(arr));
            for (int k = 0; k < i+1; k++){
                matrix[k][matrix.length-i-1] = matrix[i][k];
            }
        }
        int blank = 1;
        for (int i = 0; i < list.size(); i++){
            for (int j = 0; j < list.get(i).size(); j++){
                matrix[j+blank][matrix.length-1-i] = list.get(i).get(j);
            }
            blank ++;
        }
    }
}