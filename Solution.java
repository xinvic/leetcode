package com.practice.leetcode;

public class Solution {
    public static void main(String[] args) {
    }
    public static String longestPalindrome(String s) {
        if(s==null || "".equals(s))
            return "";
        int n = s.length();
        int p =0,q=0;
        int max= 0;
        boolean [][]dp  = new boolean[n][n];
        StringBuilder sb = new StringBuilder();
        for (int i = n-1; i >=0 ; i--) {

            for (int j = i; j <n ; j++) {
                if(s.charAt(i)==s.charAt(j) &&(j-i<3 || dp[i+1][j-1])){
                    dp[i][j] = true;
                    if(j-i>max){
                        max = j-i;
                        p = i;
                        q = j;
                    }

                }
            }

        }
        return s.substring(p,q+1);
    }
}
