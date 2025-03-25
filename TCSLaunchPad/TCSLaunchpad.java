package TCSLaunchPad;

import java.text.DecimalFormat;
import java.util.Scanner;

public class TCSLaunchpad {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Age: ");
        int age = input.nextInt();
        input.nextLine();
        /*
        Whenever, you want to use String value before the numeric one
        in Scanner class, you have to use above code, if you don't use
        it wil give compilation error "InputMismatchException".
         */
        System.out.println("Enter name: ");
        String name = input.nextLine();
        System.out.println("Enter enrollment: ");
        String enrollment = input.nextLine();
        System.out.println("Enter Gender: ");
        String gender = input.nextLine();
        System.out.println("Enter first Character of Student Name:");
        char firstAlpha = input.next().charAt(0);
        System.out.println("Enter Subject 1 Marks: ");
        float marks1 = input.nextFloat();
        System.out.println("Enter Subject 2 Marks: ");
        float marks2 = input.nextFloat();
        System.out.println("Enter Subject 3 Marks: ");
        float marks3 = input.nextFloat();
        System.out.println("Enter Subject 4 Marks: ");
        float marks4 = input.nextFloat();
        System.out.println("Enter Subject 5 Marks: ");
        float marks5 = input.nextFloat();
        System.out.println("Is Student is Active ? ");
        boolean isStudentActive = input.nextBoolean();
        System.out.println( );
        double totalMarks = marks1 + marks2 + marks3 + marks4 + marks5;
        float totalMarks2 = marks1 + marks2 + marks3 + marks4 + marks5;
        System.out.println("Total result in Double: " + totalMarks);
        System.out.println("Total result in Float: " + totalMarks2);

        //printing in single line
        System.out.println(age +" " + name + " " + enrollment + " " + firstAlpha + " " + gender + " " + totalMarks2 + " " + isStudentActive);
        //printing in different line
        System.out.println(age + "\n" + name + "\n" + enrollment + "\n" + gender + "\n" + totalMarks + "\n"
        + isStudentActive + "\n");

        //String format
        String s1 = String.format("%.2f",totalMarks);
        System.out.println("Round off: " + s1);
        //directly way to print
        System.out.format("Round off % .2f", totalMarks);
        System.out.format("Round off % .2f", totalMarks2);
        System.out.println();

        double x =  98.765;
        DecimalFormat dc = new DecimalFormat("#.#");
        System.out.println(dc.format(x));

    }
}
