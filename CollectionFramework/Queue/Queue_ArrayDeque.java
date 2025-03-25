package CollectionFramework.Queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class Queue_ArrayDeque {
    public static void main(String[] args) {
        Queue<String> q = new ArrayDeque<>();
        q.add("Ayush");
        q.add("Harshit");
        q.add("Dhruv");


        System.out.println(q.peek());
        System.out.println(q.size());
        System.out.println(q.isEmpty());
        System.out.println(q.contains("Dhurv"));
        System.out.println(q.remove());


    }
}
