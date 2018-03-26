package com.company;

import org.omg.CORBA.INITIALIZE;
import org.omg.CORBA.NO_IMPLEMENT;

import java.util.*;

/** @author Veronica
 * @author https://github.com/openVeronica
 */

public class Solution {

    public List<TreeNode> generateTrees(int n){
        return backTrack(1,n);
    }
    public ArrayList<TreeNode> backTrack(int start, int end){
        ArrayList<TreeNode> list = new ArrayList<TreeNode>();
        if (start > end){
            list.add(null);//add(null)是添加null元素，使列表不为空
            return list;
        }
        if (start == end){
            //TreeNode t = new TreeNode(start);
            list.add(new TreeNode(start));
            return list;
        }
        for (int root = start; root <= end; root++){
            ArrayList<TreeNode> left = backTrack(start, root - 1);
            ArrayList<TreeNode> right = backTrack(root + 1, end);
            /*
            if (left.size() == 0){
                for (TreeNode r : right){
                    TreeNode rootNode = new TreeNode(root);
                    rootNode.right = r;
                    tmp.add(rootNode);
                }
            }
            if (right.size() == 0){
                for (TreeNode l : left){
                    TreeNode rootNode = new TreeNode(root);
                    rootNode.left = l;
                    tmp.add(rootNode);
                }
            }
            */
            for (TreeNode l : left){
                for (TreeNode r : right){
                    TreeNode rootNode = new TreeNode(root);
                    rootNode.left = l;
                    rootNode.right = r;
                    list.add(rootNode);
                }
            }
        }
        return list;
    }

    public void tranverse(TreeNode t){
        if (t == null) return;
        System.out.print(t.val);
        tranverse(t.left);
        tranverse(t.right);
    }
}