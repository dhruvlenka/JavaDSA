package Recursion;

import java.util.Scanner;

public class Recursion_Larger_Smaller {
    public static void main(String[] args) {
        int a = 30;
        int b = 40;
        int c = 70;
        int d = 50;
        int e = 60;
        int biggest = big(big(big(a,b),c), big(d,e));
      //  System.out.println(biggest);

    }
    public static int big(int a, int b){
        return a>b?a:b;
    }

}
