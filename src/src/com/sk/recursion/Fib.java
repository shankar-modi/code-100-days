package com.sk.recursion;

public class Fib {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(fib(n));
    }

    private static int fib(int n) {
        if (n<=1)return n;
        return fib(n-1)+fib(n-2);
    }
}
