package CollectionFramework.Deque;

import java.util.Deque;
import java.util.LinkedList;

public class DequeInLinkedListClass {
    public static void main(String[] args) {
        Deque<String> DEQ = new LinkedList<>();
        DEQ.add("Batman"); //normally add
        //addFirst
        DEQ.addFirst("Avengers");
        //addLast
        DEQ.addLast("Crank ");
        System.out.println(DEQ);

        //accessing elements: peekFirst
        System.out.println(DEQ.peekFirst());
        //peeKLast
        System.out.println(DEQ.peekLast());

        DEQ.add("Deadpool");
        DEQ.add("Elysium");
        System.out.println(DEQ);

        //removing elements: poolFirst
        System.out.println(DEQ.pollFirst());
        //poolLast
        System.out.println(DEQ.pollLast());

    }
}
