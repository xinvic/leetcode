package com.practice.leetcode;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        for(int i=2018;i<=n;i++){
            if(isNum(i))
                count++;
        }
        System.out.println(count);

    }

    public static boolean isNum(int num){
        boolean isEight = false;
        boolean isTwo = false;
        boolean isZero = false;
        boolean isOne = false;

        do {
            int y = num%10;
            if(y == 8)
                isEight = true;
            if(1==y && isEight)
                isOne = true;
            if(0==y && isOne && isEight)
                isZero =true;
            if(2==y && isEight&&isOne&& isZero)
                isTwo = true;

            num/=10;


        }while(num != 0);
        if(isEight&&isTwo&&isZero&&isOne)
            return true;
        return false;
    }
}
