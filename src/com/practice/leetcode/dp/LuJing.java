package com.practice.leetcode.dp;

/**
 * 机器路径
 */
public class LuJing {
    public int uniquePaths(int m, int n) {
        int [][]dp = new int[m][n];
        int row = m-1;
        int col = n-1;
        for (int i = row; i >=0; i--) {
            for (int j = col; j >=0 ; j--) {
                if(i==row || j==col ){
                    dp[i][j]=1;
                }else{
                    dp[i][j] = dp[i+1][j]+dp[i][j+1];
                }
            }
        }
        return dp[0][0];
    }
    //带障碍物的
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int [][]dp = new int[obstacleGrid.length][obstacleGrid[0].length];
        int row = obstacleGrid.length-1;
        int col = obstacleGrid[0].length-1;
        dp[row][col]=1;
        for (int i = row; i >=0; i--) {
            for (int j = col; j >=0 ; j--) {
               if(obstacleGrid[i][j]!=1){
                   if(i+1>row){
                       if(j+1<=col)
                       dp[i][j] = dp[i][j+1];
                   }else if(j+1>col){
                       if(i+1<=row)
                           dp[i][j] = dp[i+1][j];
                   }else{
                       dp[i][j] = dp[i+1][j]+dp[i][j+1];
                   }
               }else{
                   dp[i][j]=0;
               }
            }
        }
        return dp[0][0];
    }
}
