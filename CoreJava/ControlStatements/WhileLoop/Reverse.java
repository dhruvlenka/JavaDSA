package CoreJava.ControlStatements.WhileLoop;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number ");
        int n = input.nextInt();
        System.out.println(reverse(n));
    }
    public static int reverse(int n){
        int rev = 0;
         /*
        Whenever we divide or say it modulo a number by 10 we will get the last number
         */
        while (n>0){
            rev = 10 * rev + n;
            n = n/10;
        }
        return rev;
    }
}
