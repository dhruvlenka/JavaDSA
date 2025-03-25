package ExceptionHandling;

import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 1st Number: ");
        int n1 = input.nextInt();
        System.out.println("Enter 2nd Number: ");
        int n2 = input.nextInt();

        //exception then it will execute
//        Result.getResult(n1, n2);
//        //terminating:
//        System.exit(0);
//        System.out.println("Exittt");

        try {
            Result.getResult(n1/n2, n1/n2);
        } catch(Exception e) {
            System.out.println(e.getMessage());
            System.out.println("=============");
            e.printStackTrace();
            System.out.println("==============");
        } finally {
            System.out.println("Finally Block Starts.");
            //resource closing the scanner library: terminating all the open session like: netbanking, mobile banking app
            System.out.println(10/0); //exception
            input.close();
            System.out.println("Finally Block Ends.");
        }
        System.out.println("Program Ends");
    }
}
