package Pattern;

import java.util.Scanner;

public class VPattern {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = input.nextInt();

        int sst=1;
        int est=2*n-1;

        for(int i=1; i<=n; i++){
            for(int j=1; j<=est; j++){
                if(j==sst || j==est){ //j comes from last
                    System.out.print("* ");
                } else {
                    System.out.print(" ");
                }
            }
            sst++;
            est--;
            System.out.println();
        }
    }
}
