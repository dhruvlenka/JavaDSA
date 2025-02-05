package ArrayQuestions;

public class CountOfSmallerElements {
    public static void main(String[] args) {
        long[] arr = {1, 2, 2, 2, 5, 7, 9};
        long n = arr.length;
        long x = 2;
        long result = countOfElements(arr,n,x);
        System.out.println(result);
    }
    public static long countOfElements(long[] arr, long n, long x){
        int count = 0;
        for(int i=0; i<n; i++){
            if(arr[i] <= x){
                count++;
            }
        }
        return count;
    }
}
