package CollectionFramework.Deque.ArrayDeque;

import java.util.ArrayDeque;

//LIFO
public class UsingAsStack {
    public static void main(String[] args) {
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Popped Element: " + stack.pop());
        System.out.println("Element After Stack: " + stack);

        if (stack.isEmpty()) {
            System.out.println("Now Stack is Empty");
        }


    }
}
