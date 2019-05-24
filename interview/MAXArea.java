package com.practice.leetcode.interview;

/**
 * 11 , 开始差点以为是dp 想想实在不会做
 * 然后想到 头尾指针 缩小范围 因为缩进的时候宽度是减小的
 * 所以指针移动时 只让高度低的那个移动 才有可能出现更大的区域
 */
public class MAXArea {
    public int maxArea(int[] height) {
        if(height == null)
            return 0;
        int head=0;
        int tail = height.length-1;
        int maxArea = Integer.MAX_VALUE;
        while(head != tail){
            int min = Math.min(height[head], height[tail]);
            int width = tail - head;
            int currentArea = min*width;
            maxArea = maxArea >currentArea ? maxArea : currentArea;
            if(height[head]>height[tail])
                tail--;
            else
                head++;
        }

        return maxArea;
    }
}
