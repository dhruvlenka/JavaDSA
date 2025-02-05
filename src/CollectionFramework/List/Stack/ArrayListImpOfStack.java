package CollectionFramework.List.Stack;

import java.util.ArrayList;

//Array List Implementation of CollectionFramework.List.Stack, for dynamic size
public class ArrayListImpOfStack {
    ArrayList<Integer> arrList = new ArrayList<>();

    void push(int x){
        arrList.add(x);
    }

    int pop(){
       int res = arrList.get(arrList.size()-1);
           arrList.remove(arrList.size()-1);
           return res;
    }

    /*
    int pop(){
        int res = list.getLast();
        list.remove(list.getLast());
        return res;
    }
     */
    int peek(){
        return arrList.get(arrList.size()-1);
    }

    int size(){
        return arrList.size();
    }

    boolean isEmpty(){
        return arrList.isEmpty();
    }

    boolean contains(int x){
        return arrList.contains(x);
    }
    public static void main(String[] args) {
        ArrayListImpOfStack arrayListStack = new ArrayListImpOfStack();
        arrayListStack.push(10);
        arrayListStack.push(20);
        arrayListStack.push(30);
        System.out.println(arrayListStack.peek());
        System.out.println(arrayListStack.size());
        System.out.println(arrayListStack.isEmpty());
        System.out.println(arrayListStack.contains(20));
    }
}
