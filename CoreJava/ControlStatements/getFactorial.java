package CoreJava.ControlStatements;

import java.util.Scanner;

public class getFactorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = input.nextInt();

        System.out.println(getFac(n));
        System.out.println(sumOfFactorial(n));
    }
    public static int getFac(int n){
        int fac=1;
        for(int i=1; i<=n; i++){
            fac=fac*i;
        }
        return fac;
    }
    public static int sumOfFactorial(int n){
        int fac=1;
        int sum=0;
        for (int i=1; i<=10; i++){
            fac = fac * i;
            sum = sum + fac;
        }
        return sum;
    }
}
