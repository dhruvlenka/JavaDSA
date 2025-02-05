package Recursion;

import java.util.Scanner;

public class Recursion_DigitCount {
    static int count = 0;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = input.nextInt();
        getCount(n);
        System.out.println("Total Digit is: " + count);


    }
    public static void getCount(int n){
        if(n>0){
            count++;
            getCount(n/10);
        }
    }
}
