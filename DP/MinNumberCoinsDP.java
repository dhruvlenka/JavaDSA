package DP;

import java.util.ArrayList;
import java.util.Collections;

public class MinNumberCoinsDP {
    public static void main(String[] args) {
        int n = 40;
        ArrayList<Integer> result = minPartition(n);
        System.out.println(result);
    }
    public static ArrayList<Integer> minPartition(int n){
        // Write your code here.
        int[] dp = new int[n+1];
        int[] coins = {1, 2, 5, 10, 20, 50, 100, 500, 1000};

        dp[0] = 0;
        for(int i=1; i<=n; i++){
            dp[i] = Integer.MAX_VALUE;

            for(int k: coins){
                if(i-k >=0) {
                    dp[i]=Math.min(dp[i], 1+dp[i-k]);
                }
            }
        }

        int currIndex = n;
        ArrayList<Integer> result = new ArrayList<>();
        while(currIndex > 0){
            int res = Integer.MAX_VALUE, index = currIndex, coin = 0;
            for(int k: coins){
                if(currIndex-k >=0 && dp[currIndex-k]<res){
                    res = Math.min(res, dp[currIndex-1]);
                    coin=k;
                    index = currIndex - k;

                }
            }
            result.add(coin);
            currIndex=index;
        }
        Collections.sort(result, Collections.reverseOrder());
        return result;
    }
}
