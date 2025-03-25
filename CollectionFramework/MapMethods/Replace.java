package CollectionFramework.MapMethods;

import java.util.HashMap;
import java.util.Map;

public class Replace {
    public static void main(String[] args) {
        Map<Integer, String> mapvs = new HashMap<>();
        mapvs.put(1, "Hello");
        mapvs.put(2, "Hi");
        mapvs.put(3, "Bye");
        //key, old value to new value
        mapvs.replace(2,"Hi Dhruv");
        System.out.println(mapvs);


    }
}
