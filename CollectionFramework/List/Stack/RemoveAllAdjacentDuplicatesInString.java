package CollectionFramework.List.Stack;

import java.util.Stack;

//Leetcode: 1047
public class RemoveAllAdjacentDuplicatesInString {
    public static void main(String[] args) {
        String s = "abbaca";

        //creating stack
        Stack<Character> remDup = new Stack<>();
        //loop
        for (int i=0;i<s.length();i++){
            //string to char
            char c = s.charAt(i);
            if (!remDup.isEmpty() && remDup.peek() == c) {
                remDup.pop();
            } else {
                remDup.push(c);
            }
            //   remDup.push(c); //putting characters into the CollectionFramework.List.Stack 'remDup'
        }
        System.out.println(remDup);
        StringBuilder result = new StringBuilder();
        while (!remDup.isEmpty()) {
            result.insert(0, remDup.pop());
        }

        String outputString = result.toString();
        System.out.println(outputString);
    }
}
