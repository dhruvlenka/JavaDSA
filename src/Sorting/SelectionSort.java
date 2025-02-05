package Sorting;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {18,15,19,20,10,17,21};
        selectionSort(arr);
        for(int a: arr){
            System.out.println(a);
        }
    }
    public static void selectionSort(int[] arr){
        int n = arr.length;
        for(int i=0; i<n-1; i++){
            int min = arr[i];
            int ind = i;
            for(int j=i+1; j<n; j++){
                if(arr[j] < min){
                    min  = arr[j];
                    ind = j;
                }
            }
            arr[ind] = arr[i];
            arr[i] = min;
        }
    }
}
