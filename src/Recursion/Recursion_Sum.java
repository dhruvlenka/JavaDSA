package Recursion;
import java.util.Arrays;

public class Recursion_Sum {
    public static void main(String[] args) {
        int[] arr = {1,3,5,2,6};
        int size = 5;

        System.out.println(getSUM(arr,size));

        System.out.println("==================");
        int n = 12;
        System.out.println("Sum upto " + n + " = " + getSum(n));


        System.out.println("===================");
        System.out.println("Sum of digits: " + digitSum(n));
    }
    public static int getSum(int n){
        if(n>1){
            return n+getSum(n-1);
        } else {
            return n;
        }
    }
    public static int digitSum(int n){
        if(n>0){
            return n%10+getSum(n/10);
        } else {
            return 0;
        }
    }
    static int getSUM(int[] arr, int size){
        if(size == 0) {
            return 0;
        }
        if(size == 1){
            return arr[0];
        }
        // sum = sum/10;
        int remainingPart = getSUM(Arrays.copyOfRange(arr,1,size), size-1);
        return arr[0] + remainingPart;

    }
}
