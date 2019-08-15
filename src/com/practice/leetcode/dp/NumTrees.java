package com.practice.leetcode.dp;

import java.util.LinkedList;
import java.util.List;

public class NumTrees {

    public static void main(String[] args) {
        //numTrees(4);
        List<TreeNode> treeNodes = new NumTrees().generateTrees(3);
        System.out.println(treeNodes);
    }

    public static int numTrees(int n) {
        if (n <= 0) return 0;
        //G(n) 代表当节点数为n时 的排列个数 所以可推得 G(n) = G(0)*G(n-1)+ G(1)*G(n-2)...+ G(n-1)*G(0)
        //默认G(0)=1 因为比如三个节点 1位根 左面虽然放不了但需要乘右边的
        int[] dp = new int[n + 1];
        dp[0] = 1; //假设
        for (int i = 1; i < n + 1; i++) {
            for (int j = 0; j < i; j++) {
                dp[i] += dp[j] * dp[i - j - 1];
            }
        }
        System.out.println(dp[n]);

        return dp[n];
    }

    public  List<TreeNode> generateTrees(int n) {

        if(n == 0)
            return new LinkedList<TreeNode>();

        return subTrees(1, n);
    }

    public  List<TreeNode> subTrees(int start, int end) {
        List<TreeNode> res = new LinkedList<TreeNode>();
        if(start > end){
            res.add(null);
            return res;
        }
        for(int i = start;i <= end;i++){
            List<TreeNode> subLeftTree = subTrees(start,i-1);
            List<TreeNode> subRightTree = subTrees(i+1,end);
            for(TreeNode left : subLeftTree){
                for(TreeNode right : subRightTree){
                    TreeNode node = new TreeNode(i);
                    node.left = left;
                    node.right = right;
                    res.add(node);
                }
            }
        }
        return res;
    }

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}

