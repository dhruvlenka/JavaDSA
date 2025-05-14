package CoreJava.Loops;

import java.util.Scanner;

public class TableProgram2 {
    public static void main(String[] args) {
        Scanner table = new Scanner(System.in);
        System.out.println("Enter a number = ");
        int n = table.nextInt();


        for(int i=1; i<n; i++){
            for(int j=1; j<=10; j++){
                System.out.println(i + "*" + j + " = " + i*j);
            }
            System.out.println("--------");
        }
    }
}
