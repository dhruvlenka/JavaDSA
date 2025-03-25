package CoreJava.ControlStatements.WhileLoop;

import java.util.Scanner;

// using while loop
public class isPalindrone {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string = ");
        String str = input.nextLine();

     //   System.out.println(isPalindrome(str));
        if(isPalindrome(str)){
            System.out.println("Palindrome String.");
        } else {
            System.out.println("Not a Palindrome String");
        }
    }
    public static boolean isPalindrome(String str){
        String reverse = "";
        int i=0;
        while (i<str.length()) {
            reverse = str.charAt(i) + reverse;
            i++;
        }
        if(str.equals(reverse)) {
            return true;
        } else if(str.equalsIgnoreCase(reverse)){
            return true;
        } else {
            return false;
        }
    }
    public static boolean isPalindrome2(String str){
        str.toLowerCase();
        int mid = str.length()/2;
        int i=0;
        while (i<mid) {
            if (!(str.charAt(i) == str.charAt(str.length() - 1  - i))) {
                return false;
            }
            i++;
        }
        return true;
    }
}
