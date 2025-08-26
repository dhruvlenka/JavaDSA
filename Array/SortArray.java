package Array;

import java.util.Arrays;
import java.util.Scanner;

public class SortArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        int maxGap = 0;

        //reading a list of scores
        int[] numbers = new int[n];
        for (int i=0; i<n; i++){
            numbers[i] = input.nextInt();
        }

        //sorting array
        Arrays.sort(numbers);

        //finding the largest difference btw any two adjacent scores, and
        for (int i=0; i<numbers.length-1; i++){
            int gap = Math.abs(numbers[i] - numbers[i+1]);
            if (gap > maxGap){
                maxGap = gap;
            }
        }
        System.out.println(maxGap);
    }
}
