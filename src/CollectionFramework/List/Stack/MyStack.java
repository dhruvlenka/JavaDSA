package CollectionFramework.List.Stack;

import java.util.EmptyStackException;

public class MyStack<T> {
    private static class StackNode<T>{
        private T data;
        private StackNode<T> next;

        public StackNode(T data){
            this.data = data;
        }
    }

    private StackNode<T> top;

    public T pop() {
        if(top == null) throw new EmptyStackException() ;
        T item = top.data;
        top = top.next;
        return item;
    }

    public void push(T item){
        StackNode<T> t = new StackNode<>(item);
        t.next = top;
        top = t;
    }

    public T peek() {
        if(top == null) throw new EmptyStackException();
        return top.data;
    }

    public boolean isEmpty(){
        return top == null;
    }

    public static void main(String[] args) {
        MyStack<Integer> s = new MyStack<>();
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println(s.isEmpty());
    }
}
