package Pattern;

import java.util.Scanner;

public class TriangleNumberPattern {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = input.nextInt();

        int num = 1;
        int space = n-1;
        for(int i=1; i<=n;i++){
            for(int j=1; j<=space; j++){
                System.out.print("  ");
            }
            for(int j=1; j<=num; j++){
                System.out.print(i + " ");
            }
            num+=2;
            space--;
            System.out.println();
        }
    }
}
