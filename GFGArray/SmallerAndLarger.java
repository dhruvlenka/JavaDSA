package GFGArray;

import java.util.Arrays;

public class SmallerAndLarger {
    public static void main(String[] args) {
        int[] arr = {1,2,8,10,11,12,19};
        int n = arr.length;
        int x = 0;
        int[] result = getMoreAndLess(arr,n,x);
        System.out.println(Arrays.toString(result));

        System.out.println();

        int[] arr2 = {1, 2, 8, 10, 11, 12, 19};
        int n2 = arr2.length;
        int x2 = 5;
        int[] result2 = getMoreAndLess(arr2,n2,x2);
        System.out.println(Arrays.toString(result2));


    }
    public static int[] getMoreAndLess(int[] arr, int n, int x) {
        int smallerCount = 0;
        int largerCount = 0;

        for(int i=0; i<n; i++){
            if(arr[i] <= x){
                smallerCount++;
            }
            if(arr[i] >= x){
                largerCount++;
            }
        }
        int[] counts = {smallerCount, largerCount};
        return counts;
    }

    public static void smallerLarger(int[] arr, int n, int x) {
        int smallerCount = 0;
        int largerCount = 0;

        for(int i=0; i<n; i++){
            if(arr[i] <= x){
                smallerCount++;
            }
            System.out.println(smallerCount);
            if(arr[i] >= x){
                largerCount++;
            }
            System.out.println(largerCount);
        }

    }
}
