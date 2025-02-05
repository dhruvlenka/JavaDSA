package Recursion;

public class Recursion_MergeSort {
   static void merge(int[] arr, int start, int end){
        //finding the mid
        int mid = start + (end-start)/2;

        //length
        int len1 = mid-start + 1; //start to mid
        int len2 = end-mid; //mid to end

        //creating new array
        int[] firstArray = new int[len1];
        int[] secondArray = new int[len2];

        //copying values from start to mid
        int mainArrayIndex = start;
        for(int i=0; i<len1; i++){
            firstArray[i] = arr[mainArrayIndex++];
        }

        //copying values from mid+1 to end
        mainArrayIndex = mid+1;
        for(int i=0; i<len2; i++){
            secondArray[i] = arr[mainArrayIndex++];
        }

        //merge two sorted array
        int index1 = 0;
        int index2 = 0;
        mainArrayIndex = start;

        while (index1 < len1 && index2 < len2){
            if(firstArray[index1] < secondArray[index2]){
                arr[mainArrayIndex++] = firstArray[index1++];
            } else {
                arr[mainArrayIndex++] = secondArray[index2++];
            }
        }

        while (index1 < len1){
            arr[mainArrayIndex++] = firstArray[index1++];
        }

        while (index2 < len2){
            arr[mainArrayIndex++] = secondArray[index2++];
        }
    }

    static void mergeSort(int[] arr, int start, int end){
        //base case
        if(start >= end){
            return;
        }
        int mid = start + (end-start)/2;
        mergeSort(arr, start, mid);         //sorting the left part
        mergeSort(arr, mid+1, end);  //sorting the right part
        merge(arr,start,end); //merge
    }

    public static void main(String[] args) {
        int[] arr = {2,5,1,6,9};
        int num = 5;

        mergeSort(arr, 0, num-1);
        for(int i=0; i<num; i++){
            System.out.println(arr[i] + " ");
        }
    }
}
