package CollectionFramework.List.ArrayList.Methods;

import java.util.ArrayList;

public class containsAllMethod {
    public static void main(String[] args) {
        ArrayList<String> addNames = new ArrayList<>();
        addNames.add("Gaurav");
        addNames.add("Dhruv");
        addNames.add("Lucky");
        addNames.add("Raj");
        addNames.add("Ravi");

        ArrayList<String> checkNames = new ArrayList<>();
        checkNames.add("Ravi");
        checkNames.add("Gaurav");
        checkNames.add("Raj");
        checkNames.add("Lucky");
        checkNames.add("Dhruv");

        System.out.println(addNames.containsAll(checkNames));
    }
}
