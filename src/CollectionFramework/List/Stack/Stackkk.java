package CollectionFramework.List.Stack;

import java.util.Stack;

public class Stackkk {
    public static void main(String[] args) {
        Stack<Integer> numbers = new Stack<>();
        numbers.push(10);
        numbers.push(20);
        numbers.push(30);
        numbers.add(40);
        numbers.add(50);
        System.out.println(numbers);


        System.out.println();
        System.out.println(numbers.pop());
        System.out.println(numbers);

        System.out.println(numbers.isEmpty());
        System.out.println(numbers.peek());
        System.out.println(numbers);
        System.out.println(numbers.capacity());
        System.out.println(numbers.contains(20));




    }
}
