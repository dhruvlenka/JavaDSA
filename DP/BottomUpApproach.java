package DP;

import java.util.Scanner;

public class BottomUpApproach {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        //step 1
        int[] dp = new int[n+1];

        //step 2
        dp[1] = 1;
        dp[0] = 0;

        //step 36
        for(int i=2;  i<=n; i++){
            dp[i] = dp[i-1] + dp[i-2];
        }
        System.out.println(dp[n]);
    }
}
