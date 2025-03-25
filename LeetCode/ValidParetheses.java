package LeetCode;

import java.util.Stack;

public class ValidParetheses {
    public static void main(String[] args) {
        String example1 = "()";
        boolean result = isValid(example1);
        System.out.println(result);

        String example2 = "()[]{}";
        boolean result2 = isValid(example2);
        System.out.println(result2);

        String example3 = "(]";
        boolean result3 = isValid(example3);
        System.out.println(result3);

        String example4 = "{[()]}";
        boolean result4 = isValid(example4);
        System.out.println(result4);
    }
    public static boolean isValid(String s) {
        //Why CollectionFramework.List.Stack because in this code we need LIFO (Last In First Out)
        Stack<Character>  valid = new Stack<>();
        for(char c: s.toCharArray()){
            if(c == '('){
                valid.push(')');
            }
            else if(c == '{'){
                valid.push('}');
            }
            else if(c == '['){
                valid.push(']');
            }
            else if(s.isEmpty() || valid.pop() != c){
                return false;
            }
        }
        return valid.isEmpty();
    }
}
