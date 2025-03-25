package Sorting;

public class MergeSortJQ {
    public static void main(String[] args) {

    }
    public static void merge(int[] arr, int start, int mid, int end){
        int[] merged = new int[end-start+1];
        int left = start;
        int right = mid+1;
        int x = 0;

        while (left <= mid && right <=end ){
            if(arr[left] <= arr[right]){
                merged[x++] = arr[left++];
            } else {
                merged[x++] = arr[right++];
            }
        }

        //if left
        while (left <= mid){
            merged[x++] = arr[left++];
        }

        //right
        while (right <= end){
            merged[x++] = arr[right++];
        }

        for(int i=0, j=start; i<merged.length; i++, j++){
            arr[j] = merged[i];
        }
    }
    public static void divide(int[] arr, int start, int end){
        if(start < end){
            int mid = start + (end-start)/2;
            divide(arr, start, mid);
            divide(arr, mid+1, end);
            merge(arr, start, mid, end);
        }
    }
}
