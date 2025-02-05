package Numbers;

public class Palindrome_Number {
    public static void main(String[] args) {
        int temp, rem, count = 0;
        int num = 111;
        temp = num; //Value Storing in temp var for practical basics

        while (num > 0){
            rem = num % 10;
            count = count * 10 + rem;
            num = num / 10;
        }
        if(temp == count){
            System.out.print(temp + " is Palindrome Number");
        } else {
            System.out.print(temp + " is not a Palindrome Number");
        }

        System.out.println();

        int num2 = 555;
        int result = isPalindrome(num2);
        System.out.println(result);
    }

    //Palindrome Method
    public static int isPalindrome(int num){
        int temp, rem, count = 0;
        temp = num; //coping num values to temporary variable

        while (num > 0){
            rem = num % 10;
            count = count * 10 + rem;
            num = num / 10;
        }
        if (temp == count){
            return 1;
        }
        else {
            return -1;
        }
    }
}
