package CollectionFramework.List.LinkedList;

import java.util.ArrayList;

public class Q {
    public static void main(String[] args) {
        //for the given array remove all the duplicates store it in collection.
        int[] arr = {12, 18, 12, 15, 20, 18, 20};
        // we want the duplicate element so the arrayList is the option for faster performance.

        ArrayList al= new ArrayList<>();
        for(int i=0; i<arr.length; i++){
            if(!al.contains(arr[i])){
                al.add(arr[i]);
            }
        }
        System.out.println(al);
    }
}
