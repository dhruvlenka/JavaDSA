package ArrayQuestions;

public class ArrayRotate {
    public static void main(String[] args) {
        int[] arr = {10,15,12,18,20,17,19};
        int k = 3;
        arrayRotate1(arr);
    }
    public static void arrayRotate1(int[] arr){
                   //last element will store:19
        int temp = arr[arr.length-1];
                //17
        for(int i=arr.length-2; i>=0; i--){

            arr[i+1] = arr[i];
        }
        arr[0] = temp;
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
