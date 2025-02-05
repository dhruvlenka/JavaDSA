package Recursion;

import java.util.Scanner;

//Finding index of Fibonacci number
public class Recursion_Fibonacci {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter a number for fibonacci number term: ");
//        int fibo = input.nextInt();

        int fibo = 27;
        int ans = fibonacci(fibo);
        System.out.println(ans + " th Fibobacci term is = " + ans);

        for(int i=1; i<=fibo;i++){
            int ans2 = fibonacci2(i);
            System.out.println(ans2);
        }
    }
    static int fibonacci(int n) {
        //base case
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }
    static int fibonacci2(int n){
        if(n==1){
            return 0;
        }
        if(n==2 || n==3){
            return 1;
        }
        return fibonacci2(n-2) + fibonacci2(n-1);
    }
}
