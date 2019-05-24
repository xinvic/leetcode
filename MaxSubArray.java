package com.practice.leetcode;

import java.util.Scanner;

public class MaxSubArray {
    public static void main(String[] args) {
        int []arr = {-2,1,-3,4,-1,2,1,-5,4}
        ;
        maxSubArray();
        System.out.println();
    }
    public static void maxSubArray() {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int []arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i]= sc.nextInt();

        }

        int n = arr.length;
        int []dp = new int[n];
        int min=Integer.MAX_VALUE;
        dp[n-1] = arr[n-1];
        min = dp[n-1];
        for (int i = n-2; i >= 0; i--) {
           dp[i] = Math.min(dp[i+1]+arr[i],arr[i] );
           if(dp[i]<min)
               min = dp[i];
        }
        System.out.println(min);
    }
    public static int climbStairs(int n) {
        if(n<3)
            return n;
        int []dp = new int[n];
        dp[0] = 1;
        dp[1] = 2;
        for(int i =2;i<n;i++){
            dp[i] = dp[i-1]+dp[i-2];
        }
        return dp[n];
    }
    public int maxProfit(int[] prices) {
        int max = 0;
        for (int i = 0; i <prices.length ; i++) {
            for (int j = i+1; j <prices.length ; j++) {
                if(prices[j]-prices[i]>max)
                    max = prices[j]-prices[i];
            }
        }
        return max;
    }
}
