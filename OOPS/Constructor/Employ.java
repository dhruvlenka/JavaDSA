package OOPS.Constructor;

public class Employ {
    static String comp_name = "Oracle ";
    String companyName = "Oracle";
    String name;
    int id;

    static int count;

    public static void giveBiometric() {
        System.out.println("Employ should give biometric.");
    }
    public void work() {
        System.out.println("Employ is working");

    }

    Employ(){
        count++;
        System.out.println("Employ object " + count + " is crated");
    }
}
