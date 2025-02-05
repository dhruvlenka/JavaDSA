package GFGArray;

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElement {
    public static void main(String[] args) {
        long[] array = {5,3,10,10,15,25};
        int n = array.length;
        long[] result = nextGreaterElement(array, n);
        System.out.println(Arrays.toString(result));

        long[] array2 = {1,3,3,4};
        int n2 = array2.length;
        long[] result2 = nextGreaterElement(array2,n2);
        System.out.println(Arrays.toString(result2));

        long[] array3 = {6,8,0,1,3};
        int n3 = array3.length;
        long[] result3 = nextGreaterElement(array3, n3);
        System.out.println(Arrays.toString(result3));


    }

    //CollectionFramework.List.Stack follow last in first out (LIFO)
    // push(element):
    // pop(): removes and returns the element at the top of the stack.
    // peek(): return the top element of the stack
    //size(): size of the stack

    public static long[] nextGreaterElement(long[] arr, int n){
        long[] result = new long[n];
        Stack<Integer> stack = new Stack<>();

        //loop from right side (reverse)
        for(int i = n-1; i>=0; i--){
            while (!stack.isEmpty() && arr[i] >= arr[stack.peek()]){
                System.out.println(stack.pop());
            }
            if (stack.isEmpty()){
                result[i] = -1;
            } else {
                result[i] = arr[stack.peek()];
            }
            stack.push(i);
        }
        return result;
    }
}
