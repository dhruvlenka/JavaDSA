package Recursion;

import java.util.ArrayList;

public class Recursion_Subsequences {
    static ArrayList<String> subsequenceSolve(String str, String output, int index, ArrayList<String> ans){
        //base case
        if(index >= str.length()){
            if(output.length() > 0){
                ans.add(output);
            }
            return ans;
        }

        //excluding
        subsequenceSolve(str, output, index+1, ans);

        // including
        char element = str.charAt(index);
        subsequenceSolve(str, output+element, index+1, ans);

        return ans;
    }

    public static ArrayList<String> subsequences(String str) {
        // Write your code here
        ArrayList<String> ans = new ArrayList<>();
        String output = "";
        int index = 0;
        return subsequenceSolve(str, output, index, ans);

    }

    public static void main(String[] args) {

    }
}
