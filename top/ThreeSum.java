package com.practice.leetcode.top;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * 求三个数的和为零 思路：先排序 然后就在后面的两个数字 相当于求2sum
 */
public class ThreeSum {

    public List<List<Integer>> threeSum(int[] nums) {
        if (nums == null || nums.length < 3) return null;
        List<List<Integer>> list = new ArrayList<>();
        //先排个序
        Arrays.sort(nums);
        //分别遍历每一个元素先
        for (int i = 0; i < nums.length - 2; i++) {

            //如果当前值和先前的值相同则跳过 避免出现相同的答案
            if (i == 0 || nums[i] != nums[i - 1]) {
                int l = i + 1;
                int r = nums.length - 1;
                int sum = 0 - nums[i];
                //接下来求的是两个和
                while (l < r) {
                    //如果 两者相加等于和 则加入list
                    if(nums[l]+nums[r] == sum){
                        list.add(Arrays.asList(nums[i],nums[l],nums[r]));
                        //同时要移动左右指针 兼顾去重
                        while(l<nums.length-1&&nums[l]==nums[l+1])l++;
                        while(r>0&&nums[r]==nums[r-1])r--;
                        //然后还需要向下移动一步
                        l++;r--;

                    }else{
                        //如果不等于 比sum小的话
                        if(nums[l]+nums[r]<sum)
                            l++;
                        else
                            l++;

                    }

                }
            }
        }


        return list;
    }

    public static void main(String[] args) {
        int []nums={-1,0,1,2,-1,-4};
        new ThreeSum().threeSum(nums);

    }
}

class Mycomparator implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {

        if (o1 > o2) // 默认是o1 < o2时返回-1， 一下同理
            return -1;
        if (o1 < o2) return 1;
        return 0;
    }

}