package CoreJava.ControlFlow.CodingProblems;

public class FibonacciSeries {
    public static void main(String[] args) {
        fibo(5);
    }
    public static int fibo(int num){
        int num1 = 0;
        int num2 = 1;
        int num3;

        System.out.print(num1 + " " + num2);
        for(int i=1; i<=num; i++){
            num3 = num1 + num2;
            System.out.print(" " + num3);

            num1 = num2;
            num2 = num3;
        }
        return num;
    }
}
