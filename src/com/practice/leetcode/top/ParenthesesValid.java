package com.practice.leetcode.top;

import java.util.Stack;

public class ParenthesesValid {
    public static void main(String[] args) {
        System.out.println("".length());
        System.out.println(new ParenthesesValid().isValid("()"));
    }

    public boolean isValid(String s) {

        //定义一个栈
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(!stack.empty()) {
                Character peek = stack.peek();
                if (c == ')' && peek == '(' || c == ']' && peek == '[' || c == '}' && peek == '{') {
                    stack.pop();
                } else stack.push(c);
            }else
                stack.push(c);

        }
        return stack.empty();
    }
}