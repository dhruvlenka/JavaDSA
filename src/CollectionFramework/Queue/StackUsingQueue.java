package CollectionFramework.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue {
    /*
    One way to implement a stack using queues in Java is to
    use two queues, where one queue is used for the actual
    storage of the stack elements, and the other queue is
    used for temporary storage during push and pop operations.
     */
    //Two inbuilt queues
      Queue<Integer> queue1 = new LinkedList<>();
      Queue<Integer> queue2 = new LinkedList<>();

    public void push(int value) {
        queue2.add(value); // add element to temporary queue
        while (!queue1.isEmpty()) {
            queue2.add(queue1.remove()); // move elements from main queue to temp queue
        }
        // swap the references of queue1 and queue2
        Queue<Integer> temp = queue1;
        queue1 = queue2;
        queue2 = temp;
    }

    public int pop() {
        if (queue1.isEmpty()) {
            throw new IllegalStateException("CollectionFramework.List.Stack is empty");
        }
        return queue1.remove();
    }
    public int top() {
        if (queue1.isEmpty())
            return -1;
        return queue1.peek();
    }

    public int peek() {
        if (queue1.isEmpty()) {
            throw new IllegalStateException("CollectionFramework.List.Stack is empty");
        }
        return queue1.peek();
    }

    public boolean isEmpty() {
        return queue1.isEmpty();
    }

    public int size() {
        return queue1.size();
    }
    public static void main(String[] args) {
        StackUsingQueue stack = new StackUsingQueue();

        // Pushing elements onto the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);

        // Printing the size of the stack
        System.out.println("Size of stack: " + stack.size());

        // Popping elements from the stack
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Popped element: " + stack.pop());

        // Printing the top element of the stack
        System.out.println("Top element of stack: " + stack.peek());

        // Checking if the stack is empty
        System.out.println("Is stack empty? " + stack.isEmpty());

        //top
        System.out.println(stack.top());
    }

}
