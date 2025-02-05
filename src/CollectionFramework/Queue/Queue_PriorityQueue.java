package CollectionFramework.Queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class Queue_PriorityQueue {
    public static void main(String[] args) {
        Queue<String> q = new PriorityQueue<>();
        q.add("Dhruv");
        q.add("Lucky");
        q.add("Gaurav");
        q.add("Aditya");
        q.add("Dhruv");

        for(String str: q){
            System.out.println(str);
        }

        System.out.println();

        System.out.println(q.peek());
        System.out.println(q.size());
        System.out.println(q.isEmpty());
        System.out.println(q.contains("Lucky"));
        System.out.println(q.remove());

    }
}
