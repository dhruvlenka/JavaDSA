package Numbers;

public class FizzBuzz {
    public static void main(String[] args) {
        int n = 10;
        fizzBuzz(n);
        fizzBuzz2(n);
    }
    public static void fizzBuzz(int n) {
        // Write your code here
        if (n % 3 == 0 && n % 5 == 0) {
            System.out.println("Fizz Buzz");
        } else if (n % 3 == 0) {
            System.out.println("Fizz");
        } else if (n % 5 == 0) {
            System.out.println("Buzz");
        } else {
            System.out.println(n);
        }
    }
    public static void fizzBuzz2(int n) {
        // Write your code here
        for(int i=1; i<=n; i++){
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}
