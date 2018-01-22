package com.company;

import java.util.ArrayList;
import java.util.Stack;

public class Solution {
    public boolean findTarget(TreeNode root, int k){
        ArrayList<Integer> arr = midOrder(root);
        int size = arr.size();
        int i = 0;
        int j = size - 1;
        while (i<j){
            if (arr.get(i) + arr.get(j) == k){
                return true;
            }
            if (arr.get(i) + arr.get(j) < k){
                i++;
            }
            if (arr.get(i) + arr.get(j) > k){
                j--;
            }
        }
        return false;
    }
    //中序遍历非递归写法
    public ArrayList midOrder(TreeNode root){
        Stack<TreeNode> s = new Stack<TreeNode>();
        TreeNode p = root;
        int i = 0;
        ArrayList<Integer> a = new ArrayList<Integer>();
        while (p != null || !s.empty()){
            while (p != null){
                s.push(p);
                p = p.left;
            }
            if (!s.empty()){
                p = s.pop();
                a.add(p.val);
                p = p.right;
            }
        }
        return a;
    }
}
