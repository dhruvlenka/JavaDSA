package CoreJava.Loops;

import java.util.Scanner;

public class CountDigitWhileLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        int count = 0;
        while (n>0){
            count++;

            n = n/10;
        }
        System.out.println(count);
    }
}
