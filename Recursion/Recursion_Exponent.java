package Recursion;

import java.util.Scanner;

public class Recursion_Exponent {
    static int power(int a, int b){
        //base case: if power is 0
        if (b == 0){
            return 1;
        }
        //base case: if power is 1
        if(b == 1){
            return a;
        }
        //recursive call
        int ans = power(a, b/2);

        //if b is even
        if(b % 2 == 0){
            return ans * ans;
        } else {
            return a * ans * ans;
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();

        int ans = power(a,b);
        System.out.println(ans);

    }
}
