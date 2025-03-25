package DP;

import java.util.Scanner;

public class ShiftLogic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        int prev2 = 0;
        int prev1 = 1;

        for(int i=2; i<=n; i++){
            int curr = prev1 + prev2;
            prev2 = prev1;
            prev1 = curr;
        }
        System.out.println(prev1);
    }
}
