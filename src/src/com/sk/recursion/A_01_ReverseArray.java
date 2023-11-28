package com.sk.recursion;

import java.util.Arrays;

public class A_01_ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        reverse(0,arr.length-1,arr);
        System.out.println(Arrays.toString(arr));

        reverse(0,arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void reverse(int i ,int k , int[] arr) {
        if(i>=k)return;
        int temp = arr[i];
        arr[i] = arr[k];
        arr[k] = temp;
        reverse(i+1, k-1, arr);

    }

    private static void reverse(int i , int[] arr) {
        if(i>=(arr.length/2))return;
        int temp = arr[i];
        arr[i] = arr[arr.length-i-1];
        arr[arr.length-i-1] = temp;
        reverse(i+1, arr);

    }
}
