package Pattern;

import java.util.Scanner;

public class EPattern {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a numner: ");
        int n = input.nextInt();

        int mid = n/2+1;
        for(int i=1;i<=n;i++){
            for(int j=1; j<=n; j++){
                if(i==1 || i==n || i==mid || j==1){
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
