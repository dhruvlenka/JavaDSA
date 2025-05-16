package CollectionFramework.List.ArrayList.Methods;

import java.util.ArrayList;

public class setMethod {
    public static void main(String[] args) {
        ArrayList<String> employee = new ArrayList<>();
        employee.add("Rahul");
        employee.add("Ayush");
        employee.add("Harshit");
        employee.add("Rupesh");

        System.out.println("Employee before change:" + employee);
        employee.set(2, "Sanskar"); //index starts from 0
        System.out.println("Employee after change:" + employee);

    }
}
