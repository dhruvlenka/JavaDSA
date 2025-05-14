package CoreJava.Loops.WhileLoop;

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

        while (n>0){
            int lastDigit = n%10;
            rev = 10 * rev + lastDigit;
            n = n/10;
        }
        return rev;
    }
}
