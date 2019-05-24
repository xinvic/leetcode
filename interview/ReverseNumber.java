package com.practice.leetcode.interview;

public class ReverseNumber {
    public static void main(String[] args) {
        ReverseNumber reverseNumber = new ReverseNumber();
        System.out.println(reverseNumber.reverse(

                1534236469));


    }
    public int reverse(int x) {
        //201 123 321

        long r=0;
        do {
           int num = x % 10 ;

           r= r*10+num;
            if(r>Integer.MAX_VALUE || r<Integer.MIN_VALUE)
                return 0;
           x /=10;

        }while (x!= 0);


        return (int)r;
    }
}
