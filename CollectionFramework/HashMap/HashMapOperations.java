package CollectionFramework.HashMap;

import java.util.HashMap;

public class HashMapOperations {
    public static void main(String[] args) {
        HashMap<String, Integer> studentMarks = new HashMap<>();
        //adding key-value
        studentMarks.put("Ayush", 100);
        studentMarks.put("Abhay", 90);
        studentMarks.put("Gaurav", 80);
        studentMarks.put("Jack", 70);
        studentMarks.put("Ryan", 60);
        studentMarks.put("Sparrow", 50);

        //adding a null key and null value
        studentMarks.put(null, 99); //one null key is allowed
        studentMarks.put("Dharshit", null); //multiple null value is allowed
        studentMarks.put("Lucky", null);

        //displaying the hashmap
        System.out.println(studentMarks);

        //accessing a value
        System.out.println("Marks of Ayush: " +studentMarks.get("Ayush"));

        //checking if a key exists
        if(studentMarks.containsKey("Sparrow")){
            System.out.println("Sparrow exists in the hashmap.");
        }

        //Iterating students name using: keySet()
        for(String key: studentMarks.keySet()){
            System.out.println("Students: " + key);
        }
        System.out.println();

        //Iterating students marks using: value()
        for(Integer value: studentMarks.values()){
            System.out.println(value);
        }
        System.out.println();

        //iterating both key and value
        for(HashMap.Entry<String, Integer> entry : studentMarks.entrySet()){
            System.out.println("Name: " + entry.getKey() + ", Marks: " + entry.getValue());
        }
        System.out.println();

        //removign an entry
        studentMarks.remove("Ayush");
        System.out.println(studentMarks);
    }
}
