package Numbers;

import java.util.Scanner;

public class IncreasingDecreasing {
    public static void main (String[] args) {
        // your code goes here
        Scanner input = new Scanner(System.in);
        int num1, num2, num3;

        num1 = input.nextInt();
        num2 = input.nextInt();
        num3 = input.nextInt();

        if(num1 < num2 && num2 < num3){
            System.out.println("Increasing");
        } else if(num1>num2 && num2 > num3){
            System.out.println("Decreasing");
        } else {
            System.out.println("Neither");
        }

    }
}
