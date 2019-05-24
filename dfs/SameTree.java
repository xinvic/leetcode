package com.practice.leetcode.dfs;

public class SameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {

        if((p==null&&q==null)||p.val == q.val){
            return true && isSameTree(p.left,q.left)&&isSameTree(p.right,q.right);


        }else{
            return false;
        }
    }
}

class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}