package com.practice.leetcode;

import java.util.Stack;

public class MatchKuoHao {

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if(stack.size()>0&& stack.peek()=='(' && s.charAt(i)==')'){
                stack.pop();
            }else if(stack.size()>0&& stack.peek()=='{' && s.charAt(i)=='}'){
                stack.pop();
            }else if(stack.size()>0&& stack.peek()=='[' && s.charAt(i)==']'){
                stack.pop();
            }
            else{
                stack.push(s.charAt(i));
            }
        }
        return stack.size()==0;
    }
}
