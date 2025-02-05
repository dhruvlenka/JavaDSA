package CollectionFramework.MapMethods;

import java.util.HashMap;
import java.util.*;

public class Equalss {
    public static void main(String[] args) {
        Map<Integer, String> mapvs = new HashMap<>();
        mapvs.put(1, "Hello");
        mapvs.put(2, "Hi");
        mapvs.put(3, "Bye");
        mapvs.putIfAbsent(4,"Okay"); //absent then it will put the key and value
        System.out.println(mapvs);

        Map<Integer, String> mapvs2 = new HashMap<>();
        mapvs.put(11, "Jack Ryan");
        mapvs.put(12, "Jack Sparrow");
        mapvs.put(13, "Jack Reacher");
        mapvs.putIfAbsent(13,"Jack Reacher"); //present it will not addd the key and value

        System.out.println(mapvs2);


    }
}
