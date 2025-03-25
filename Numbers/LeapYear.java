package Numbers;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("Enter a Year: ");
        if(num == 2000){
            System.out.println("Leap YEAR");
            System.out.println("Hello World");
        }
    }
}
