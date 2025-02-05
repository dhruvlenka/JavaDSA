package CollectionFramework.List.Stack;

import java.util.Stack;
public class StackLearn {
    public static void main(String[] args) {
        Stack<String> movies = new Stack<>();
        //.push(): add elements in stack
        movies.push("Avengers");
        movies.push("Batman");
        movies.push("CatWomen");
        System.out.println("Adding using .push(): " + movies);

        ///.add(): we can also use this method for adding the elements in the stack.
        movies.add("Dracula");
        movies.add("Elysium");
        movies.add("Fast and Furious");
        System.out.println("Adding using .add(): " + movies);
        System.out.println();

        /*
        .pop(): will remove elements from the stack
                work like: pile of plates
        Fast and Furious will remove because Fast and Furious
        comes lastly, but it will remove firstly.
         */
        System.out.println("Removing using .pop():  " + movies.pop());
        System.out.println("Now the CollectionFramework.List.Stack is: " + movies);

        //.peek()
        System.out.println(movies.peek());
        System.out.println(movies);
        System.out.println();

        //methods you already used in ArrayList etc, you can also use here
        //CollectionFramework.List.Stack 2
        Stack<Character> CHAR = new Stack<>();
        CHAR.push('D');
        CHAR.push('A');
        CHAR.push('H');
        CHAR.push('G');
        System.out.println(CHAR);
        System.out.println(CHAR.pop());
        System.out.println(CHAR);

        //methods
        System.out.println(CHAR.empty()); //false
        System.out.println(CHAR.contains('D')); //true
        System.out.println(CHAR.size());
        System.out.println(CHAR.indexOf('A')); //1
        System.out.println(CHAR.search('A')); //true
        System.out.println(CHAR.isEmpty()); //false
        System.out.println(CHAR.lastElement());
        System.out.println(CHAR.get(0)); //D
        System.out.println(CHAR.set(2,'A'));
        System.out.println(CHAR);
    }
}
