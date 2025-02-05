package CollectionFramework.Queue.PriorityQueue;

import java.util.PriorityQueue;

public class PriorityQueueProgram {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        //adding elements using add() method
        pq.add(80);
        pq.add(10);
        pq.add(50);
        pq.add(20);
        pq.add(40);
        pq.add(30);

        //adding elements using offer() method
        pq.offer(100);
        pq.offer(5);

        System.out.println(pq);

        //peek(): accessing priority queue elements without removing it
        System.out.println("Peek: " + pq.peek());

        //poll(); return and remove the head of the queue
        System.out.println("Pop: " + pq.poll());
        System.out.println(pq);

        //isEmpty()
        System.out.println("isEmpty? " + pq.isEmpty());

        //size()
        System.out.println("Size = " + pq.size());

        //contains()
        System.out.println("isContains 100 ? " + pq.contains(100));

    }
}
