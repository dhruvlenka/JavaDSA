package Array;

import java.util.Scanner;

public class NegativeReplaceWithZero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        int[] numbers = new int[n];
        for(int i=0; i<n; i++){
            numbers[i] = input.nextInt();
        }
        for (int i=0; i<numbers.length; i++){
            if (numbers[i] < 0){
                numbers[i] = 0;
            }
        }
        for (int num: numbers){
            System.out.println(num);
        }
    }
}
