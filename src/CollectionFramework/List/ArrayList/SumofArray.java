package CollectionFramework.List.ArrayList;

import java.util.ArrayList;

public class SumofArray {
    public static void main(String[] args) {
        ArrayList<Integer> sum =  new ArrayList<>();
        sum.add(10);
        sum.add(20);
        int n = sum.size();
        System.out.println(specialSum(sum, n));
    }

    //recursive method
    public static int sumOfArray(Integer[] num, int n){
        if(n == 0){
            return num[n];
        } else {
            return num[n] + sumOfArray(num, n-1);
        }
    }

    public static int sumOfDigits(int num){
        int sum = 0;
        while (num != 0){
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
    public static int specialSum(ArrayList<Integer> arr, int n ){
        int sum = 0;

        //list to array
        Integer[] array = new Integer[arr.size()];
        arr.toArray(array);

        //we got the sum of the list
       for(int i=0; i<n; i++){
           sum = sumOfArray(array, array.length -1);
       }

       return sumOfDigits(sum);

    }
}
