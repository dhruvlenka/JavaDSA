package GFGArray;

public class SwapKTH {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        int n = 8;
        int k = 3;

        int beginningIndex = k-1; //Index of the first element to swap
        int endIndex = n-k; //Index of the second element to swap

        //Swapping element directly in the array
        int temp = arr[beginningIndex];//first element
        arr[beginningIndex] = arr[endIndex]; // last element
        arr[endIndex] = temp;

        for(int i: arr){
            System.out.print(i + " ");
        }
    }
}
