package CoreJava.DataTypesNonPrimitive;

public class StringDataType {
    public static void main(String[] args) {
        String name = "Jack Reacher";
        System.out.println(name);

        String name2 = new String("Jack Sparorw");
        System.out.println(name2);

        if(name == name2){
            System.out.println("Matched");
        } else {
            System.out.println("Not-Matched");
        }
    }

}
