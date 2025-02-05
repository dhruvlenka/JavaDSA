package Searching;

public class LinearSearch2 {
    public static void main(String[] args) {
        int[] arr = {5,7,9,1,3,5};
        int n = arr.length;
        int key = 9;
        for(int i=0; i<n; i++){
            if(arr[i] == key)
                System.out.println(key + " is in the list.");
        }
    }
}
