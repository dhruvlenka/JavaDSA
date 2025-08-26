package CoreJava.Operators.Questions;

public class EvenPositive {
    public static void main(String[] args) {
        int a = 40;
        if(a%2 == 0 && a > 0){
            System.out.println("The number is even and positive.");
        } else {
            System.out.println("The number is not even but it's positive.");
        }
    }
}
