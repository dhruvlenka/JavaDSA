package Recursion;

//Binary search implementation using Recursion
public class Recursion_BinarySearch {
    public static void main(String[] args) {
        int[] arr = {2,4,6,10,14,18,22,38,49,55,222};
        int key = 222;

        System.out.println(key +" is Present or not? " + binarySearch(arr, 0, 10, key) + " it's in the array.");
    }
    static void print(int[] arr, int s, int e){
        for(int i=s; i<=e; i++) {
            System.out.println("Recursion Call: " + arr[i] + " ");
        }
    }
    static boolean binarySearch(int[] arr, int start, int end, int key){
        //base case: element not found
        if(start > end){
            return false;
        }

        //finding mid
        int mid = start + (end-start)/2;
        System.out.println("Array Mid: " + arr[mid]);

        //base case: element found
        if(arr[mid] == key){
            return true;
        }

        if(arr[mid] < key){
            return binarySearch(arr,mid+1, end, key);
        } else {
            return binarySearch(arr, start, mid-1, key);
        }
    }
}
