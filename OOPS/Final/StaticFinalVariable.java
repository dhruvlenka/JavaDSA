package OOPS.Final;

public class StaticFinalVariable {
                         //initialize
   final static String brand = "aman";

   final static int x;
   //static initializer block
   static {
       x = 24;
   }
    public static void main(String[] args) {
        System.out.println(brand);
        System.out.println(x);
    }
}
