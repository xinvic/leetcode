package com.practice.leetcode.top;

/**
 * 31 下一个最大的字典序
 */
public class NextPermutation {
    public static void main(String[] args) {
        int[] nums = new int[]{1,5,8,4,7,6,5,3,1};
        new NextPermutation().nextPermutation(nums);
    }
    public void nextPermutation(int[] nums) {
        if(nums.length < 2)
            return;
        int tail = nums.length-1;
        int i = tail;
        while(i >0 && nums[i]<=nums[i-1]){
            i--;
        }
        if(i >=0 ){
            int j = nums.length-1;
            while(j>=0 && nums[j]<=nums[i]){
                j--;
            }
            swap(i, j, nums);
        }
        reverseArray(nums, i+1, nums.length-1);


    }
    public void reverseArray(int []nums,int i,int j){

        while(i < j){
            swap(i,j,nums);
            i++;j--;
        }

    }
    public void swap(int n1,int n2,int []nums){
        int temp = nums[n1];
        nums[n1] = nums[n2];
        nums[n2] = temp;
    }
}

