package CollectionFramework.List.Stack;

import java.util.LinkedList;

//Linked list implementation of CollectionFramework.List.Stack
public class LinkedListImplementation {
     LinkedList<Integer> list = new LinkedList<>();

    void push(int x){
        list.add(x);
    }

    int pop() {
        int rem = list.getLast();
        list.remove(list.getLast());
        return rem;
    }

    int peek(){
        return list.get(list.size()-1);
    }

    int size(){
        return list.size();
    }
    boolean isEmpty(){
        return list.isEmpty();
    }

    //Second way to do

//    int pop(){
//        int res = list.get(list.size()-1);
//        list.remove(list.size()-1);
//        return res;
//    }


    public static void main(String[] args) {
        //dynamic size
       LinkedListImplementation list = new LinkedListImplementation();
        list.push(10);
        list.push(20);
        list.push(30);
        System.out.println(list.peek());
        System.out.println(list.pop());
        list.push(40);
        System.out.println(list.size());
        System.out.println(list.isEmpty());

        //Time Complexity = BigO(1): Worst Case
     }
}
