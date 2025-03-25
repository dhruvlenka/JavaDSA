package CollectionFramework.Queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class SortArray {
    public static void main(String[] args) {
        int[] arr = {12,8,17,10,5,9,15,10,12,8,11};
        System.out.println("=====Before Sorting==============");
        for(int p: arr){
            System.out.print(p + " ");
        }
        sortArrayElements(arr);
        System.out.println();
        System.out.println("========After Sorting================");
        for(int p: arr){
            System.out.print(p + " ");
        }
    }
    public static void sortArrayElements(int[] arr){
        Queue<Integer> que = new PriorityQueue<>();
        for(int p: arr){
            que.offer(p);
        }
        for(int i=0; i< arr.length; i++){
            arr[i] = que.poll();
        }
    }
}
