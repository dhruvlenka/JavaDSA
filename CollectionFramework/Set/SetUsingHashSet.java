package CollectionFramework.Set;

import java.util.HashSet;
import java.util.Set;

public class SetUsingHashSet {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        set1.add(10);
        set1.add(20);
        set1.add(30);
        System.out.println(set1);

        //creating a new Set
        Set<Integer> set2 = new HashSet<>();
        set2.add(10);
        set2.add(20);
        set2.add(30);
        set2.add(40);
        System.out.println(set2);

        //union
        set2.addAll(set1);
        System.out.println("Union: " + set2);

        //intersection
        set2.removeAll(set1);
        System.out.println("Intersection: " + set2);

        //subset
        boolean isSubset = set2.contains(set1);
        System.out.println("Subset: "+ isSubset);
    }
}
