package CoreJava.InputOutput;

import java.util.Scanner;

public class InputProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Name: ");
        String str = sc.nextLine();
        System.out.println("Your Name is now saved in out database: "+ str);
    }
}
