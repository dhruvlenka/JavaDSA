package CollectionFramework.List.Stack;

import java.util.Stack;

public class RemoveOutermostParentheses {
    public static void main(String[] args) {
        String s = "(()())(())";
        System.out.println(s);

        Stack<Character> removeParentheses = new Stack<>();
        StringBuilder ans = new StringBuilder();
        for(int i=0;i<s.length();i++){
        //    char c = s.charAt(i);
            if(s.charAt(i)=='('){
                if(removeParentheses.size()>0){
                    ans.append(s.charAt(i));
                }
                removeParentheses.push(s.charAt(i));
            }else{
                removeParentheses.pop();
                if(removeParentheses.size()>0){
                    ans.append(s.charAt(i));
                }
            }
        }
        System.out.println(removeParentheses);
        System.out.println(ans);
    }
}
