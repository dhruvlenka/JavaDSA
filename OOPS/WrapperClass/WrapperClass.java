package OOPS.WrapperClass;

public class WrapperClass {
    public static void main(String[] args) {
        //primitive to non-primitive
        int x = 356;
        Integer y = x;
        System.out.println(y.byteValue());

        double p = 12.58;
        Double q = p;
        System.out.println(q);

        //non-primitive data into primitive data
        Integer x2 = 235;
        int y2 = x2; //unboxing
        System.out.println(x2);

        Double a = 18.56;
        double b = a; //unboxing
        System.out.println(b);

        //toString
        Integer z = 34567;
        System.out.println(z.toString());
        System.out.println();

        String s1 = "238";
        Integer x1 = Integer.valueOf(s1); //unboxing
        Integer y1 = Integer.parseInt(s1);
        System.out.println(x1);
        System.out.println(y1);
        System.out.println(s1+100);

        System.out.println();
        System.out.println("----------Double--------");
        String s2 = "28.5";
        System.out.println(s2+100);

        double d1 = Double.valueOf(s2); //unboxing
        double d2 = Double.parseDouble(s2);
        System.out.println(d1);
        System.out.println(d2);


        System.out.println("=====================");

    }
}
