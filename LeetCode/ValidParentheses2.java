package LeetCode;

import java.util.Stack;

public class ValidParentheses2 {
    public static void main(String[] args) {
        String s = "()";
        boolean result = validParentheses(s);
        System.out.println(result);

        String s2 = "()[]{}";
        boolean result2 = validParentheses(s2);
        System.out.println(result2);

        String s3 = "(]";
        boolean result3 = validParentheses(s3);
        System.out.println(result3);

        String s4 = "([])";
        boolean result4 = validParentheses(s4);
        System.out.println(result4);
    }

    public static boolean validParentheses(String s){
        String op = "({[";
        String clo = ")}]";
        Stack<Character> st = new Stack<>();
        char[] c = s.toCharArray();
        for(char p: c){
            if(op.indexOf(p) != -1){
                st.push(p);
            } else if(clo.indexOf(p) != -1){
                if(st.isEmpty()){
                    return false;
                } else if(clo.indexOf(p) != op.indexOf(st.pop())){
                    return false;
                }
            }
        }
        return st.isEmpty();
    }
}
