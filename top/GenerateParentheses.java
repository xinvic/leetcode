package com.practice.leetcode.top;

import java.util.LinkedList;
import java.util.List;

public class GenerateParentheses {
    public static void main(String[] args) {
        List<String> strings = new GenerateParentheses().generateParenthesis(2);
        System.out.println(strings);
    }
    public List<String> generateParenthesis(int n) {
        List<String> list = new LinkedList<>();
        backParenthesis(list,"",0,0,n);
        return list;
    }

    private void backParenthesis(List<String> list, String str,int open, int close, int max) {
        //基线条件
        if(str.length() == max * 2){
            list.add(str);
            return;

        }
        if(open<max){
            backParenthesis(list,str+"(",open+1,close,max);
        }
        if(close<open){
            backParenthesis(list,str+")",open,close+1,max);
        }
    }
}
