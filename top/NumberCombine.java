package com.practice.leetcode.top;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class NumberCombine {
    public static void main(String[] args) {
        new NumberCombine().letterCombinations("234");
    }
    public List<String> letterCombinations(String digits) {
        if("".equals(digits)){
            return new ArrayList<String>();
        }
        //准备
        HashMap<Integer,String> hashMap = new HashMap<>();
        hashMap.put(2, "abc");
        hashMap.put(3, "def");
        hashMap.put(4, "ghi");
        hashMap.put(5, "jkl");
        hashMap.put(6, "mno");
        hashMap.put(7, "pqrs");
        hashMap.put(8, "tuv");
        hashMap.put(9, "wxyz");

        //1拆解输入
       // String [][]dp = new String[digits.length()][5];
        char c = digits.charAt(0);
        int num = c-'0';
        String s = hashMap.get(num);
        List<List<String>> list =  new ArrayList<>();
        List<String> arr = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {

            arr.add(s.charAt(i)+"");
        }
        list.add(arr);
        for (int i = 1; i < digits.length(); i++) {
            List<String> strList = list.get(i - 1);
            c = digits.charAt(i);
             num = c-'0';
             String s2 = hashMap.get(num);
            List<String> arr2 = new ArrayList<>();
            for (int j = 0; j < strList.size(); j++) {
                for (int k = 0; k < s2.length(); k++) {
                    String s1 = strList.get(j);
                    //拼接
                    String s3 = s1+s2.charAt(k);
                    arr2.add(s3);


                }
            }
            list.add(arr2);
            System.out.println(s2);
        }
        //2不断取出

        return list.get(list.size()-1);
    }
}
