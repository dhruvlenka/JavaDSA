package CollectionFramework.MapMethods;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class LoopOnMapKey {
    public static void main(String[] args) {
        Map<Integer, String> mapvs = new HashMap<>();
        mapvs.put(1, "Hello");
        mapvs.put(2, "Hi");
        mapvs.put(3, "Bye");

        System.out.println("Loop using Set: 3");
        Set<Integer> key  = mapvs.keySet();

        for(int p: key){
            System.out.println(p);
        }

        System.out.println("Loop using Iterator: ");
        Iterator<Integer> itr = key.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
