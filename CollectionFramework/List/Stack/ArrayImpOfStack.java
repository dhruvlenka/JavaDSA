package CollectionFramework.List.Stack;

//Array Implementation of CollectionFramework.List.Stack
public class ArrayImpOfStack {
    int[] arr;
    int cap; //size of the stack
    int top; //keeping track of index of top item, top = -1
              //constructor
    ArrayImpOfStack(int c){
        top = -1;
        cap = c; //c: size of the array provided by the user
        arr = new int [cap];

    }

    //CollectionFramework.List.Stack push method
    void push(int x){
        if(top == -1){
            //means it's empty and it will stop overflow condition
            System.out.println("Sorry, CollectionFramework.List.Stack is Full ");
        }
        if(top == cap-1){
            System.out.println("CollectionFramework.List.Stack is full");
            return;
        }
        top++;
        arr[top] = x;
    }

    //CollectionFramework.List.Stack pop method
    int pop(){
        if(top == -1){
            //this if block will stop underflow condition.
            System.out.println("Sorry, CollectionFramework.List.Stack is already empty.");
        }
        if(top == -1){
            System.out.println("CollectionFramework.List.Stack is Empty");
            return Integer.MIN_VALUE;
        }
        //storing the top element in the new variable
        int res = arr[top];
        top--;
        return res;
    }

    //CollectionFramework.List.Stack peek method
    int peek(){
        if(top == -1 ){
            System.out.println("You can't call peek on empty stack.");
        }
        if(top == -1){
            System.out.println("CollectionFramework.List.Stack is Empty");
            return Integer.MIN_VALUE;
        }
        return arr[top];
    }

    //CollectionFramework.List.Stack size method
    int size(){
        return (top+1);
    }

    //CollectionFramework.List.Stack isEmpty method
    boolean isEmpty(){
        return top == -1;
    }

    public static void main(String[] args) {
        ArrayImpOfStack arrayStack = new ArrayImpOfStack(5);
        arrayStack.push(5);
        arrayStack.push(10);
        arrayStack.push(20);

        //printing the stack
        for (int i = 0; i < arrayStack.size(); i++) {
            System.out.println(arrayStack.arr[i]);
        }

        System.out.println(arrayStack.pop());
        System.out.println(arrayStack.size());
        System.out.println(arrayStack.peek());
        System.out.println(arrayStack.isEmpty());

    }
}
