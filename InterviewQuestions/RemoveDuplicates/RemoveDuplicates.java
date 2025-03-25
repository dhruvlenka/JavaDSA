package InterviewQuestions.RemoveDuplicates;

import java.util.ArrayList;
import java.util.HashSet;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String s = "abcadeecfb";
        System.out.println(removeDuplicates(s));

    }
    public static String removeDuplicates(String str) {
        ArrayList<Character> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for(char ch: str.toCharArray()){
            if(!list.contains(ch)){
                sb.append(ch);
                list.add(ch);
            }
        }
        return sb.toString();
    }
}
