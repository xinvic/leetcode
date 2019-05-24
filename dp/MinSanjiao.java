package com.practice.leetcode.dp;

import java.util.List;

/**
 * 考虑到dp但是没有想到怎么dp 因为出发点从自上而下了  每太想明白
 * 所以采用自下向上dp 最后一层 最小是它本身 依次看上一层 ，直到第一层
 */
public class MinSanjiao {
    public int minimumTotal(List<List<Integer>> triangle) {
        if(triangle == null || triangle.size()==0)return 0;
        int []dp = new int[triangle.size()];
        for (int i = triangle.size()-1; i >= 0 ; i++) {
            List<Integer> integers = triangle.get(i);
            for (int j = 0; j <integers.size(); j++) {
                dp[j] = Math.min(dp[j],dp[j+1] )+integers.get(j);
            }
        }


        return dp[0];
    }
}
