package Sorting;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {2,4,1,6,9};
        int n = arr.length;

        quickSort(arr, 0, n-1);
        for(int i=0; i<n; i++){
            System.out.println(arr[i]);
        }

    }
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i]= arr[j];
        arr[j] = temp;
    }

    public static int divide(int[] arr, int low, int high){
        int mid = low + (high-low)/2;
        int pivot = arr[mid];

        swap(arr, mid, high);
        int i = low;

        for(int j=low; j<high; j++){
            if(arr[j] < pivot){
                swap(arr, i++, j);
            }
        }
        swap(arr, i, high);
        return i;
    }
    public static void quickSort(int[] arr, int low, int high){
        if(low<high){
            int pivot = divide(arr, low, high);
            quickSort(arr, low, pivot-1);
            quickSort(arr, pivot+1, high);
        }
    }
}
