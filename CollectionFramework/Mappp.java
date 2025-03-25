package CollectionFramework;

import java.util.HashMap;
import java.util.Map;

public class Mappp {
    public static void main(String[] args) {
            //Generics
        Map<String, Integer> mapp = new HashMap<>();
        mapp.put(new String("xyz"),21);
        mapp.put(new String("mohan"), 23);

        mapp.put(new String("pqr"),34);
        mapp.put(new String("abc"),33);
        mapp.put(new String("mohan"),100);

        System.out.println(mapp);

    }
}
