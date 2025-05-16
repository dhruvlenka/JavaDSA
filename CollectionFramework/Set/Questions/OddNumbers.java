package CollectionFramework.Set.Questions;

import java.util.HashSet;

public class OddNumbers {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        int sumOfOdd = 0;
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(8);
        set.add(9);
        set.add(18);
        set.add(19);
        set.add(43);

        for(Integer i: set){
            sumOfOdd = sumOfOdd + i;
        }
        System.out.println("Sum of Odd: " + sumOfOdd);
    }
}
