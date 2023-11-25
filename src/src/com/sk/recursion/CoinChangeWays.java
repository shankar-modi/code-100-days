package com.sk.recursion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CoinChangeWays {
    public static void main(String[] args) {
        int[] coins = {1,2,5};
        int target = 15;
        List<String> ways = new ArrayList<>();
        coinChangeWays(coins, target, ways, "", 0);
        System.out.println(ways);

        Map<String , Integer> map = new HashMap<>();
        System.out.println(coinChangeWays(coins,target,0, map));
    }

    private static void coinChangeWays(int[] coins, int target, List<String> ways, String path, int i) {
            if (target == 0){
                ways.add(path);
                return;
            }
            if (target < 0 || i >= coins.length)return;

            coinChangeWays(coins, target-coins[i], ways, path+coins[i] , i);
            coinChangeWays(coins, target, ways,  path, i+1);

    }

    private static int coinChangeWays(int[] coins, int target, int i, Map<String , Integer> map) {
        if (target == 0){
            return 1;
        }
        if (target < 0 || i >= coins.length)return 0 ;
        String key = i+"_"+target;
        if (map.containsKey(key))return map.get(key);
        int  ways = coinChangeWays(coins, target-coins[i], i, map) + coinChangeWays(coins, target, i+1, map);
        map.put(key,ways);
        return ways;
    }
}
