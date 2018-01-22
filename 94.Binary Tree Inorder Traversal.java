package com.company;

import java.util.*;

/** @author Veronica
 * @author https://github.com/openVeronica
 */

public class Solution {
    /*Recursive solution
    public List<Integer> inorderTraversal(TreeNode root){
        List<Integer> tree = new ArrayList<Integer>();
        if (root != null){
            tree.addAll(inorderTraversal(root.left));
            tree.add(root.val);
            tree.addAll(inorderTraversal(root.right));
        }
        return tree;
    }
    */
    //Iterative solution
    public List<Integer> inorderTraversal(TreeNode root){
        List<Integer> tree = new ArrayList<Integer>();
        Stack<TreeNode> s = new Stack<TreeNode>();
        TreeNode p = root;
        while (p != null || !s.isEmpty()){
            if (p == null){
                p = s.pop();
                tree.add(p.val);
                p = p.right;
            }else {
                s.push(p);
                p = p.left;
            }
        }
        return tree;
    }
}
