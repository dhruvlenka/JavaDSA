package Pattern;

import java.util.Scanner;

public class SquareHollowPattern2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = input.nextInt();

        for(int i=1; i<=n; i++) {
            for (int j = 1; j <= n; j++) {
                //we can write as: i<=2 and j<=2
                if(i==1 || i ==2 || i==n || i== n-1 || j==1 || j==2 || j==n || j==n-1){
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
