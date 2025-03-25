package CollectionFramework.Queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class TwoSmallest {
    public static void main(String[] args) {
        int[] arr = {12,8,17,10,5,9,15,10,12,8,11};
        getTwoSmallest(arr);
    }
    public static void getTwoSmallest(int[] arr){
        Queue<Integer> q1 = new PriorityQueue<>();
        for(int p: arr){
            q1.offer(p);
        }

        int smallest=q1.poll(); int secondSmallest=0;
        while (!q1.isEmpty()){
            int temp = q1.poll();
         if(smallest!=temp) {
             secondSmallest = temp;
             break;
         }
        }
        System.out.println("Smallest "+ smallest);
        System.out.println("Second Smallest: " +secondSmallest);
    }
}
