package CollectionFramework.List.ArrayList;

import java.util.ArrayList;
import java.util.Comparator;

public class ArrayListProgram {
    public static void main(String[] args) {
        ArrayList<Integer> roll = new ArrayList<>(5);
        roll.add(18); //.add = for adding the roll data into the Array.Array List
        roll.add(24);
        roll.add(7);
        roll.add(55);
        roll.add(45);
        System.out.println(roll);
        roll.add(65);
        System.out.println(roll);
        roll.remove(3); //.remove = for removing the roll data from the Array.Array List
        System.out.println(roll);

        //Sorting using ArrayList
        //ascending order
        roll.sort(Comparator.naturalOrder());
        System.out.println(roll);
        //descending order
        roll.sort(Comparator.reverseOrder());
        System.out.println(roll);

        /*
         Contains keyword, checks 26 it is in the list or not
         If Yes then it will True, and If not then it will give False.
         */
        System.out.println(roll.contains(45));

        //For changing elements in the Array.Array
        roll.set(4,13);
        System.out.println(roll);

        //get
        ArrayList<String> months = new ArrayList<>();
        months.add("January");
        months.add("February");
        months.add("March");
        months.add("April");

        System.out.println(months);

        for(int i=0; i<months.size(); i++){
            String parallelUniMonths = months.get(i);
            System.out.println("Parallel Universe Months: " + parallelUniMonths);
        }
    }
}
