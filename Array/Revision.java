package Array;

public class Revision {
    public static void main(String[] args) {
        int[] arr = {10,9,5,1,16,20,25,14};
        int max = 0;
        int min = 99999;

        //finding the max
        for(int i=0; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("Maximum Value from the array: "+max);

        //finding the min
        for(int i=0; i<arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("Minimum Value from the array: "+ min);

        //average
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            sum = sum + arr[i];
        }
        System.out.println("Average: " + sum/arr.length);
    }
}
