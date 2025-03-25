package Recursion;

import java.util.Scanner;

public class Recursion_DynamicArray {
    static void print(int n){
        //base case
        if(n == 0){
            return;
        }
        System.out.println(n);
        print(n-1); //Recursive Relation/Call: tail Recursion
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int prn = input.nextInt();
        System.out.println("Print Dynamic Recursion: Tail Recursion");

        print(prn);
    }
}
