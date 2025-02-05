package ArrayQuestions;

import java.util.Scanner;
public class SumOfSeries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = input.nextInt();
        int sum = 0;
        for(int i = 1; i <= num; i++) {
            sum += i;
            System.out.println(i);
        }
        System.out.printf("Sum: " + sum);
        System.out.println();
    }
}
