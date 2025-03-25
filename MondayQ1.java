import java.util.Scanner;

public class MondayQ1 {
    public static void main(String[] args) {
        //Large String or Short String
        Scanner input = new Scanner(System.in);
        System.out.println("Enter First Name = ");
        String firstName = input.nextLine();

        System.out.println("Enter Last Name = ");
        String lastName = input.nextLine();

        System.out.println("Enter Pin Code = ");
        int pinCode = input.nextInt();

        System.out.println("Nth digit = ");
        int nthDigit = input.nextInt();

        String empty = "";
        String p = Integer.toString(pinCode);
        empty += p.charAt(nthDigit-1);
       // empty += p.charAt(p.length()-nthDigit); //formula remember
        StringBuffer reverse = new StringBuffer(p).reverse();
        empty += reverse.charAt(nthDigit-1);

        if(firstName == lastName){
            System.out.println("equal");
        } else {
            lastName = lastName.toLowerCase();
            firstName = firstName.toUpperCase();
            System.out.println("Username = " +lastName.charAt(0) + firstName + empty);
        }
        /*

         */
    }
}