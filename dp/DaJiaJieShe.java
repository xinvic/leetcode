package com.practice.leetcode.dp;

/**
 * 打家劫舍1
 */
public class DaJiaJieShe {
    public static void main(String[] args) {
        int[] n = {2,7,9,13,1};
        System.out.println(rob(n));
    }
    public static int rob(int[] nums) {
        int l  = nums.length;
        int[] memo = new int[l];
        memo[0] = nums[0];
        memo[1] = Math.max(nums[0],nums[1] );

        //memo[l-1] = nums[l-1];
        for(int i=2;i<l;i++){
            memo[i] = Math.max(memo[i-2]+nums[i],memo[i-1] );
        }
        return  memo[l-1];
    }
}
