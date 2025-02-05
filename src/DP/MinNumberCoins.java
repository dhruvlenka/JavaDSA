package DP;

import java.util.ArrayList;

public class MinNumberCoins {
    public static void main(String[] args) {
        int N = 93; //target
        ArrayList<Integer> result = minPartition(N);
        System.out.println(result);

        ArrayList<Integer> result2 = minPartition2(N);
        System.out.println(result2);
    }

    //without dynamic programming
    public static ArrayList<Integer> minPartition(int N) {
        ArrayList<Integer> ans = new ArrayList<>();
        int[] coins = {1, 2, 5, 10, 20, 50, 100, 500, 1000};
        int coinsLength = coins.length;

        for (int i = coinsLength - 1; i >= 0; i--) {
            while (coins[i] <= N) {
                N -= coins[i];
                ans.add(coins[i]);
            }
        }
        return ans;
    }
    //second way, without dynamic programming
    public static ArrayList<Integer> minPartition2(int N){
        ArrayList<Integer> ans = new ArrayList<>();
        int[] coins = {2000, 1000, 500, 100, 50, 20, 10, 5, 2, 1};
        int i=0;
        while (N > 0){
            if(coins[i] <= N){
                N -= coins[i];
                ans.add(coins[i]);
            } else {
                i++;
            }
        }
        return ans;
    }
}
