package CollectionFramework.Deque.ArrayDeque;

import java.util.ArrayDeque;

//FIFO
public class UsingAsQueue {
    public static void main(String[] args) {
        ArrayDeque<Integer> queue = new ArrayDeque<>();
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);

        System.out.println("Queue: " + queue);

        System.out.println("Polled Element: " + queue.poll());
    }
}
