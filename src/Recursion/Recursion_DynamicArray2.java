package Recursion;

import java.util.Scanner;

public class Recursion_DynamicArray2 {
    static void print(int n){
        if (n == 0){
            return;
        } 
        print(n-1); ////Recursive Relation/Call: head recursion
        System.out.println(n);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int prn2 = input.nextInt();
        System.out.println("Printing Dynamic Array: Head Recursion");

        print(prn2);
    }
}
