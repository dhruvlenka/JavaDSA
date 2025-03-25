package Searching;

public class BinarySearch {
    public static void main(String[] args) {
       int[] array = {14,15,18,22,25};
       int target = 22;
       int find = binarySearch(array,target);
        System.out.println(find);

    }
    public static int binarySearch(int[] array, int target){
        int low = 0;
        int high = array.length-1;

        while (low <= high){
            //finding mid 
            int mid = low + (high-low)/2;
            if (target == array[mid]){
                return mid;
            } else if (target > array[mid]){
                low = mid+1;
            }else {
                high = mid-1;
            }
        }
        return -1;
    }
}
