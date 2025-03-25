package Recursion;

import java.util.Scanner;

public class Recursion_Power {
    static int power(int num){
        if(num == 0){
            return 1;
        }

       /*
        int smallerProblem = power(num-1);
        // int biggerProblem = 2 * smallerProblem;
        return 2 * smallerProblem; // in a shorter way
        */
        return 2 * power(num-1);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int p = input.nextInt();

        System.out.println(power(p));
    }
}
