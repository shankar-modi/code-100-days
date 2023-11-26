package com.sk.recursion;

public class PalindromicString {
    public static void main(String[] args) {
        System.out.println(isPalindrome("MADAM"));
        System.out.println(isPalindrome("MADDAM"));
        System.out.println(isPalindrome("ABC"));
    }

    private static boolean isPalindrome(String input) {
        return isPalindrome(0, input);
    }

    private static boolean isPalindrome(int i, String input) {
        int len = input.length();
        if (i>= len/2)return true;
        if (input.charAt(i) != input.charAt(len-i-1))return false;
        return isPalindrome(i+1, input);
    }


}
