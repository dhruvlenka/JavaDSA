package CoreJava.Operators.Questions;

public class LeapYearUsingTernaryOperator {
    public static void main(String[] args) {
        int year = 1999;
        String leapYear = (year %4 ==0 ? "Leap Year"
                : year%100 ==0 ? "Leap Year"
                : year%400 ==0 ? "Leap Year"
                : "Not a Leap Year");

        System.out.println(leapYear);

    }
}
