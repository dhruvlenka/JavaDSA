package CollectionFramework.Queue;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Prac {
    public static void main(String[] args) {
        Queue<String> que = new LinkedList<>();
        //adding element using add() method
        que.add("Jack Ryan");
        que.add("Jack Sparrow");
        que.add("Jack Reacher");
        //adding element using offer() method
        que.offer("Jack Harlow");
        System.out.println(que);



        Queue<Integer> quee = new PriorityQueue();
        //adding element using add() method
        quee.add(10);
        quee.add(20);
        quee.add(30);
        //adding a element using offer() method
        quee.offer(40);
        System.out.println(quee);

        Queue<Integer> q = new ArrayDeque<>();
        //adding element using add() method
        q.add(100);
        q.add(200);
        q.add(300);
        //adding a element using offer() method
        q.offer(400);
        System.out.println(q);

    }
}
