package Recursion;

import java.util.Scanner;

//recursion from return statement
public class RecursionFromReturn {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a num: ");
        int n = input.nextInt();

        int ans = getSum(n);
        System.out.println(ans);

    }
    public static int getSum(int n){
        if(n>1){
           // System.out.print(n + " +" + "= ");
            return n + getSum(n-1);
        } else {
            return n;
        }
    }
}
// 5 4 3 2 1
