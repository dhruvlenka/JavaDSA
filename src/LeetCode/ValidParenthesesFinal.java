package LeetCode;

import java.util.Stack;

public class ValidParenthesesFinal {
    public static void main(String[] args) {
        String example = "{[()]}";
        boolean result = validParentheses(example);
        System.out.println(result);
    }
    public static boolean validParentheses (String s){
        Stack<Character> valid = new Stack<>();
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '(' || s.charAt(i) == '[' ||  s.charAt(i) == '{'){
                valid.push(s.charAt(i));
            } else {
                if(s.isEmpty() == true)
                    return false;
                    else if(matching(valid.peek(), s.charAt(i))==false)
                        return false;
                    else
                        valid.pop();
            }
        }
        return (valid.isEmpty());
    }
    public static boolean matching(char a, char b){
        return (( a=='(' && b==')' )||( a=='[' && b==']' )||( a=='{' && b=='}' ));
    }
}
