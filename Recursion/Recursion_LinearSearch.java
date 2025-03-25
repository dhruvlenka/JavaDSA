package Recursion;

import java.util.Arrays;

public class Recursion_LinearSearch {

   static void print(int[] arr, int size){
        System.out.println("Size of the array: " + size);

        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }

    static boolean search(int[] arr, int key, int size){
        print(arr, size);
        //base case
        if(size == 0){ // if array is empty, and if the element is not found
            return false;
        }
        if(arr[0] == key){
            return true;
        } else {
            return search(Arrays.copyOfRange(arr, 1, size), key, size-1);
        }
    }
    public static void main(String[] args) {
        int[] arr = {3,5,1,2,6};
        int key = 7;
        int size = 5;

        boolean ans = search(arr, key, size);
        if (ans){
            System.out.println("Key Found in the Array.");
        } else {
            System.out.println("Key is not in the Array.");
        }
    }
}
