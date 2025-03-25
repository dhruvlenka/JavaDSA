package CollectionFramework;

import java.util.Map;
import java.util.TreeMap;

public class tree_map {
    public static void main(String[] args) {
        //TreeMap
        TreeMap<Integer,String> prizeProduct = new TreeMap<>();
        prizeProduct.put(29999,"iPad 8th Gen");
        prizeProduct.put(8000,"Apple Pencil");
        prizeProduct.put(40000,"iPhone 12 Mini");
        prizeProduct.put(2500,"Apple Airtag");
        System.out.println("Tree Map: "+ prizeProduct);

        //.putIfAbsent: It will put the Key and Value, if it is not present in the TreeMap.
        prizeProduct.putIfAbsent(171000,"Apple Macbook Pro M1 14inches");
        System.out.println("New Tree Map: "+ prizeProduct);

        //now if we again put the same key and value it will include them.
        prizeProduct.putIfAbsent(171000,"Apple Macbook Pro 14inches");
        System.out.println("New Trew Map: "+ prizeProduct);
        System.out.println();

        TreeMap<String, Long> nameCon = new TreeMap<>();
        nameCon.put("VIKASH", 9507133208l);
        nameCon.put("Dhruv",  6200003792l);
        nameCon.put("Devraj", 7042136330l);
        nameCon.put("Govind", 7903324079l);
        nameCon.put("Rahul",  7256802329l);
        System.out.println("Name and Contact: " + nameCon);

        //.first(): it will give firstKey in the TreeMap
        System.out.println(nameCon.firstKey()); //devraj

        //.lastKey(): it will give lastKey() in the TreeMap
        System.out.println(nameCon.lastKey()); //vikash

        //.firstEntry(): it will give first key and value in the TreeMap
        System.out.println(nameCon.firstEntry());//

        //.lastKey(): it will give last key and value in the TreeMap
        System.out.println(nameCon.lastEntry());

        //.get()
        System.out.println(nameCon.get("VIKASH"));

        //.keySet(): returns a set of all the keys of a TreeMap
        System.out.print("Keys: ");
        for (String key: nameCon.keySet()){
            System.out.print(key + ", ");
        }
        System.out.println();

       //.values(): returns a set of all the maps of a TreeMap
        System.out.print("Values: ");
        for (Long value: nameCon.values()){
            System.out.print(value + ", ");
        }
        System.out.println();

        //.entrySet(): returns a set of all the key/values mapping (entry) of a TreeMap.
        System.out.print("Key and Values: ");
        for (Map.Entry<String, Long> entry : nameCon.entrySet()){
            System.out.print(entry + ", ");
        }
        System.out.println();
        System.out.println();

        TreeMap<Integer, String> nameMarks = new TreeMap<>();
        nameMarks.put(368,"Vikash");
        nameMarks.put(375,"Diljeet");
        nameMarks.put(400,"Animesh");
        nameMarks.put(380,"Gaurav");
        System.out.println("Name and Marks: " + nameMarks);

        //.remove: for remove elements from Key
        nameMarks.remove(375);
        System.out.println("After removal: " + nameMarks);

        //.remove: for remove elements from Key and Value
        nameMarks.remove(380,"Gaurav");
        System.out.println("After again removal: "+ nameMarks);
        System.out.println();

        TreeMap<String, Integer> nameAge = new TreeMap<>();
        nameAge.put("Vikash", 22);
        nameAge.put("Dhruv",  20);
        nameAge.put("Govind", 28);
        nameAge.put("Deepak", 28);
        nameAge.put("Devraj", 32);

        //.replace()
        System.out.println("New Tree: " + nameAge);
        nameAge.replace("Dhruv",20, 22);
        System.out.println("New new Tree: "+ nameAge);
    }
}
