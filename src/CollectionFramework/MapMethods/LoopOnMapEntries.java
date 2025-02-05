package CollectionFramework.MapMethods;

import java.util.HashMap;
import java.util.Map;
import java.util.*;

public class LoopOnMapEntries {
    public static void main(String[] args) {
        Map<Integer, String> mapvs = new HashMap<>();
        mapvs.put(1, "Hello");
        mapvs.put(2, "Hi");
        mapvs.put(3, "Bye");

        Set<Map.Entry<Integer,String>> ent = mapvs.entrySet();
        System.out.println(ent);
        for(Map.Entry<Integer,String> p: ent){
            System.out.println(p);
        }

        System.out.println("======================");
        for(Map.Entry<Integer,String> p: ent){
            System.out.println("Key is: " + p.getKey() + " Value is: " +  p.getValue());
        }


    }
}
