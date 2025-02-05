package Recursion;

import java.util.Scanner;

public class Recursion_LargestNNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = sc.nextInt();

        int big = a;
        char c = sc.next().charAt(0);
        do {
            System.out.println("Enter a number: ");
            int b = sc.nextInt();
            big = big(big,b);
            System.out.println("Press Y to enter the number: ");
        } while (c=='Y' || c=='y');{
            System.out.println("Biggest value is: " + big);
        }

    }
    public static int big(int a, int b){
        return a>b?a:b;
    }
}
