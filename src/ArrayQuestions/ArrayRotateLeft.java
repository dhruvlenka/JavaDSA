package ArrayQuestions;

public class ArrayRotateLeft {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        int k = 3;
        k = k % arr.length;
        System.out.println(k);

        arrayRotate(arr,0,arr.length-1); //reverse
        arrayRotate(arr,0, arr.length-k-1); //till target
        arrayRotate(arr, arr.length-k, arr.length-1);

        for(int a: arr){
            System.out.print(a + " ");
        }
    }
    //with swapping/reverse
    public static void arrayRotate(int[] arr, int start, int end){
        while (start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    //with two loops
    public static void arrayKTimesRotation(int[] arr, int k){
        for(int j=1; j<=k; j++){
            int temp = arr[arr.length-1];
            for(int i=arr.length-2; i>=0; i--){
                arr[i+1] = arr[i];
            }
            arr[0] = temp;
        }
    }
}
