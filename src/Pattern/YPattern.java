package Pattern;

import java.util.Scanner;

public class YPattern {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = input.nextInt();

        int start = 1;
        int end = n;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=end; j++){
                if(j==start || j==end){
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            start++;
            end--;
            System.out.println();
        }

    }
}
