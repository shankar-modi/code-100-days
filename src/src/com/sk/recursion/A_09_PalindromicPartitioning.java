package com.sk.recursion;

import java.util.ArrayList;
import java.util.List;

public class A_09_PalindromicPartitioning {
    public static void main(String[] args) {
        String str = "aabbc";
        List<List<String>> result = new ArrayList<>();
        partition(str, 0, result,new ArrayList<String>());
        System.out.println(result);
    }

    private static void partition(String str, int idx, List<List<String>> result, ArrayList<String> curr) {
        if (str.length() == idx){
            result.add(new ArrayList<>(curr));
            return;
        }

        for (int i = idx; i < str.length();i++ ){
            String sub = str.substring(idx , i+1);
            if (isPalindrom(str, idx, i)){
                curr.add(sub);
                partition(str, i+1, result, curr);
                curr.removeLast();
            }
        }
    }
    private static boolean isPalindrom(String str , int start , int end){
        while(start <= end){
            if (str.charAt(start) != str.charAt(end))return false;
            start++;
            end--;
        }
        return true;
    }
}
