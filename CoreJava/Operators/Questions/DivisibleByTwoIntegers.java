package CoreJava.Operators.Questions;

public class DivisibleByTwoIntegers {
    public static void main(String[] args) {
        int number = 15;
        if(number%3 == 0 && number%5 ==0){
            System.out.println("Yes the number is divisible by 3 and 5.");
        } else {
            System.out.println("No, the number is not divisible by 3 and 5.");
        }
    }
}
