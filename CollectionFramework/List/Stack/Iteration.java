package CollectionFramework.List.Stack;

import java.util.Stack;

public class Iteration {
    public static void main(String[] args) {
        Stack<Integer> numbers = new Stack<>();
        numbers.push(10);
        numbers.push(20);
        numbers.push(30);
        numbers.add(40);
        numbers.add(50);
        System.out.println(numbers);

        System.out.println("Iteration using For Loop");
        //Iteration using For Loop
        for(int i=0; i<numbers.size(); i++){
            System.out.println(numbers.get(i));
        }

        System.out.println("Iteration using Enhanced For Loop");
        //Iteration using Enhanced For Loop
        for(int num: numbers){
            System.out.println(num);
        }
    }
}
