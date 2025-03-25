package OOPS.WrapperClass;

public class ValueOfAndParseMethod {
    public static void main(String[] args) {
        String s1 = "238";
        System.out.println(s1+100); //238100
        Integer in = Integer.valueOf(s1);
        System.out.println(in); //238

        int y = Integer.parseInt(s1);
        System.out.println(y*2); //238*238 = 476

        System.out.println();

        String s2 = "45.6";
        System.out.println(s2+100); //45.6100
        Double a = Double.valueOf(s2);
        System.out.println(s2); //45.6

        Double a2 = Double.parseDouble(s2);
        System.out.println(a2*2); //91.2

    }
}
