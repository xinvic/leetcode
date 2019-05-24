package com.practice.leetcode.dp;

public class MinPathSum {
    public static void main(String[] args) {

    }
    public int minPathSum(int[][] grid) {
        int row = grid.length-1;
        int col = grid[0].length-1;
        int [][]dp = new int[row+1][col+1];
        dp[row][col] = grid[row][col];
        for (int i = row; i >=0; i--) {
            for (int j = col; j >=0 ; j--) {
                if(i+1>row){
                    if(j+1<=col)
                        dp[i][j] = grid[i][j]+dp[i][j+1];
                }else if(j+1>col){
                    if(i+1<=row)
                        dp[i][j] = grid[i][j]+dp[i+1][j];
                }else{
                    dp[i][j]=grid[i][j]+Math.min(dp[i+1][j],dp[i][j+1] );
                }
            }
        }
        return dp[0][0];
    }
}
