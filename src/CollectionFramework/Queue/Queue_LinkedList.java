package CollectionFramework.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class Queue_LinkedList {
    public static void main(String[] args) {
        //Creating a queue using LinkedList
        Queue<Integer> q = new LinkedList<>();
        //adding elements in the queue using add()
        q.add(3);
        q.add(5);
        q.add(10);
        //adding elements in the queue using offer()
        q.offer(20);
        q.offer(50);

        int peek = q.peek();
        int size = q.size();
        boolean contain = q.contains(20);
        boolean empty = q.isEmpty();
        int remove = q.remove();
        int remove2 = q.poll();

        System.out.println(peek);
        System.out.println(size);
        System.out.println(contain);
        System.out.println(empty);
        System.out.println(remove);
        System.out.println(remove2);

    }
}
