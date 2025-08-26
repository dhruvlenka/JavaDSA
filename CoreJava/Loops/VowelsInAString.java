package CoreJava.Loops;

import java.util.Scanner;

public class VowelsInAString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char c = input.next().charAt(0);

        if (Character.isLowerCase(c)){
            switch(c){
                    case 'a':
                        System.out.println("Vowel");
                        break;
                    case 'e':
                        System.out.println("Vowel");
                        break;
                    case 'i':
                        System.out.println("Vowel");
                        break;
                    case 'o':
                        System.out.println("Vowel");
                        break;
                    case 'u':
                        System.out.println("Vowel");
                        break;
                    default:
                        System.out.println("Consonant");
                }
        } else {
            System.out.println("Please enter a lowercase character only.");
        }
    }
}
