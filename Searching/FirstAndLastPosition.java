package Searching;

public class FirstAndLastPosition {
    public static void main(String[] args) {
        int[] arr = {0, 0, 1, 1, 2, 2, 2, 2};
        int n = arr.length;
        int key = 2;
        int firstOcc = firstOccurence(arr,n,key);
        System.out.println(firstOcc);
        int lastOcc = lastOccurence(arr,n,key);
        System.out.println(lastOcc);


    }
    public static int firstOccurence(int[] arr, int n, int key) {
        int start = 0, end = n-1;
        int mid = (start + end) / 2;
        int ans = -1;

        while (start <= end) {
            if (arr[mid] == key) {
                ans = mid;
                end = mid - 1;
            }
            else if (key > arr[mid]) {
                start = mid + 1;
            }
            else if (key < arr[mid]) {
                end = mid - 1;
            }
            mid = start + (end - start) / 2;
        }
        return ans;
    }
    public static int lastOccurence(int[] arr, int n, int key) {
        int start = 0, end = n-1;
        int mid = (start + end) / 2;
        int ans = -1;

        while (start <= end) {
            if (arr[mid] == key) {
                ans = mid;
                start = mid + 1;
            }
            else if (key > arr[mid]) {
                start = mid + 1;
            }
            else if (key < arr[mid]) {
                end = mid - 1;
            }
            mid = start + (end - start) / 2;
        }
        return ans;
    }
}
