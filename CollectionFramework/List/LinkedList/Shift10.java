package CollectionFramework.List.LinkedList;

import java.util.LinkedList;

public class Shift10 {
    public static void main(String[] args) {
        int[] ar = {1,0,0,1,0,0,1,1,1,0,1};
        shift10(ar);
    }
    //For a given array of 0 and 1, place all 1 in starting and place all 0 in the end.
    public static void shift10(int[] arr){
        LinkedList al = new LinkedList<>();
        for(int i=0; i<arr.length; i++){
            if(arr[i] == 1) {
                al.addFirst(1);
            } else {
                al.addLast(0);
            }
        }
        System.out.println(al);
    }
}
