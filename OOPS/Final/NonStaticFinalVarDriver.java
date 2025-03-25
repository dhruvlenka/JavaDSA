package OOPS.Final;

public class NonStaticFinalVarDriver {
    public static void main(String[] args) {
        NonStaticFinalVariable nc = new NonStaticFinalVariable(24);
        nc.name = "dhruv";
        nc.salary = 10000;
        System.out.println(nc.id);
        System.out.println(nc.name);
        System.out.println(nc.salary);


        System.out.println();

        NonStaticFinalVariable nc2 = new NonStaticFinalVariable ("Jack", 24);
        System.out.println(nc2.name);
        System.out.println(nc2.id);

    }
}
