package Recursion;

public class Recursion_QuickSort {
    public static void main(String[] args) {
        int[] arr = {2,4,1,6,9};
        int n = 5;

        System.out.println("Sorting Using Recursion");
        quickSort(arr, 0, n-1);
        for(int i=0; i<n; i++){
            System.out.println(arr[i] + " ");
        }

        System.out.println("Sorting Without Recursion");
        partition(arr, 0, n-1);
        for(int i=0; i<n; i++){
            System.out.println(arr[i] + " ");
        }
    }
    //swapping
    static void swap(int[] arr, int start, int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }

    static int partition(int[] arr, int start, int end){
        int pivot = arr[start];

        //counting the number which are smaller than pivot
        int count = 0;
        for(int i=start+1; i<=end; i++){
            if (arr[i] <= pivot){
                count++;
            }
        }

        //right place of the index: pivotIndex
        int pivotIndex = start + count;
        swap(arr, pivotIndex, start); //first: we put the pivot at the right place

        //left and right part
        int i = start;
        int j = end;
        while (i < pivotIndex && j > pivotIndex){
            while (arr[i] < pivot){
                i++;
            }

            while (arr[j] > pivot){
                j--;
            }
            //again checking
            if(i < pivotIndex && j > pivotIndex){
                swap(arr, i++, j--);
            }
        }

        return pivotIndex;

    }
    //recursion
    static void quickSort(int[] arr, int start, int end){
        //base case: if array is 0 and 1 then we assume array is sorted.
        if(start >= end){
            return;
        }

        //partition
        int pivot = partition(arr, start, end);

        //sorting the left part
        quickSort(arr, start, pivot-1);

        //sorting the right part
        quickSort(arr, pivot+1, end);

    }
}
