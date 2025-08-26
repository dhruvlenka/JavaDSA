package CoreJava.Operators.Questions;

public class MaxOfThreeNum {
    public static void main(String[] args) {
        int num1 = 95;
        int num2 = 80;
        int num3 = 150;

        int max = (num1>num2) ? ((num1>num3) ? num1: num3) : ((num2>num3) ? num2 : num3);
        System.out.println(max);
    }
}
