package Recursion;

import java.util.Scanner;

public class Recursion_Factorial {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int x = input.nextInt();

        int x = 10;
        int ans = factorial(x);
        System.out.println(ans);

        int n = 5;
        System.out.println("===============");
        System.out.println("Factorial of " + n  + " = "+ factorial2(n));

    }
    static int factorial(int n){
        if(n == 0){
            return 1;
        }
        int smallerProblem = factorial(n-1);
        int biggerProblem = n * smallerProblem;
        // return n*smallerProblem
        return biggerProblem;
    }
    static int factorial2(int n){
        if(n>1){
            return n*factorial2(n-1);
        } else {
            return n;
        }
    }
}
