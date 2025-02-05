package Recursion;

import java.util.Arrays;

public class Recursion_BinarySearch2 {
    static boolean isSorted(int[] arr, int size) {
        //base case
        if (size == 0 || size == 1) {
            return true;
        }
        if (arr[0] > arr[1]) {
            return false;
        }
        //Recursively checking the rest of the array
        return isSorted(Arrays.copyOfRange(arr, 1, size), size - 1);
    }

    public static void main(String[] args) {
        int[] arr = {2,5,6,7,8,1};
        int size = 6;

        boolean ans =  isSorted(arr, size);
        if(ans){
            System.out.println("Array is Sorted");
        } else{
            System.out.println("Array is not Sorted.");
        }
    }
}
