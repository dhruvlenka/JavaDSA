package Recursion;

import java.util.ArrayList;
import java.util.Collections;

public class PermutationString {
    public static void swap(char[] chars, int i, int j){
       char temp = chars[i];
       chars[i] = chars[j];
       chars[j] = temp;
    }

    public static void solve(char[] chars, int index, ArrayList<String>ans){
        if(index == chars.length-1){
            ans.add(new String(chars));
            return;
        }
        for(int i = index; i<chars.length; i++){
            swap(chars, index, i);
            solve(chars, index+1, ans);
            //backtracking: for consistent state
            swap(chars, index, i);
        }
    }
    public static void main(String[] args) {
        String s = "abc";
        ArrayList<String> res = new ArrayList<>();
        System.out.println(generatePermutations(s));
    }
    public static ArrayList<String> generatePermutations(String str) {
        // Write your code here
        ArrayList<String> result = new ArrayList<>();
        solve(str.toCharArray(), 0, result);
        Collections.sort(result);
        return result;
    }
}
