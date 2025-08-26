package Array;

import java.util.Scanner;

public class AverageScorePassing {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        //taking class score as input
        int[] scores = new int[n];
        for(int i=0; i<n; i++){
            scores[i] = input.nextInt();
        }

        //sum of the scores
        int sum = 0;
        for(int i=0; i<scores.length; i++){
            sum  = sum + scores[i];
        }

        //average of the scores
        int average = sum/n;
        for (int i=0; i<scores.length; i++){
            if (scores[i] >= average){
                System.out.println(scores[i]);
            }
        }
    }
}
