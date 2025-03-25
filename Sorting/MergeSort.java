package Sorting;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {14,7,3,12,9,11,6,2};
        //length of the array
        int len = arr.length;
        System.out.println("Original Array: " + Arrays.toString(arr));
        divide(arr,0, len-1);
        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }

    public static void merge(int[] array, int low, int mid, int high){
        ArrayList<Integer> temp = new ArrayList<>(); //temporary array
        int left = low; //index of left half of array
        int right = mid+1; //index of right half of array

        //storing elements in the temporary array in a sorted manner
        while(left <= mid && right <= high){
            if (array[left] <= array[right]){
                temp.add(array[left]);
                left++;
            } else {
                temp.add(array[right]);
                right++;
            }
        }

        //if elements on the left half are still left
        while (left <= mid) {
            temp.add(array[left]);
            left++;
        }

        //if elements on the right half are still left
        while (right <= high){
            System.out.println("High: "+ high);
            temp.add(array[right]);
            right++;
        }

        System.out.println("Content of the Array List: ");
        System.out.println(temp);
        for(Integer ele: temp){
            System.out.println(ele);
        }

        // transferring all elements from temporary to array
        for(int i= low; i<= high; i++){
            array[i] = temp.get(i - low);
        }
    }

    //dividing
    public static void divide(int[] array, int start, int end){
        if(start >= end) { //start<end
            return;
        }
        int mid = (start + end) / 2; // we can also write start + (end - start) /2;

        //Recursively sorting the left and right halves
        divide(array, start, mid); //left halves: start, ending: mid
        divide(array, mid+1, end); //right halves: end: mid+1: end
        merge(array, start, mid, end);
    }
}
