package com.practice.leetcode.dp;

public class MinPay {
    public int minCostClimbingStairs(int[] cost) {
        if(cost == null || cost.length==0)
            return 0;
        int len = cost.length;
        int []dp = new int[len];
        //dp代表走当前格子所花费的钱
        dp[0] = cost[0];
        dp[1] =cost[1];

        for(int i=2;i<len;i++){
            dp[i] = Math.min(cost[i]+dp[i-2],dp[i-1]+cost[i]);
        }
        return Math.min(dp[len-1], dp[len-2]);

    }
}
