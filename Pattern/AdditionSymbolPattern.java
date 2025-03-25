package Pattern;

import java.util.Scanner;

public class AdditionSymbolPattern {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = input.nextInt();

        int  mid = n/2+1;
        for(int i=1; i<=n; i++) {
            for (int j = 1; j <= n; j++) {
                if(i==mid || j==mid){
                    System.out.print("@ ");
                }
                if(i!=mid){
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
    public static void additionPattern(int n){
        int  mid = n/2+1;
        for(int i=1; i<=n; i++) {
            for (int j = 1; j <= n; j++) {
                if(i==mid || j==mid){
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
    }
        }
}
