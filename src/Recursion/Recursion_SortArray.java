package Recursion;

//Bubble Sort
public class Recursion_SortArray {
    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static void sortArray(int[] arr, int n){
        //base case
        if(n == 0 || n == 1){
            return;
        }
        for(int i=0; i<n-1; i++){
            if(arr[i] > arr[i+1]){
                swap(arr, i, i+1);
            }
        }
        sortArray(arr, n-1);
    }

    public static void main(String[] args) {
        int[] arr = {2,5,1,6,9};
        sortArray(arr,5);
        for(int i=0; i<5; i++){
            System.out.println(arr[i]);
        }
    }
}
