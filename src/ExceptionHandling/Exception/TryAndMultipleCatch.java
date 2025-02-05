package ExceptionHandling.Exception;

import OOPS.SystemOutPrint;

import java.util.Scanner;

public class TryAndMultipleCatch {
    public static void main(String[] args) {
        int[] arr = {12,24,0,36,60};
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int y = input.nextInt();
        int index = input.nextInt();

        try {
            System.out.println(x/y);
            System.out.println(arr[3]/arr[index]);
        } catch (ArithmeticException ae){
            System.out.println("Arithmetic Exception Occurred" + ae);
        } catch (ArrayIndexOutOfBoundsException aioobe){
            System.err.println("ArrayIndexOutOfBound exception Occurred.");
        } catch (Exception e){
            System.out.println("Other exception is caught.");
        }
    }
}
