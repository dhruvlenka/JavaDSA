package ArrayQuestions;

public class SumOfArrayElements {
    public static void main(String[] args) {
        int sum=0;
        int[] arr = {12, 18, 10, 17, 15, 20};
        for(int i=0; i<arr.length; i++){
            sum = sum + arr[i];
        }
        System.out.println(sum);

    }

    public static int sumElement(int[] arr, int n) {
        int res = 0;
        for(int i=0; i<n; i++){
            res = res + arr[i]; //adding the current element to the sum
        }
        return res;
        /*
        Where:
        'n' represents the size or length of the integer array arr.
         It specifies the number of elements in the array. The 'n'
         parameter is passed to the sumElement() function to
         indicate the size of the array. This information can be
         useful in some scenarios where you want to ensure that you
         iterate through all the elements of the array without
         going out of bounds.
         */
    }

    //sol: 2
    public static int sumElement2(int[] arr, int n){
        int res = 0;
        for(int i=0; i<=arr.length-1; i++){
            res += arr[i];
        }
        return res;
        /* we did not used 'n': size of the array var. */
    }

    //function without knowing the size of the array
    public static int sumElement3(int[] arr){
        int res = 0;
        for(int i=0; i<=arr.length-1; i++){
            res += arr[i];
        }
        return res;
    }

    public static long getSum(long a[], long n){
        long res = 0;
        for(int i = 0; i<n; i++){
            res += a[i];
        }
        return res;
    }
}
