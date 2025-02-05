package String;

public class IntegerToWord {
    public static void main(String[] args) {
        long number = 1234;
        System.out.println(handleAll(number));

        long number2 = 45821;
        System.out.println(handleAll(number2));

        long number3 = 555093;
        System.out.println(handleAll(number3));

        long number4 = 99999;
        System.out.println(handleAll(number4));
    }
    public static String handleAll(long n) {
        //Write your code here
        String[] unique = {"", "one", "two", "three","four", "five", "six", "seven", "eight", "nine", "ten",
                "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};

        String[] tens = {"", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninty"};

        if (n >= 0 && n < 20) {
            return unique[(int) n];
        }
        if (n < 100) {
            return tens[(int) (n / 10)] + (n % 10 != 0 ? "" : "") + unique[(int) (n % 10)];
        }
        if (n < 1000) {
            return handleAll(n / 100) + " hundred" + (n % 100 != 0 ? " and " : "") + handleAll(n % 100);
        }
        if (n < 100000) {
            return handleAll(n / 1000) + " thousand" + (n % 1000 != 0 ? " " : "") + (n % 1000 < 100 ? "and " : "") +  handleAll(n % 1000);
        }
        if (n < 10000000) {
            return handleAll(n / 100000) + " lakh" + (n % 100000 != 0 ? " " : "") + handleAll(n % 100000);
        }
        if (n < 1000000000) {
            return handleAll(n / 10000000) + " crore" + (n % 10000000 != 0 ? " " : "") + handleAll(n % 10000000);
        }

        return "";
    }
}
