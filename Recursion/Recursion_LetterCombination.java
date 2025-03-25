package Recursion;

import java.util.ArrayList;

public class Recursion_LetterCombination {
    static void solve(String digits, StringBuilder output, int index, ArrayList<String> ans, String[] mapping){
        //base case
        if(index >= digits.length()){
            ans.add(output.toString());
            return;
        }
        //index which points a number
        int number = digits.charAt(index) - '0';
        //mapping value
        String value = mapping[number];

        for(int i=0; i<value.length(); i++){
            output.append(value.charAt(i));
            solve(digits, output, index+1, ans, mapping);
            //backtracking: removing earlier element: 'a'
            /*
             we added 'a' in this line: output.append(value.charAt(i));
             when we go back after all calls we delete them the output: 'a'
             what we added previously.

             */
            output.deleteCharAt(output.length()-1);
        }

    }
    public static ArrayList<String> letterCombinations(String digits) {
        ArrayList<String> ans = new ArrayList<>();
        if(digits == null || digits.length() == 0){
            return ans;
        }

        StringBuilder output = new StringBuilder();
        int index = 0;
        String[] mapping = {"", "", "abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        solve(digits, output, index, ans, mapping);
        return ans;
    }

    public static void main(String[] args) {
        String s = "23";
        System.out.println(letterCombinations(s));
    }
}
