package Sorting;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {30,40,50,70,90,100};
        int[] arr2 = {10,20,30,40,50,60};
        bubbleSort(arr);
        for(int a: arr){
            System.out.println(a);
        }
    }

    public static void bubbleSort(int[] arr){
        int n = arr.length;
        for(int i=0; i<n; i++){
            int x = 0; //case if the array is already sorted
            for(int j=0; j<n-1-i; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    x++;
                }
                if(x==0){
                    break;
                }
            }

        }
    }
    public static void bubbleSort2(int[] arr){
        for(int i=0; i<arr.length-1; i++){
            for(int j=1; j<arr.length-1; j++){
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;

                }
            }
        }
    }
}
