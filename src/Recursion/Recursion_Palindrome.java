package Recursion;

import java.util.Scanner;

//Palindrome: a number or string who same after reverse like 121 or TENET.
public class Recursion_Palindrome {
    public static void main(String[] args) {
//        String name = "TENET";
//
//        boolean isPalindrome = checkPalindrome(name, 0, name.length()-1);
//        if(isPalindrome){
//            System.out.println(name + " is Palindrome.");
//        } else {
//            System.out.println(name + " is not Palindrome.");
//        }

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = input.nextInt();

        int rev = 0;
        reverse(n);
        if(n==rev){
            System.out.println("Palindrome.");
        } else {
            System.out.println("Not a Palindrome.");
        }
    }
    public static void reverse(int n){
        int rev = 0;

        if(n>0){
            rev = 10*rev+n/10;
            reverse(n/10);

        }
    }
    static boolean checkPalindrome(String str, int i, int j){
        //base case: if i surpass j
        if (i > j){
            return true;
        }
        //if first character not equal to last character
        if(str.charAt(i) != str.charAt(j)){
            return false;
        } else {
            return checkPalindrome(str, i+1, j-1);
        }
    }
}
