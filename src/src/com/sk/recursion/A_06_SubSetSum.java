package com.sk.recursion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class A_06_SubSetSum {

    public static void main(String[] args) {
        int[] arr = {3,1,2};
        List<Integer> res= new ArrayList<Integer>();
        subSetSum(arr, 0, res , 0);
        Collections.sort(res, Collections.reverseOrder());
        System.out.println(res);
    }

    private static void subSetSum(int[] arr, int i, List<Integer> sumList, int sum) {
        if (i==arr.length){
            sumList.add(sum);
            return;
        }
        subSetSum(arr, i+1, sumList, sum+arr[i]);
        subSetSum(arr, i+1, sumList, sum);
    }
}
