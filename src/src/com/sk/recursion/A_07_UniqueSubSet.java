package com.sk.recursion;

import java.util.ArrayList;

public class A_07_UniqueSubSet {
    public static void main(String[] args) {

        int[] arr = {1,2,2};
        printUniqueSubSet(arr, 0, new ArrayList<Integer>());
    }

    private static void printUniqueSubSet(int[] arr, int idx, ArrayList<Integer> list) {
        System.out.println(list);
        for (int i = idx; i< arr.length; i++){
            if(i != idx && arr[i]==arr[i-1])continue;
            list.add(arr[i]);
            printUniqueSubSet(arr, i+1, list);
            list.removeLast();
        }
    }
}
