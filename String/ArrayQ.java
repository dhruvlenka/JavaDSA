package String;

import java.util.ArrayList;

public class ArrayQ {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};

        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();

        int[] evenArray = {};
        int[] oddArray = {};

        int evenSum = 0;
        int oddSum = 0;

        System.out.println("Even");
        for(int i=0; i<arr.length; i++){
            if(arr[i] % 2 == 0){
                even.add(arr[i]);
                evenSum += arr[i];
            }
        }

        for(int i=0;i<arr.length; i++){
            if(arr[i] % 2 == 1){
                odd.add(arr[i]);
                oddSum += arr[i];
            }
        }

        System.out.println("Even: " +even);
        System.out.println("Odd: "+odd);

        System.out.println("Sum of Even: " + evenSum);
        System.out.println("Sum of Odd: " + oddSum);
    }
}
