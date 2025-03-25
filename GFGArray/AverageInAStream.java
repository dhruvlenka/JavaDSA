package GFGArray;


import java.util.Arrays;

public class AverageInAStream {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50};
        int n = array.length;
        float[] ans = streamAvg(array,n);
        System.out.println(Arrays.toString(ans));

    }
    public static float[] streamAvg(int[] arr, int n) {
        float[] ans = new float[n];
        float sum = 0;
        float average = 0.0F;

        for(int i=0; i<n; i++){
            sum += arr[i];
            average = sum / (i+1);
            ans[i] = average;
        }
        return ans;
    }
}
