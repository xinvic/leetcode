package com.practice.leetcode;

public class MaxSquare {
    public int maxArea(int[] height) {
        int min = 0;
        int max = height.length - 1;
        int maxSquare = 0;
        while (min != max) {
            int w = max - min;
            int h = Math.min(height[min], height[max]);
            maxSquare = w * h >= maxSquare ? w * h : maxSquare;
            int i=height[min] > height[max] ? max-- : min++;

        }
        return maxSquare;
    }
}
