package CollectionFramework.Set.Questions;

import java.util.HashSet;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,10,20};

        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i<arr.length; i++){
            set.add(arr[i]);
        }

        for(Integer i: set){
            System.out.println(i);
        }
    }
}
