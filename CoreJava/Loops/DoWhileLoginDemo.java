package CoreJava.Loops;

import java.util.Scanner;

public class DoWhileLoginDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String password;
        String correctPassword = "Jack@2025";
        int count = 0;

        do {
            System.out.println("Enter your password : ");
            password = input.nextLine();

            if (!password.equals(correctPassword)) {
                System.out.println("Incorrect password. Try again.");
                count++;
                if (count == 3) {
                    System.out.println("You have entered 3 incorrect password. You are locked out.");
                    break;
                }
            }
        } while (!password.equals(correctPassword));
        if(password.equals(correctPassword)){
            System.out.println("You are logged in successfully.");
        }


    }
}
