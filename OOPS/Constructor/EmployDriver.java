package OOPS.Constructor;

public class EmployDriver {
    public static void main(String[] args) {
        System.out.println("Employ Driver() main starts. ");
        System.out.println("Company name is: " + Employ.comp_name);
        Employ.giveBiometric();

        Employ e1 = new Employ();
        Employ e2 = new Employ();
        Employ e3 = new Employ();
        Employ e4 = new Employ();
        Employ e5 = new Employ();
        Employ e6 = new Employ();

        System.out.println();
        System.out.println(" ===== Employ1 Detils =====");
        System.out.println("Employ1 object  address is: " + e1);
        System.out.println("Employ1 company address is: " + e1.companyName);
        System.out.println("Employ1 name is: " + e1.name);
        System.out.println("Employ1 id is: " + e1.id);
        e1.giveBiometric();
        e1.work();

        System.out.println(); // for space purpose
        System.out.println(" ===== Employ2 Detils =====");
        System.out.println("Employ1 object  address is: " + e2.companyName);
        System.out.println("Employ1 company address is: " + e2);
        System.out.println("Employ1 name is: " + e2.name);
        System.out.println("Employ1 id is: " + e2.id);
        e2.giveBiometric();
        e2.work();

        System.out.println(); // for space purpose
        System.out.println(" ===== Employ3 Detils =====");
        System.out.println("Employ1 object  address is: " + e3.companyName);
        System.out.println("Employ1 company address is: " + e3);
        System.out.println("Employ1 name is: " + e3.name);
        System.out.println("Employ1 id is: " + e3.id);
        e3.giveBiometric();
        e3.work();

    }
}
