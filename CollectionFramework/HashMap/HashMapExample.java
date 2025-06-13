package CollectionFramework.HashMap;

import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<String, Integer> employee = new HashMap<>();
        employee.put("John", 1000);
        employee.put("Mary", 2000);
        employee.put("Mike", 3000);
        employee.put("Peter", 4000);
        employee.put("Paul", 5000);
        employee.put("Robert", 6000);
        employee.put("Jennifer", 7000);
        employee.put("Sarah", 8000);
        employee.put("Jessica", 9000);

        //printing the employees name
        for(String name: employee.keySet()){
            System.out.println(name);
        }

        //printing the employees salary
        for(Integer salary: employee.values()){
            System.out.println(salary);
        }

        //printing both emoloyee name and salary
        //entrySet(): returns a Set of Map.Entry<K, V>.
        for(HashMap.Entry<String, Integer> entry : employee.entrySet()){
            System.out.println("Name: " + entry.getKey() + ", Salary: " + entry.getValue());
        }
    }
}
