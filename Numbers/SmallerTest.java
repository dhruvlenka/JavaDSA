package Numbers;

import java.util.Scanner;

public class SmallerTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt(); //first input
        int b = input.nextInt(); //second input

        if(a<b) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }
    }
}
