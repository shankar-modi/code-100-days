package com.sk.recursion;

import java.util.ArrayList;

public class A_04_CountSubSeqWIthSumK {
    public static void main(String[] args) {
        int[] arr = {3,1,2,2,1};
        int sum = 3;
        System.out.println("Total Sub Seq : " + countSubSequenceWithSumK(arr, sum, 0));
    }

    private static int countSubSequenceWithSumK(int[] arr, int sum, int i) {

        if (i==arr.length){
            if (sum==0)return 1;

            return 0;
        }
        return countSubSequenceWithSumK(arr, sum-arr[i], i+1) +
                countSubSequenceWithSumK(arr, sum, i+1);
    }
}
