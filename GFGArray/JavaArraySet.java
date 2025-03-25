package GFGArray;

import java.text.DecimalFormat;

public class JavaArraySet {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int n = arr.length;
        String res = average(arr, n);
        System.out.println(res);
    }

    //Using Decimal Format
   public static String average(int[] A, int N) {
        int sum = 0;
        double average = 0.00;
        for(int i=0; i<N; i++) {
            sum += A[i];
            average = sum / (double) N;
        }
        //Using Decimal Format
       DecimalFormat df = new DecimalFormat("0.00");
        return df.format(average);

        //Way 2
       /*
        String formattedAverage = df.format(average);
        return formattedAverage;
        */
    }

    //Using String formatter
    public static String average2(int[] A, int N) {
        int sum = 0;
        double average = 0.00;
        for(int i=0; i<N; i++) {
            sum += A[i];
            average = sum / (double) N;
        }
        String formattedAverage = String.format("%.2f", average);
        return formattedAverage;
    }
}
