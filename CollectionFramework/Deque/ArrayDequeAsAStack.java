package CollectionFramework.Deque;
import java.util.ArrayDeque;

public class ArrayDequeAsAStack {
    public static void main(String[] args) {
        ArrayDeque<String> stack = new ArrayDeque<>();
        //adding elements
        stack.push("Rishav");
        stack.push("Kaya");
        stack.push("Aryan");
        System.out.println(stack);

        //access element from top of stack
        System.out.println(stack.peek());

        //return and removes an element from the top of the stack
        System.out.println(stack.pop());

    }
}
