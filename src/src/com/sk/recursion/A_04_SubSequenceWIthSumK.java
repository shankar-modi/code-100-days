package com.sk.recursion;

import java.util.ArrayList;

public class A_04_SubSequenceWIthSumK {
    public static void main(String[] args) {

        int[] arr = {3,1,2,2,1};
        int sum = 3;
        printSubSeqWithSumK(arr, sum, 0,new ArrayList<Integer>());
        print1SubSeqWithSumK(arr, sum, 0,new ArrayList<Integer>());
    }

    private static void printSubSeqWithSumK(int[] arr, int sum, int i, ArrayList<Integer> list) {

        if (i == arr.length){
            if (sum == 0){
                System.out.println("SEQ : " + list);
            }
            return;
        }
        list.add(arr[i]);
        printSubSeqWithSumK(arr, sum-arr[i],i+1, list);
        list.removeLast();
        printSubSeqWithSumK(arr, sum,i+1, list);
    }

    private static boolean print1SubSeqWithSumK(int[] arr, int sum, int i, ArrayList<Integer> list){
        if (arr.length == i){
            if (sum==0){
                System.out.println(" 1 SEQ : " + list );
                return true;
            }
            return false;
        }

        list.add(arr[i]);
        if(print1SubSeqWithSumK(arr, sum-arr[i], i+1, list)){
            return true;
        }
        list.removeLast();
        return print1SubSeqWithSumK(arr, sum, i+1, list);

    }
}
