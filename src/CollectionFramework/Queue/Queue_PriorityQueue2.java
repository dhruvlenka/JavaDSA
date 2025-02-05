package CollectionFramework.Queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class Queue_PriorityQueue2 {
    public static void main(String[] args) {
        Queue q = new PriorityQueue();
        q.offer(23);
        q.offer(34);
        q.offer(45);
        q.offer(21);
        q.offer(20);
        q.offer(45);
        q.offer(26);

        System.out.println("q: " + q);
        System.out.println("Head element of q is: " + q.poll());
        System.out.println("Head element of q is: " + q.poll());
        System.out.println("Head element of q is: " + q.poll());
        System.out.println("Head element of q is: " + q.poll());
    }
}
