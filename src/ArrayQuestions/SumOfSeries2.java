package ArrayQuestions;

public class SumOfSeries2 {
    public static void main(String[] args) {
        long sum = seriesSum(5);
        System.out.println(sum);

        long sum2 = sumOfSeries(5);
        System.out.println(sum2);
    }
    //Optimizing the code
   public static long seriesSum(int n) {
        //closed-form formula
        return (long)n * (n+1) / 2;
    }

    //solving sum of series using a function
    public static long sumOfSeries(int num){
        int sum = 0;
        for(int i = 1; i<=num; i++){
            sum += i;
        }
        return sum;
    }
}
