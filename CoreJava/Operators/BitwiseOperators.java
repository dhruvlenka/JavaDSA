package CoreJava.Operators;

public class BitwiseOperators {
    public static void main(String[] args) {
        int x = 21;
        int y = 18;
        /*
        21 in Binary = 0101
        18 in Binary = 0010
        0101 ^ 0010 = 0111 = 7 will be printed
        */
        System.out.println("x & y = " + (x&y));
        System.out.println("x | y = " + (x|y));
        System.out.println("x ^ y = " +(x^y));
        System.out.println("x << y = " + (x<<y));
        System.out.println("x >> y = " + (x>>y));
        System.out.println("x >>> y = " + (x>>>y));
    }
}
