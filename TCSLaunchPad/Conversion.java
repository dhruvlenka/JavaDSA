package TCSLaunchPad;

public class Conversion {
    public static void main(String[] args) {
        //conversion (typecasting): Automatic casting b/w int and double
        int ab = 22; //int: smaller data type
        double c = ab; //double: larger data type, it can hold small data type.
        System.out.println(ab);
        System.out.println(c);
        /*
        Note: larger data type can hold smaller data type but
              smaller data type can't hold larger data type.
        */

        double x = 89.7;
        /*
        if we write this code, int y = x; it will generate error "incompatiable types",
        to solve this we will use:
        */
        int y = (int)x;
        System.out.println(x);
        System.out.println(y);

        double divide = 9/2;
        double divide2 = 10.2/3;
        System.out.println(divide);
        System.out.println(divide2);

        //Operator precedence
        int pre = 5*4/5+15-3;
        System.out.println(pre);
    }
}
