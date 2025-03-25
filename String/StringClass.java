package String;

public class StringClass {
    public static void main(String[] args) {
        //String: is a type of final class can not be extended.
        String s1 = "bhootneeke"; //object class
        String s2 = new String("bhootneeke");

        System.out.println(s1);
        System.out.println(s2);

        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
    }
}
