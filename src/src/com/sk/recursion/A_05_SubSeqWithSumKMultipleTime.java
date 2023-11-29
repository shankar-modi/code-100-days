package com.sk.recursion;

import java.util.ArrayList;

public class A_05_SubSeqWithSumKMultipleTime {
    public static void main(String[] args) {
        int[] arr = {2,3,6,7, 1};
        int target = 7;

        printSubSeq(arr, target, 0, new ArrayList<Integer>());

    }

    private static void printSubSeq(int[] arr, int target, int i, ArrayList<Integer> list) {
        if (arr.length == i || target < 0){
            if (target == 0){
                System.out.println(list);
            }
            return;
        }

        list.add(arr[i]);
        printSubSeq(arr, target-arr[i], i, list);
        list.removeLast();
        printSubSeq(arr, target, i+1, list);

    }
}
