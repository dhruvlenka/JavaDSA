package Pattern;

import java.util.Scanner;

public class Pattern6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = input.nextInt();

        for(int i=1; i<=n; i++) {
            for (int j = 1; j <= n; j++) {
                //same rows
                System.out.print(j % 2 + " ");
            }
            System.out.println();
        }
    }
}
