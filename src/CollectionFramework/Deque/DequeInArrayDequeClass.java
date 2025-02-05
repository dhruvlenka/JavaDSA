package CollectionFramework.Deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeInArrayDequeClass {
    public static void main(String[] args) {
        //Implementation of CollectionFramework.Deque in ArrayDeque Class
        Deque<String> deq = new ArrayDeque<>();
        //adding elements to the deque
        deq.offer("Ayush");
        deq.offerFirst("Dhruv");
        deq.offerLast("Harshit");
        System.out.println(deq);

        //getFirst
        System.out.println(deq.getFirst());
        //getLast
        System.out.println(deq.getLast());

        deq.offerLast("Aman Raj");
        deq.offerLast("Rajnish");
        System.out.println(deq);

        //removeFirst
        System.out.println(deq.removeFirst());
        //removeLast
        System.out.println(deq.removeLast());

        System.out.println(deq);
    }
}
