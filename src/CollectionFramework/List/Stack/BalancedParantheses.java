package CollectionFramework.List.Stack;

import java.util.Stack;

public class BalancedParantheses {
    public static boolean matching(char a,char b){
        return (( a=='(' && b==')' )||( a=='[' && b==']' )||( a=='{' && b=='}' ));
    }

    public static boolean isBalanced(String str) {
        Stack<Character> s = new Stack<Character>();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(' || str.charAt(i) == '[' || str.charAt(i) == '{') {
                s.add(str.charAt(i));
            } else {
                if (s.isEmpty() == true)
                    return false;
                else if (matching(s.peek(), str.charAt(i)) == false)
                    return false;
                else
                    s.pop();
            }
        }
        return (s.isEmpty() == true);
    }
        public static void main(String[] args) {
        String str = "{()}[]";

        if (isBalanced(str))
            System.out.print("Balanced");
        else
            System.out.print("Not Balanced");

    }
}
