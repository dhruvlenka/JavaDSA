package CollectionFramework.List.ArrayList.Methods;

import java.util.ArrayList;

public class removeAllMethod {
    public static void main(String[] args) {
        ArrayList<String> addNames = new ArrayList<>();
        addNames.add("Gaurav");
        addNames.add("Dhruv");
        addNames.add("Lucky");
        addNames.add("Raj");
        addNames.add("Ravi");

        System.out.println("Before removing: " + addNames);
        addNames.removeAll(addNames); //removing all the elements
        System.out.println("After removing: " + addNames);
    }
}
