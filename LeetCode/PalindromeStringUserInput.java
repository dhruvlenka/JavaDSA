import java.util.Scanner;

public class PalindromeStringUserInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String words = input.nextLine();
        String reversed = "";

        for (int i=words.length()-1; i>=0; i--){
            reversed = reversed + words.charAt(i);
        }
        if (words.equals(reversed)){
            System.out.println("Palindrome String");
        }else{
            System.out.println("Sorry, It's not Palindrome String");
        }
    }
}
