package CoreJava.ControlStatements;

import java.util.Scanner;

public class TableProgram {
    public static void main(String[] args) {
        Scanner table = new Scanner(System.in);
        System.out.println("Enter a number = ");
        int n= table.nextInt();

        int i;
        for(i=1; i<=10; i++){
            System.out.println(n + "*" + i + "=" + n*i);
        }

    }
}
