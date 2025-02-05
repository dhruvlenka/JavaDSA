package OOPS.WrapperClass;

import java.util.Arrays;

public class ToString {
    public static void main(String[] args) {
        int x = 3456;
        String y = Integer.toString(x);
        System.out.println(y);
        System.out.println("Total Length = "+y.length());

        Double p= 183.5467;
        String q = Double.toString(p);
        System.out.println(q);
        System.out.println("Total Length: " + q.length());


    }
}
