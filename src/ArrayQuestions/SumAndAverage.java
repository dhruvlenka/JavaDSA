package ArrayQuestions;

public class SumAndAverage {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int n = arr.length;
        String answer = average(arr,n);
        System.out.println(answer);

    }
   public static String average(int[] A, int N) {
       int sum = 0;
       String result;
       for (int i = 0; i < N; i++) {
           sum += A[i];
       }
       //fnding average
       double average = (double) sum / N;

       String sumStr = Integer.toString(sum);
       String averageStr = String.format("%.2f", average);

       result = sumStr + " " + averageStr;
       return result;
   }
}
