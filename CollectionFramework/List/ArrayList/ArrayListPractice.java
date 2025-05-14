package CollectionFramework.List.ArrayList;

import java.util.ArrayList;

public class ArrayListPractice {
    public static void main(String[] args) {
        System.out.println("Bangkok Trip: ");
        ArrayList<String> bangkok = new ArrayList<>();
        bangkok.add("Dhruv");
        bangkok.add("Deepak");
        bangkok.add("Daranath");

        System.out.println(bangkok);

        /*
        Where:
        bangkok.size() in ArrayList and array.length in Array.
        bangkok.get(i) in ArrayList and array[i] in Array.
         */
        for(int i=0; i<bangkok.size(); i++){
            System.out.print (bangkok.get(i) + " ");
        }
        System.out.println();

        //Enhanced loop
        for(String trip: bangkok){
            System.out.print(trip + " ");
        }

        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        System.out.println(arr);
    }
}
