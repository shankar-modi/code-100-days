package com.sk.recursion;

import java.util.ArrayList;
import java.util.List;

public class AllSbuSequence {
    public static void main(String[] args) {
        int[] arr = {3,1,2};
        printSubSeq(arr, 0 , "");
        printSubSeq(arr, 0 , new ArrayList<>());
    }

    private static void printSubSeq(int[] arr , int i, String subSeq) {
        if (i == arr.length){
            System.out.println("SEQ : " +subSeq);
            return;
        }
        printSubSeq(arr, i+1, subSeq);
        printSubSeq(arr, i+1, subSeq+arr[i]);

    }

    private static void printSubSeq(int[] arr , int i, List<Integer> list){
        if (i>= arr.length){
            System.out.println("SUB SEQ " + list);
            return;
        }

        list.add(arr[i]);
        printSubSeq(arr, i+1, list);
        list.removeLast();
        printSubSeq(arr, i+1, list);

    }
}
