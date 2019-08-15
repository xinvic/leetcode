package com.practice.leetcode.dp;

class NumArray {

    int[] sum;
    boolean isNULL = false;

    public NumArray(int[] nums) {
        if (nums == null || nums.length == 0) isNULL = true;
        else {
            sum = new int[nums.length];
            sum[0] = nums[0];
            for (int i = 1; i < nums.length; i++) {
                sum[i] = sum[i - 1] + nums[i];
            }
        }

    }

    public int sumRange(int i, int j) {
        if (isNULL) return 0;
        if (i > 0) return sum[j] - sum[i - 1];
        else {
            return sum[j];
        }
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(i,j);
 */