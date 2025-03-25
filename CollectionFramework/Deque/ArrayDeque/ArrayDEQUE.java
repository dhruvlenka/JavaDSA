package CollectionFramework.Deque.ArrayDeque;

import java.util.ArrayDeque;
import java.util.Iterator;

public class ArrayDEQUE {
    public static void main(String[] args) {
        ArrayDeque<String> arrayDEQUE = new ArrayDeque<>();
        //inserting the specified element at the end of the array deque
        arrayDEQUE.add("Jack Ryan");
        arrayDEQUE.add("John Wick");
        arrayDEQUE.add("Jack Sparrow");
        System.out.println(arrayDEQUE);

        //inserting the specified element at the beginning of the array deque
        arrayDEQUE.addFirst("Jack");
        System.out.println(arrayDEQUE);

        //inserting the specified at the end of the array deque (equivalent to add())
        arrayDEQUE.addLast("Jack Reacher");
        System.out.println(arrayDEQUE);
        System.out.println();

        //Access ArrayDeque Elements
        ArrayDeque<String> access = new ArrayDeque<>();
        access.offer("Captain America");
        access.add("Captain Jack Sparrow");
        access.add("Captain Steve Rogers");
        System.out.println(access);

        //getFirst
        System.out.println(access.getFirst());
        //getLast
        System.out.println(access.getLast());
        System.out.println();

        //Access elements using peek(), peekFirst() and peekLast() method

        //returns the first element of the array deque
        System.out.println(access.peek());
        //returns the first element of the array deque (equivalent to peek()
        System.out.println(access.peekFirst());
        //returns the last element of the array deque
        System.out.println(access.peekLast());
        System.out.println();

        //Remove ArrayDeque Elements using remove(), removeFirst(), removeLast()
        ArrayDeque<Integer> students = new ArrayDeque<>();
        students.offer(14);
        students.add(18);
        students.add(22);
        students.add(28);
        students.add(45);
        System.out.println("Students Roll: " + students);
        System.out.println(students.remove());
        System.out.println(students.removeFirst());
        System.out.println(students.remove(28));
        System.out.println(students.removeLast());

        ArrayDeque<Integer> occurence = new ArrayDeque<>();
        occurence.add(18);
        occurence.add(18);
        occurence.add(24);
        occurence.add(25);
        occurence.add(24);
        System.out.println(occurence.removeFirstOccurrence(18));
        System.out.println(occurence.removeLastOccurrence(24));
        System.out.println();

        //Remove elements using the poll(), pollFirst() and pollLast() method
        ArrayDeque<String> rem = new ArrayDeque<>();
        rem.add("Animesh");
        rem.add("Aditya");
        rem.add("Jayesh");
        rem.add("Gaurav");
        rem.add("Harshit");
        rem.add("Dhruv");
        System.out.println(rem.poll());
        //same as 'poll'
        System.out.println(rem.pollFirst());
        System.out.println(rem.pollLast());
        System.out.println();

        //Remove Element: using the clear() method
        ArrayDeque<String> CLEAR = new ArrayDeque<>();
        CLEAR.add("Apple");
        CLEAR.add("Banana");
        CLEAR.add("Cat");
        CLEAR.add("Dog");
        CLEAR.add("Elephant");
        CLEAR.clear();
        System.out.println(CLEAR);
        System.out.println();

        //Iterating the ArrayDeque
        ArrayDeque<Integer> iterate = new ArrayDeque<>();
        iterate.add(14);
        iterate.add(18);
        iterate.add(20);
        iterate.add(24);
        iterate.add(45);
        System.out.println(iterate);

        //Using iterator
        Iterator<Integer> it = iterate.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

        System.out.println("ArrayDeque in reverse order");
        Iterator<Integer> itReverse = iterate.descendingIterator();
        while (itReverse.hasNext()){
            System.out.println(itReverse.next());

        }

    }
}
