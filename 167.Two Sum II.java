package com.company;

import java.util.Stack;

public class Solution {
    //时间复杂度 O(n),在两端设置两个指针，如果两个指针处数组元素值和为target，就返回两个指针的位置，如果小于target
    //左指针右移一个，如果大于target，右指针左移一个。依此类推直至两个指针相遇为止。
    public int[] twoSum(int[] numbers, int target){
        int[] index = new int[2];
        int x = 1;
        int y = numbers.length;
        while (x < y){
            if (numbers[x-1] + numbers[y-1] == target){
                index[0] = x;
                index[1] = y;
                break;
            }
            if (numbers[x-1] + numbers[y-1] < target){
                x += 1;
            }
            if (numbers[x-1] + numbers[y-1] > target){
                y -= 1;
            }
        }
        return index;
    }
}
