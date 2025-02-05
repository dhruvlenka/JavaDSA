package DP;

import java.util.Scanner;

public class DynamicProgramming {
    public static void main(String[] args) {
        //top-down approach
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        //step 1
        int[] dp = new int[n+1];
        for(int i=0; i<=n; i++){
            dp[i] = -1;
        }
        System.out.println(fibonacci(n, dp));
    }

    public static int fibonacci(int n, int[] dp){
        //base case
        if(n <= 1){
            return n;
        }

        //step 3
        if(dp[n] != -1){
            return dp[n];
        }

        //step 2
        dp[n] = fibonacci(n-1, dp) + fibonacci(n-2, dp);
        return dp[n];
    }
}
