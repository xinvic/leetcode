package com.practice.leetcode.dp;

public class NIu {
    static int num=1;

    public static void main(String[] args) {
        System.out.println(t(20));

    }
    public static int t(int n){
        if(n<1)
            return 0;
        for (int i = 1; i <=n ; i++) {
            if(i>=3 && i<8){
                num++;

                t(n-i+1);
            }


            if(i==11){
                num--;

            }


        }
        return num;
    }

}
