package Recursion;

import java.util.Scanner;

public class Recursion_SayDigit {
    static void sayDigit(int n, String[] arr){
        //base case
        if(n == 0){
            return;
        }
        //processing
        int digit = n % 10;
        n = n  / 10;
     //   System.out.println(arr[digit]); //will give: Two One Four because of modulo

        //recursive relation/call
        sayDigit(n, arr);
        System.out.println(arr[digit]);
    }
    public static void main(String[] args) {
        String[] arr = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten"};

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        sayDigit(n, arr);
    }
}
