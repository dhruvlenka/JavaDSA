package CollectionFramework.List.ArrayList.Methods;

import java.util.ArrayList;

public class getMethod {
    public static void main(String[] args) {
        ArrayList<String> employee = new ArrayList<>();
        employee.add("Rahul");
        employee.add("Ayush");
        employee.add("Harshit");
        employee.add("Rupesh");

        System.out.println(employee.get(3)); //index starts from 0
    }
}
