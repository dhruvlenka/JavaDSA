package CollectionFramework.List.ArrayList.Methods;

import java.util.ArrayList;
import java.util.Comparator;

public class sortMethod {
    public static void main(String[] args) {
        ArrayList<String> employee = new ArrayList<>();
        employee.add("Rahul");
        employee.add("Ayush");
        employee.add("Harshit");
        employee.add("Rupesh");

        System.out.println("Employees before sorting:" + employee);
        employee.sort(null);
        System.out.println("Employees after sorting:" + employee + "\n");

        employee.sort(Comparator.naturalOrder());
        System.out.println("Natural Order: " + employee);
        employee.sort(Comparator.reverseOrder());
        System.out.println("Reverse Order: " + employee);


        //reverse using sort()
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.sort(Comparator.reverseOrder());
        System.out.println("Reverse using sort():" + numbers);

    }
}
