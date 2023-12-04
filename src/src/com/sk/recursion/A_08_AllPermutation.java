package com.sk.recursion;

import java.util.*;

public class A_08_AllPermutation {

    public static void main(String[] args) {
        int[] arr = {1,2,3};
        List<List<Integer>> allPerm = new ArrayList<>();
        Set<Integer> visited = new HashSet<>();

        getAllThePermutation(0, arr, visited, allPerm, new ArrayList<>());
        System.out.println(allPerm);

    }

    private static void getAllThePermutation(int i, int[] arr, Set<Integer> visited, List<List<Integer>> allPerm, List<Integer> curr) {
        if (i == arr.length){
            allPerm.add(new ArrayList<>(curr));
            return;
        }

        for (int j = 0 ; j < arr.length ; j++){
            if (!visited.contains(j)){
                visited.add(j);
                curr.add(arr[j]);
                getAllThePermutation(i+1, arr, visited, allPerm, curr);
                visited.remove(j);
                curr.removeLast();
            }
        }
    }
}

