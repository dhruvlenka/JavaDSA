package Pattern;

import java.util.Scanner;

public class SquareHollowPattern {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = input.nextInt();

        //outer loops: i:  handle the number of rows
        for(int i=1; i<=n; i++) {
            //inner loops: j:  handle the number columns
            for (int j = 1; j <= n; j++) {

               if(i==1 || i==n || j==1 || j==n){
                   System.out.print("* ");
               } else {
                   System.out.print("  ");
               }
            }
            System.out.println();
        }

    }
}
