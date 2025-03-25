package Pattern;

import java.util.Scanner;

public class PatternPrintF {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = input.nextInt();

        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++) {
                System.out.printf("%3d", i); //%d: integers
            }
            System.out.println();
        }
    }
}
