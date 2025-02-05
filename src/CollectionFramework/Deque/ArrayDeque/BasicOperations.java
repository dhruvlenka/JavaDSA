package CollectionFramework.Deque.ArrayDeque;

import java.util.ArrayDeque;

public class BasicOperations {
    public static void main(String[] args) {
        ArrayDeque<Character> alphabets = new ArrayDeque<>();
        alphabets.add('B');
        alphabets.add('C');
        alphabets.add('D');
        alphabets.add('E');
        alphabets.add('X');
        alphabets.add('Y');
        System.out.println("Display: " + alphabets);

        //adding a alphabet at the first
        alphabets.offerFirst('A');
        System.out.println("Offering at First: " + alphabets);

        //adding alphabet at the last
        alphabets.offerLast('Z');
        System.out.println("Offering at Last: "+ alphabets);

        //accessing elements
        System.out.println("Accessing Element: " + alphabets.peekFirst());

        //removing elements
        System.out.println("Removing a Element from Last: " + alphabets.removeLast());
    }
}
