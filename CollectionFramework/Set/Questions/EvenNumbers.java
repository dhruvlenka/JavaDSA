package CollectionFramework.Set.Questions;

import java.util.HashSet;

public class EvenNumbers {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        int sumOfEven = 0;
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(8);
        set.add(9);
        set.add(18);
        set.add(19);


        for(Integer i: set ){
            if(i%2 ==0){
                sumOfEven = sumOfEven + i;
            }
        }
        System.out.println(sumOfEven);
    }
}
