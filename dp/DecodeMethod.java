package com.practice.leetcode.dp;

public class DecodeMethod {
    public int numDecodings(String s) {
        int[] dp = new int[s.length()];
        if (s.charAt(0) == '0') return 0;
        else dp[0] = 1;
        for (int i = 1; i < s.length(); i++) {
            char pre = s.charAt(i - 1);
            char c = s.charAt(i);
            if (pre > '2') {
                if(c=='0')
                    return 0;
                else
                dp[i] = dp[i - 1];
            } else if (pre == '0') {
                if(c=='0')
                return 0;
                else
                     dp[i] = dp[i - 1];
            } else if (pre == '2') {
                if(c<'7' && c>'0')dp[i] = dp[i - 1] + 1;
                else  if (c == '0' && i>1)
                    dp[i] = dp[i - 2];
                else if (c == '0' && i<1) {
                    dp[i] = 1;
                }


               else dp[i] = dp[i - 1];

            } else {
                if (c == '0' && i>1)
                    dp[i] = dp[i - 2];
                else if (c == '0' && i<1) {
                    dp[i] = 1;
                }
                else dp[i] = dp[i - 1] + 1;
            }

        }
        return dp[s.length() - 1];
    }

}
