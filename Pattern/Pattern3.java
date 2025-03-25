package Pattern;

import java.util.Scanner;

public class Pattern3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = input.nextInt();

        for(int i=1; i<=n+2; i++){
            for(int j=1; j<=n+3; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
