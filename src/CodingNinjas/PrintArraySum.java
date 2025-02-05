package CodingNinjas;

import java.util.Scanner;

public class PrintArraySum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter size of the element: ");
        int N  = input.nextInt();

        //array
        int[] arr = new int[N];
        System.out.println("Enter elements: ");
        for(int i=0; i<N; i++){
            arr[i] = input.nextByte();
        }

        //sum
        long sum = 0;
        for (int i=0; i<N; i++){
            sum += arr[i];
        }
        System.out.println(sum);
    }
}
