package Numbers;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter word: ");
        String str = input.nextLine();
        System.out.println(isPalindrome(str));
    }
    //a function defined inside a class
    //or a general block of code that performs a task
    public static boolean isPalindrome(String word){
        String reverse = "";
        int length = word.length();
        for(int i=length-1; i>=0; i--)
            reverse = reverse + word.charAt(i);
            if (word.equals(reverse)){
                return true;
            } else {
                return false;
            }
    }
}
