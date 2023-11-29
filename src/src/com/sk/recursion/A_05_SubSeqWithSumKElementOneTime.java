package com.sk.recursion;

import java.util.ArrayList;
import java.util.Arrays;

public class A_05_SubSeqWithSumKElementOneTime {
    public static void main(String[] args) {
        int[] arr = {10,1,2,7,6,1,5};
        Arrays.sort(arr);
        int target = 8;

        printSubSeq(arr, target, 0, new ArrayList<Integer>());

    }

    private static void printSubSeq(int[] arr, int target, int i, ArrayList<Integer> list) {
        if (target == 0){
            System.out.println(list);
            return;
        }
        if (arr.length == i || target < 0){
            return;
        }

        for (int idx = i ; idx < arr.length; idx++){
            if (idx > i && arr[idx] == arr[idx-1])continue;
            if(arr[idx] > target) break;
            list.add(arr[idx]);
            printSubSeq(arr, target-arr[idx], idx+1, list);
            list.removeLast();
        }

    }
}
