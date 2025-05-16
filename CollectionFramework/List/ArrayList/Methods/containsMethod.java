package CollectionFramework.List.ArrayList.Methods;

import java.util.ArrayList;

public class containsMethod {
    public static void main(String[] args) {
        ArrayList<String> addNames = new ArrayList<>();
        addNames.add("Gaurav");
        addNames.add("Dhruv");
        addNames.add("Lucky");
        addNames.add("Raj");
        addNames.add("Ravi");

        System.out.println(addNames.contains("Dhruv"));
    }
}
