package Numbers;

public class FibonacciSeries {
    static void fibonacci(int num){
        int num1 = 0;
        int num2 = 1;
        int num3;
        System.out.println(num1 + " " + num2);

        for(int i = 2; i<num; i++){
            num3 = num1 + num2;
            System.out.print(" " + num3);

            num1 = num2;
            num2 = num3;
        }

    }

    public static void main(String[] args) {
//        int number1 = 0;
//        int number2 = 1;
//        int number3, count = 20;
//        System.out.print(number1 + " " + number2);
//
//        for (int i = 2; i < count; i++) {
//            number3 = number1 + number2;
//            System.out.print(" " + number3);
//
//            number1 = number2;
//            number2 = number3;
//
//        }

        fibonacci(25);
    }
}
