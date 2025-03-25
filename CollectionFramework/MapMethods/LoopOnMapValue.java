package CollectionFramework.MapMethods;

import java.util.*;

public class LoopOnMapValue {
    public static void main(String[] args) {
        Map<Integer, String> mapvs = new HashMap<>();
        mapvs.put(1, "Hello");
        mapvs.put(2, "Hi");
        mapvs.put(3, "Bye");

        System.out.println("Loop using Collection: ");
        Collection<String> values  = mapvs.values();

        for(String str: values){
            System.out.println(str);
        }

        System.out.println("Loop using Iterator: ");
        Iterator<String > itr = values.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
